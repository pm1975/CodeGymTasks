package pl.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        HashSet<Integer> set1 = new HashSet<>(set);
        for (Integer integer : set1) {
            if (integer > 10) {
                set.remove(integer);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = utworzSet();
        HashSet<Integer> set2  = usunLiczbyWiekszeNiz10(set);
    }
}
