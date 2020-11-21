package pl.codegym.task.task20.task2014;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializowane rozwiązanie
*/

public class Solution implements Serializable {

    public static void main(String[] args) {
        System.out.println(new Solution(4));
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Dziś jest %s, aktualna temperatura wynosi %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
