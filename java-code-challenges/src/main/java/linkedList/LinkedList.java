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

  public String toTheString() { // this is originally giving an error as toString is a builtin, unless it is... overloaded(?))

    Node current = this.head;
    String message = "";

    if (current == null) {
      return message = ("Nothing here");
    }

    if (current.next != null) {
      while (current != null) {
        System.out.print(current.value + " -> ");
        message += String.format("%d -> ", current.value);
        current = current.next;
      }
    }
      return message += "Null";
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

  public void append (int newValue) {
    if (this.head == null) {
      Node newNode = new Node(newValue);
      head = newNode;
      return;
    }
    Node nextToCheck = head;

    do {
      if (nextToCheck.next == null) {
        nextToCheck.next = new Node(newValue);
        break;
      } else {
        nextToCheck = nextToCheck.next;
      }
    } while (nextToCheck != null);
  }

  public void insertBefore(int searchValue, int newValue) throws Exception {
    Node previousChecked = head;
    if (head.value == searchValue) {
      insert(newValue);
    }
    do {
      if (previousChecked.next == null) {
        throw new Exception("Value not found.");
      }
      if (previousChecked.next.value == searchValue) {
        Node newNode = new Node(newValue);
        newNode.next = previousChecked.next;
        previousChecked.next = newNode;
        return;
      } else {
        previousChecked = previousChecked.next;
      }
    } while (previousChecked != null);
  }

  public void insertAfter(int searchValue, int newValue) throws Exception {
    Node currentNode = head;
    while (currentNode != null) {
      if (currentNode.value == searchValue) {
        Node newNode = new Node(newValue);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return;
      }
      currentNode = currentNode.next;
    }
    throw new Exception("Value not found.");
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