package linkedList;


public class LinkedList {


  public Node head = null;

  public void insert(int newValue) {
    Node newNode = new Node(newValue);
    if (this.head != null) {
      newNode.next = this.head;
    }
    this.head = newNode;
  }

  public void toTheString() { // this is originally giving an error as toString is a builtin, unless it is... overloaded(?))

    Node current = this.head;

    if (current == null) {
      System.out.println("Nothing here");
    }

    if (current.next != null) {
      while (current != null) {
        System.out.print(current.value + " -> ");
        current = current.next;
      }
      System.out.println("Null");
    }
  }

  public boolean includes(int searchValue) {
    if (this.head.value == searchValue) {
      return true;
    }
    Node nextCheck = this.head.next;
    while (nextCheck != null) {
      if (nextCheck.value == searchValue) {
        System.out.println("good job checker!");
        return true;
      } else {
        nextCheck = nextCheck.next;
      }
    }
    System.out.println("this ain't real");
    return false;
  }

  public static void main(String[] args) {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    tryList.insert(3);
    tryList.insert(2);
    tryList.insert(1);
    tryList.toTheString();
    tryList.includes(3);
  }
}

class Node {

  int value;
  Node next;

  public Node(int number) {
    this.value = number;
    this.next = null;
  }
}