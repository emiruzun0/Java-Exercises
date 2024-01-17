public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        myList.addToFront(3);
        myList.addToFront(2);
        myList.addToFront(1);

        System.out.print("List after adding to front: ");
        myList.displayList();

        myList.removeFromFront();
        System.out.print("List after removing from front: ");
        myList.displayList();

        myList.addToEnd(4);
        System.out.print("List after adding to end: ");
        myList.displayList();

        myList.insertAtPosition(1, 2.5); // Insert 2.5 between 1 and 2
        System.out.print("List after insertion at position 1: ");
        myList.displayList();

        myList.insertAtPosition(3, 3.5); // Insert 3.5 between 2 and 3
        System.out.print("List after insertion at position 3: ");
        myList.displayList();
    }
}
