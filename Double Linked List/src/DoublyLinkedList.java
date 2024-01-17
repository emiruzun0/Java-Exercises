public class DoublyLinkedList {

    private Node head;   // Points to the first node (head) in the list.
    private Node tail;   // Points to the last node (tail) in the list.
    private int size;    // Stores the number of nodes in the list (size of the list).



    // Constructor to initialize an empty doubly linked list
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the number of elements in the list
    public int getSize() {
        return size;
    }


    // Method to add a new node with data to the front of the list
    public void addToFront(Object data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Method to add a new node with data to the end of the list
    public void addToEnd(Object data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to remove and return the node at the front of the list
    public Object removeFromFront() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }
        Object removedData = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedData;
    }

    // Method to remove and return the node at the end of the list
    public Object removeFromEnd() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }
        Object removedData = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return removedData;
    }

    // Method to display the elements of the list in forward order
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to display the elements of the list in reverse order
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Optional method: Check if the list contains a specific data value
    public boolean contains(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Optional method: Insert data at a specified position in the list
    public void insertAtPosition(int position, Object data) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position.");
        }

        if (position == 0) {
            addToFront(data);
        } else if (position == size) {
            addToEnd(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    // Optional method: Remove the first occurrence of a specific data value
    public void remove(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    removeFromFront();
                } else if (current == tail) {
                    removeFromEnd();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    size--;
                }
                return;
            }
            current = current.next;
        }
    }

    private static class Node{
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
