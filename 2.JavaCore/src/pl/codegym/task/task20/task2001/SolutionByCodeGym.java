package pl.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Piotr on 2020-11-18
 */
public class SolutionByCodeGym {
    public static void main(String[] args) {
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Solution.Human smith = new Solution.Human("Smith", new Asset("dom", 999_999.99), new Asset("samochód", 2999.99));
            smith.save(outputStream);
            outputStream.flush();

            Solution.Human somePerson = new Solution.Human();
            somePerson.load(inputStream);
            inputStream.close();

            System.out.println(smith.equals(somePerson));
        } catch (IOException e) {
            System.out.println("Oops, coś jest nie tak z moim plikiem");
        } catch (Exception e) {
            System.out.println("Oops, coś jest nie tak z metodą save/load");
        }
    }

    public static class Human {

        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Solution.Human human = (Solution.Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(this.name);
            if (this.assets.size() > 0) {
                for (Asset current : this.assets) {
                    printWriter.println(current.getName());
                    printWriter.println(current.getPrice());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            this.name = reader.readLine();
            while (reader.ready()) {
                String assetName = reader.readLine();
                double assetPrice = Double.parseDouble(reader.readLine());
                this.assets.add(new Asset(assetName, assetPrice));
            }
            reader.close();
        }
    }
}
