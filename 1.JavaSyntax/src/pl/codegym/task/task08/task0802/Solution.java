package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("arbuz", "melon");
        map.put("kantalupa", "melon");
        map.put("banan", "owoc");
        map.put("wiśnia", "owoc");
        map.put("gruszka", "owoc");
        map.put("jeżyna", "owoc");
        map.put("truskawka", "owoc");
        map.put("żeńszeń", "korzeń");
        map.put("irys", "kwiat");
        map.put("ziemniak", "bulwa");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

}
