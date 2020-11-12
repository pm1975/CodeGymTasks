package pl.codegym.task.task19.task1905;

/**
 * Created by Piotr on 2020-11-10
 */
public class test {
    public static void main(String[] args) {
        String str1 = "a 1 bc 2 def 3 gh456";
        String str2 = str1.replaceAll("\\d", "");
        System.out.println(str2);

        String str3 = str1.replaceAll("\\D", "");
        System.out.println(str3);
    }
}
