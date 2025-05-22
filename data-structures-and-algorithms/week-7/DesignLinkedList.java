package data-structures-and-algorithms.week-7;

public class DesignLinkedList {
  class MyLinkedList {
    int val;
    Node next;
    Node(int val) {
      this.val = val;
    }
  } private Node head;
  private int size;

      public MyLinkedList() {
        head = head;
        size = 0;

      }

      public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) {
          curr = curr.next;

        }

        return curr.val;

      }

      public int addAtHead(int val) {
        if (head == null) {
          Node newNode = new Node(val);
          newNode.mext = head;
          head = newNode;
          size++;

        }

        public int atAtTail(int val) {
          Node newNode = new Node(val);
          if (head == null) {
            head = newNode;
          } else {
            Node curr = head;
            while (curr.next != null) {
              curr = curr.next;
            }

            curr.next = newNode;

          }

          size++;
        }

        public void addAtIndex(int index, int val) {
          if (index < 0 || index > size) return;
          if (index == 0) {
            addAtHead(val);
            return;
          }

          Node newNode = new Node(val);
          Node curr =  head;

          for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
          }

          newNode.next = curr.next;
          curr.next = newNode;
          size++;
        }

        public void deleteAtIndex(int index) {
          if (index < 0 || index >= size) return;
          if (index == 0) {
            head = head.next;
          } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
              curr  = curr.next;
            }

            curr.next = curr.next.next;
          }

          size--;
        }
      }
    
