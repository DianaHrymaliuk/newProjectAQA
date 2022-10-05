package lesson8;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "apple", "orange", "strawberry",
                "strawberry", "blueberry", "mango", "mango", "chery", "peach", "banana"));
        System.out.println("All words in array:" + list.toString());
        Set<String> list2 = new HashSet<String>(list);
        System.out.println("Array without duplicates:" + list2.toString());
        for (String word : list2) {
            int a = Collections.frequency(list, word);
            System.out.println(a + " - " + word);
        }
    }
}
