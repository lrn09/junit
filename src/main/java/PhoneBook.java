import java.util.*;

public class PhoneBook {

    public PhoneBook() {
    }

    private Map<String, ArrayList<Contact>> listHashMap = new HashMap<>();

    public void addGroup(String s) {
        listHashMap.put(s, new ArrayList<>());
    }

    public void addContactToGroup(String s, Contact contact) {
        listHashMap.get(s).add(contact);
    }

    public ArrayList<Contact> findContactByGroup(String s) {

        return listHashMap.get(s);

    }

    public Contact findContactByNumber(String number) {
        Contact searchingContact = null;
        Collection<ArrayList<Contact>> groups = listHashMap.values();
        for (List<Contact> group : groups) {
            for (Contact contact : group) {
                if (contact.getPhoneNumber().equals(number)) {
                    searchingContact = contact;
                }
            }

        }
        return searchingContact;
    }

    public Map<String, ArrayList<Contact>> getListHashMap() {
        return listHashMap;
    }

    public void toString(ArrayList<Contact> list) {
        for (Contact contact : list) {
            System.out.println(contact);

        }

    }

}


