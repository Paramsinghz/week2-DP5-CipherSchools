package LinkedList;

import javafx.scene.Node;

public class implement {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        int size;
        Node head;
        Node tail;

        public void addLast(int val) {

            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;

        }

        public int size() {
            return size;
        }

        public void display() {

            Node temp = new Node();
            temp = head;

            while (temp.next != null) {
                System.out.print(temp.data + "");
                temp = temp.next;
            }
        }

        public void removefirst() {

            if (size == 0) {
                System.out.println("Empty list");
            }

            else if (size == 1) {
                head = tail = null;
                size = 0;
            }

            else {
                head = head.next;
                size--;
            }

        }

    }

    public static void main(String[] args) {

    }

}
