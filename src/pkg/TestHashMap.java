package pkg;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        HashMap<String, Course> catalog = new HashMap<String, Course>();
        Course a = new Course("ITC3234A1", "OOP", 3, "Kotsovoulou");
        Course b = new Course ("ITC3260", "RDBMS", 3, "Christou");
        Course a2 = new Course("ITC3234B1", "OOPqqq", 3, "Vagianou");
        catalog.put("ITC3234", a);
        catalog.put("ITC3260", b);
        catalog.put("ITC3234", a2);

        System.out.println(catalog.get("ITC3260"));
        System.out.println(catalog.get("ITC3234"));

        HashMap<Integer, String> demo = new HashMap<>();

        demo.put(2, "Hello");
        demo.put(1, "Morning");
        demo.put(5, "Night");
        demo.put(4, "Evening");
        demo.remove(2);

        System.out.println(demo.get(24));

        //Using EntrySet
        for (Map.Entry<Integer, String> entry : demo.entrySet()) {
            if (entry.getValue().contains("o")) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        //Using Lamdas
        demo.forEach((k, v) -> System.out.println((k + ": " + v)));


        //Using StreamAPI
        demo.entrySet().stream().forEach(e ->
                System.out.println(e.getKey() + ": " + e.getValue())
        );
    }
}
