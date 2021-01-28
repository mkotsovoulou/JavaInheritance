public class Tester {

    public static void main (String args[]){
        Contact c1 = new Contact();  //Instantiation
        Contact c2 = new Contact("Maira","mkots@acg.edu", "312321545");
        Contact c3 = new Contact("Manos","9089897867");
        ContactWithAddress ca1 = new ContactWithAddress("Manos", "m@m.com", null, "gravias 6", "Agia Paraskevi", "12354", "GR");

        System.out.println(ca1.getEmail());
        System.out.println(ca1);


        c1.setName("Maira");
        c1.setPhoneNumber("432432324");
        c1.setEmail("mkotsovoulou@acg.edu");

        c2.setPhoneNumber("2108928343");
        System.out.println(c1);

        System.out.println("Using ContactsManager");

        ContactsManager friends = new ContactsManager();
        System.out.println(friends.addContact(c1));
        friends.addContact(c2);
        friends.addContact(c3);
        System.out.println(friends);

        String result = friends.searchContact("Ni");
        System.out.println(result);

        //Method Overloading
        c1.test();
        c1.test(10);
        c1.test(30,40);

    }

}
