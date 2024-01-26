import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CellPhoneContactList implements ContactListInterface {
    private Map<String, List<String>> contactList;

    public CellPhoneContactList() {
        contactList = new HashMap<>();
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        if (!contactList.containsKey(name)) {
            contactList.put(name, new ArrayList<>());
        }
        contactList.get(name).add(phoneNumber);
    }

    @Override
    public void removeContact(String name) {
        contactList.remove(name);
    }

    @Override
    public List<String> searchContact(String name) {
        return contactList.getOrDefault(name, new ArrayList<>());
    }

    @Override
    public Map<String, List<String>> getAllContacts() {
        return contactList;
    }
}
