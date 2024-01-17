public class SinglyLinkedList {

    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void addToFront(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtPosition(int position, Object data) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position.");
        }

        Node newNode = new Node(data);
        if (position == 0) {
            // Insert at the front.
            newNode.next = head;
            head = newNode;
        } else {
            // Insert at a position between front and end.
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public void addToEnd(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public Object removeFromFront() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }
        Object removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



    private static class Node{
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
