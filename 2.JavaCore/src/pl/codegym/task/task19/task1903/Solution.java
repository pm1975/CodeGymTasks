package pl.codegym.task.task19.task1903;

/* 
Dostosowywanie wielu interfejsów
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraina");
        countries.put("US", "Stany Zjednoczone");
        countries.put("FR", "Francja");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            return String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(),
                    String.format("%010d", data.getPhoneNumber()).substring(0, 3),
                    String.format("%010d", data.getPhoneNumber()).substring(3, 6),
                    String.format("%010d", data.getPhoneNumber()).substring(6, 8),
                    String.format("%010d", data.getPhoneNumber()).substring(8));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // Na przykład: US

        String getCompany();            // Na przykład: CodeGym Ltd.

        String getContactFirstName();   // Na przykład: John

        String getContactLastName();    // Na przykład: Smith

        int getCountryPhoneCode();      // Na przykład: 1

        int getPhoneNumber();           // Na przykład: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // Na przykład: CodeGym Ltd.

        String getCountryName();        // Na przykład: Stany Zjednoczone
    }

    public static interface Contact {
        String getName();               // Na przykład: Smith, John

        String getPhoneNumber();        // Na przykład: +1(099)123-45-67
    }
}