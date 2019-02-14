import java.util.ArrayList;

public class MyLinkedList {

    private Node head;

    public static class Node {

        private int data;
        private Node next;

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
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void show(Node head) {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public ArrayList nodeData2List() {
        Node node = head;
        ArrayList dataList = new ArrayList();
        while (node != null) {
            dataList.add(node.data);
            node = node.next;
        }
        return dataList;
    }

    public void showReversed() {
        ArrayList dataList = nodeData2List();
        for (int i = dataList.size() - 1; i >= 0; i--) {
            System.out.println(dataList.get(i));
        }
    }

    public Node reverse() {
        Node prev = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
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
                temp = temp.next;
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
            temp1 = null;
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

    public static boolean compareLists(Node head1, Node head2) {
        boolean flag = false;
        int maxIndex1 = counter(head1);
        int maxIndex2 = counter(head2);

        Node temp1 = head1;
        Node temp2 = head2;
        if (head1 == null || head2 == null || maxIndex1 != maxIndex2) {
            flag = false;
        } else {
            while (temp1 != null) {
                if (temp1.data == temp2.data) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("lists are identical");
        } else {
            System.out.println("lists are not the same");
        }
        return flag;
    }

    public static int counter(Node head) {
        Node node = head;
        int index = 0;
        while (node.next != null) {
            node = node.next;
            index++;
        }
        return index;
    }

    public int valueAt(int index) {
        Node node = head;
        int value = 0;
        if (index == 0) {
            return node.data;
        } else {
            for (int i = 0; i <= index; i++) {
                value = node.data;
                node = node.next;
            }
        }
        return value;
    }

    public static Node selectionSort(Node head) {
        int minVal;
        int tempVal;
        int maxIndex = counter(head);
        Node node = head;
        Node min = head;
        Node nextNode = head.next;
        for (int i = 0; i < maxIndex; i++) {
            minVal = node.data;
            nextNode = node.next;
            for (int j = i; j < maxIndex; j++) {
                if (nextNode.data < minVal) {
                    min = nextNode;
                    minVal = min.data;

                }
                nextNode = nextNode.next;
            }

            if (minVal < node.data) {
                // swap values
                tempVal = node.data;
                node.data = minVal;
                min.data = tempVal;
            }
            node = node.next;
        }
        return head;
    }

    public static Node removeDuplicates(Node head) {
        Node node = head;
        Node nextNode;
        Node before;
        int value = node.data;
        while (node != null) {
            nextNode = node.next;
            before = node;
            while (nextNode != null) {
                if (value == nextNode.data) {
                    if (nextNode.next == null) {
                        before.next = null;
                        nextNode = null;
                    } else {
                        nextNode = nextNode.next;
                        before.next = nextNode;
                    }
                } else {
                    before = nextNode;
                    nextNode = nextNode.next;
                }
            }
            node = node.next;
            if (node != null) {
                value = node.data;
            }
        }
        return head;
    }


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertAtStart(6);
        myLinkedList.insertAtStart(5);
        myLinkedList.insertAtStart(4);
        myLinkedList.insertAtStart(3);
        show(myLinkedList.head);

        System.out.println();
        System.out.println(myLinkedList.valueAt(0));
        System.out.println(myLinkedList.valueAt(2));

        System.out.println();
        myLinkedList.showReversed();

        System.out.println();
        show(myLinkedList.reverse());

        System.out.println();
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.insertAtStart(4);
        myLinkedList1.insertAtStart(3);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.insertAtStart(4);
        //myLinkedList2.insertAtStart(3);
        System.out.println("Compare lists");
        show(myLinkedList1.head);
        System.out.println();
        show(myLinkedList2.head);
        System.out.println();
        compareLists(myLinkedList1.head, myLinkedList2.head);
        System.out.println();

        MyLinkedList myLinkedList3 = new MyLinkedList();
        myLinkedList3.insertAtStart(5);
        myLinkedList3.insertAtStart(5);
        myLinkedList3.insertAtStart(4);
        myLinkedList3.insertAtStart(3);
        myLinkedList3.insertAtStart(3);
        myLinkedList3.insertAtStart(3);
        myLinkedList3.insertAtStart(6);
        myLinkedList3.insertAtStart(1);
        show(myLinkedList3.head);
        System.out.println();
        //show(selectionSort(myLinkedList3.head));
        System.out.println();
        show(removeDuplicates(myLinkedList3.head));

    }
}
