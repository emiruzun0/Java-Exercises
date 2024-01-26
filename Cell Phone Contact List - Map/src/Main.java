import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactListInterface contactList = new CellPhoneContactList();

        System.out.println("Welcome to the Cell Phone Contact List!\n");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove an existing contact");
            System.out.println("3. Search for contacts by name");
            System.out.println("4. Display all contacts");
            System.out.println("5. Quit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact(contactList, scanner);
                    break;
                case 2:
                    removeContact(contactList, scanner);
                    break;
                case 3:
                    searchContact(contactList, scanner);
                    break;
                case 4:
                    displayAllContacts(contactList);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact(ContactListInterface contactList, Scanner scanner) {
        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the phone number(s) for " + name + " (comma-separated): ");
        String[] phoneNumbers = scanner.nextLine().split(",");

        for (String phoneNumber : phoneNumbers) {
            contactList.addContact(name.trim(), phoneNumber.trim());
        }
        System.out.println("Contact added: " + name);
    }

    private static void removeContact(ContactListInterface contactList, Scanner scanner) {
        System.out.print("Enter the contact name to remove: ");
        String name = scanner.nextLine();
        contactList.removeContact(name);
        System.out.println("Contact removed: " + name);
    }

    private static void searchContact(ContactListInterface contactList, Scanner scanner) {
        System.out.print("Enter the contact name to search: ");
        String name = scanner.nextLine();
        List<String> phoneNumbers = contactList.searchContact(name);

        if (!phoneNumbers.isEmpty()) {
            System.out.println("Phone numbers for " + name + ": " + phoneNumbers);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayAllContacts(ContactListInterface contactList) {
        System.out.println("All contacts:");
        Map<String, List<String>> allContacts = contactList.getAllContacts();

        for (Map.Entry<String, List<String>> entry : allContacts.entrySet()) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }
}
