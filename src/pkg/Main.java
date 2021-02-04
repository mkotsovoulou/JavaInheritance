package pkg;

public class Main {
    public static void main(String[] args) {
	 Course a = new Course("ITC3260", "RDBMS");
     System.out.println(a);

     a.setProfessor("Kotsovoulou");

     System.out.println(a);
     System.out.println(a.getCourse_name());
    }
}
