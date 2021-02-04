package pkg;

/**
 * This class demonstrates a simple use of the Course Object and its methods
 */
public class Main {
    public static void main(String[] args) {

	 Course a = new Course("ITC3260", "RDBMS");
     System.out.println(a);

     a.setProfessor("Kotsovoulou");

     System.out.println(a); //This there is a "toString()" method in Course, it will be used
     System.out.println(a.getCourse_name());
    }
}
