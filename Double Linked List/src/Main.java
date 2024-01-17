public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.addToFront(3);
        myList.addToFront(2);
        myList.addToFront(1);

        System.out.print("List after adding to front: ");
        myList.displayForward();

        myList.removeFromFront();
        System.out.print("List after removing from front: ");
        myList.displayForward();

        myList.addToEnd(4);
        System.out.print("List after adding to end: ");
        myList.displayForward();

        myList.insertAtPosition(1, 2.5); // Insert 2.5 between 1 and 2
        System.out.print("List after insertion at position 1: ");
        myList.displayForward();

        myList.insertAtPosition(3, 3.5); // Insert 3.5 between 2 and 3
        System.out.print("List after insertion at position 3: ");
        myList.displayForward();

        myList.remove(2.5); // Remove the first occurrence of 2.5
        System.out.print("List after removing 2.5: ");
        myList.displayForward();

        System.out.println("List contains 3.5: " + myList.contains(3.5));
        System.out.println("List contains 2.5: " + myList.contains(2.5));
    }
}
