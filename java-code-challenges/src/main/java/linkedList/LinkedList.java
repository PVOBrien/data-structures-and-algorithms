package linkedList;

public class LinkedList {

  public class Node {

    public int value;
    Node next; // changed to Node, after following tutorial.

    public Node(int number) {
      this.value = number;
      this.next = null;
    }
  }

    public Node head;
    public Node tail;

//    public LinkedList() { // we originally had this, but this would instantiate it, instead of making it... static?
//      this.head = null; // thought this needed to be instantiated first, but now come to think of it, this *is* the linkedlist, static
//      this.tail = null; // ^^^
//    }

    public void insert (int newValue) {
      Node newNode = new Node(newValue);
      if (head == null) {
        head = newNode;
        tail = newNode;
      }
      else {
        tail.next = newNode;
        tail = newNode;
      }
    }

    public void toString() { // this is originally giving an error as toString is a builtin, unless it is... overloaded(?))
      Node current = head;

      if (head == null) {
        System.out.println("Nothing here");
      }

      if (current != null) {
      System.out.println("Here is the current LinkedList: ");
        while (current != null) {
          System.out.println(current.value + " ");
          current = current.next;
        }
      }
    }
    public boolean includes (int searchValue) {
      int check = head.value;

      while (head.next != null){
        if (check == searchValue){
          return true;
        } else {
          check = head.next.value;
        }
      }
      return false;
    }
  }
