import java.util.List;
import java.util.Map;

public interface ContactListInterface {
    void addContact(String name, String phoneNumber);
    void removeContact(String name);
    List<String> searchContact(String name);
    Map<String, List<String>> getAllContacts();
}