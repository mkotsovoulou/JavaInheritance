package pkg;

import java.util.LinkedList;

public class testLinkedLists {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Maira");
        names.add("Chris");
        names.add("Eleni");
        names.addFirst("Nick");
        names.addFirst("Mitsos");
        names.add("Eleni");
        names.add(3, "xxx");

        for (String n: names) {
            System.out.println(n);
        }

    }
}
