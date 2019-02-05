public class MyLinkedList {

    private Node head;

    public static class Node {

        private int data;
        private Node next;                          // ref. to another node

        public Node() {
            this.next = null;
        }
    }


    public void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {             // check which is the last element
                temp = temp.next;                   // jump to next node (reference)
            }
            temp.next = newNode;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);          // print value from list
            node = node.next;                       // jump to next node
        }
        System.out.println(node.data);              // print the last node value
    }

    public void insertAtStart(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node temp = head;
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;                   // jump to next node (at index 1)
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            Node temp1 = null;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp1 = temp.next;
            temp.next = temp1.next;
            temp1 = null;                           // set references to an object to null so that it becomes eligible for garbage collection
        }
    }

    public void removeValue(int data) {
        if (head.data == data) {
            head = head.next;
        } else {
            Node prevNode = null;
            Node temp = head;
            while (temp.data != data) {
                prevNode = temp;
                temp = temp.next;
            }
            prevNode.next = temp.next;
            temp = null;
        }
    }


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertAtEnd(5);
        myLinkedList.insertAtEnd(8);
        myLinkedList.insertAtEnd(300);

        myLinkedList.insertAtStart(300);

        myLinkedList.insertAt(0, 150);

        //myLinkedList.deleteAt(2);

        myLinkedList.removeValue(150);

        myLinkedList.show();
    }
}
