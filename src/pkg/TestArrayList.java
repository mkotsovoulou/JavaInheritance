package pkg;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        Course a = new Course("ITC3234", "OOP", 3, "Kotsovoulou");
        Course b = new Course ("ITC3260", "RDBMS", 3, "Christou");

        Course[] catalog2 = new Course[10];
        catalog2[0]=a;
        catalog2[1]=b;
        for (int i=0; i<catalog2.length; i++) {
            System.out.println(catalog2[i]);
        }

        ArrayList<Course> catalog = new ArrayList<Course>();
        catalog.add(a);
        System.out.println(catalog.contains(a));
        catalog.add(b);
        catalog.add(b);
        catalog.add(b);
        /* enganced for loop : For each Course called c in the catalog array list*/
        for (Course c : catalog) {
            System.out.println(c);
        }

        /* Loop through the arraylist by retrieving the Courses using their index or position in the array */
        for (int i=0; i<catalog.size(); i++) {
            System.out.println(i + " " + catalog.get(i));
        }


    }
}
