public class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    public int addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
        return friendsCount;
    }

    @Override
    public String toString() {
        String output="Contacts List\n";
        output+= "-----------------\n";
        for (int i=0; i < friendsCount; i++ ) {
            output+= myFriends[i].getName() + " " + myFriends[i].getPhoneNumber() + " " + myFriends[i].getEmail() +"\n";
        }
        return output;
    }

    //Utility Methods to perform some tasks!!!
    public String searchContact(String nameToSearch) {
        String result="";
        for (int i=0; i < friendsCount; i++ ) {
            if ((myFriends[i].getName()).startsWith(nameToSearch))
                result += myFriends[i].getName() + " " + myFriends[i].getPhoneNumber() + "\n";

        }
        if (result.length()==0)
            return "Name not found";
        else
            return result;
    }

}
