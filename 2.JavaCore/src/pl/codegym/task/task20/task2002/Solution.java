package pl.codegym.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* 
Odczytywanie i zapisywanie do pliku: CodeGym
*/

public class Solution {

    public static void main(String[] args) {
        // Plik your_file_name.tmp znajdziesz w swoim folderze plików tymczasowych, ewentualnie dostosuj outputStream/inputStream do rzeczywistej lokalizacji pliku
        try {
            //File yourFile = File.createTempFile("your_file_name", null);
            File yourFile = new File("files/20/2002.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            User user = new User();
            user.setFirstName("Piotr");
            user.setLastName("Mierniczak");
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("1975-08-25");
            user.setBirthDate(date);
            user.setMale(true);
            user.setCountry(User.Country.OTHER);
            codeGym.users.add(user);
            // Inicjalizuj tutaj pole users dla obiektu codeGym
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Sprawdź tutaj, czy obiekt codeGym jest taki sam jak obiekt loadedObject
            System.out.println(loadedObject.equals(codeGym));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, coś jest nie tak z moim plikiem");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, coś jest nie tak z metodą save/load");
        }
    }

    public static class CodeGym {

        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            if (users.size() > 0) {
                for (User user : this.users) {
                    StringBuilder builder = new StringBuilder();
                    builder.append(user.getFirstName());
                    builder.append("/");
                    builder.append(user.getLastName());
                    builder.append("/");
                    builder.append(user.getBirthDate().getTime());
                    builder.append("/");
                    builder.append(user.isMale());
                    builder.append("/");
                    builder.append(user.getCountry());
                    builder.append("/");
                    writer.println(builder.toString());
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split("/");
                if (split.length < 5) break;
                User user = new User();
                user.setFirstName(split[0]);
                user.setLastName(split[1]);
                user.setBirthDate(new Date(Long.parseLong(split[2])));
                user.setMale(Boolean.parseBoolean(split[3]));
                switch (split[4]) {
                    case "UNITED_STATES":
                        user.setCountry(User.Country.UNITED_STATES);
                        break;
                    case "UNITED_KINGDOM":
                        user.setCountry(User.Country.UNITED_KINGDOM);
                        break;
                    default:
                        user.setCountry(User.Country.OTHER);
                        break;
                }
                this.users.add(user);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return Objects.equals(users, codeGym.users);
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
