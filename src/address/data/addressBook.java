package address.data;

import java.util.ArrayList;

/**
 * AddressBook is a class that creates a list of address entries and adds new entries
 */
public class addressBook {
    /**
     * collection variable to store set of AddressEntry objects that are currently in Address Book
     */
    private ArrayList<addressEntry> addressEntryList = new ArrayList<addressEntry>();

    /**
     * Goes through AddressEntryList and prints
     * all entries in list
     */
    public void list() {
        for (int i = 0; i < addressEntryList.size(); i++) {
            System.out.print(addressEntryList.get(i));
        }
    }

    /**
     * Adds a new entry to AddressEntryList
     * @param newEntry new entry to add to the list
     */
    public void add(addressEntry newEntry){
        addressEntryList.add(newEntry);
    }
}
