package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));
        mapa.put("Gere", df.parse("LIPIEC 1 2020"));
        mapa.put("Stone", df.parse("SIERPIEŃ 1 1980"));
        mapa.put("Roberts", df.parse("WRZESIEŃ 1 1999"));
        mapa.put("Swaze", df.parse("PAŹDZIERNIK 1 2000"));
        mapa.put("Lee", df.parse("LISTOPAD 1 2001"));
        mapa.put("Schwarzeneger", df.parse("GRUDZIEŃ 1 2002"));
        mapa.put("Van Damme", df.parse("STYCZEŃ 30 1980"));
        mapa.put("Polański", df.parse("LUTY 1 2003"));
        mapa.put("Kwiatkowska", df.parse("MARZEC 1 2004"));
        return mapa;
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        Iterator<Map.Entry<String, Date>> iterator = mapa.entrySet().iterator();
        HashSet<String> set = new HashSet<>();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> next = iterator.next();
            String key = next.getKey();
            Date date = next.getValue();
            if (date.getMonth() >= 5 && date.getMonth() <=7)
                set.add(key);
        }
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            mapa.remove(iterator2.next());
        }
//        Iterator<Map.Entry<String, Date>> iterator1 = mapa.entrySet().iterator();
//        while (iterator1.hasNext()) {
//            Map.Entry<String, Date> next = iterator1.next();
//            System.out.println(next);
//        }
    }

    public static void main(String[] args) throws ParseException {
//        HashMap<String, Date> map = new HashMap<>(utworzMap());
//        usunUrodzonychLatem(map);

    }
}
