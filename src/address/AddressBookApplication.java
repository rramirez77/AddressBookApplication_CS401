package address;

import address.data.addressBook;
import address.data.addressEntry;

public class AddressBookApplication {

    public static void main(String[] args) {
        //create instance of menu
        Menu myMenu = new Menu();

        //create instance of address book
        addressBook ab = new addressBook();

        // Call AddressBook method to add an entry into the address book
        initAddressBookExercise(ab);

        //Display to standard output all the Menu prompts
        System.out.println(myMenu.prompt_FirstName());
        System.out.println(myMenu.prompt_LastName());
        System.out.println(myMenu.prompt_Street());
        System.out.println(myMenu.prompt_City());
        System.out.println(myMenu.prompt_State());
        System.out.println(myMenu.prompt_Zip());
        System.out.println(myMenu.prompt_Telephone());
        System.out.println(myMenu.prompt_Email());
    }

    // Adds an entry into the address book
    static void initAddressBookExercise(addressBook ab){
        addressEntry entry1, entry2;
        entry1 = new addressEntry("Romano", "Ramirez", "123 ABC Street", "Richmond", "CA",
                94806, "123456789", "rramirez77@horizon.csueastbay.edu");
        entry2 = new addressEntry("James", "Sunderland", "1440 Bradbury St.", "South Ashfield", "PA",
                19099, "989764001", "james.sunderland@yahoo.com");

        ab.add(entry1);
        ab.add(entry2);
        ab.list();
    }
}
