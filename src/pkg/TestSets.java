package pkg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSets {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Maira");
        names.add("Maira");
        names.add("Steve");
        names.add("Chris");
        names.add("Eleni");

        for (String s: names) {
            System.out.println(s);
        }
    }
}
