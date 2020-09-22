package linkedList;


public class LinkedList {

  public Node head = null;

  public void insert(int newValue) {
    Node newNode = new Node(newValue);
    if (this.head != null) {
      newNode.setNext(this.head); // which getter/setter should work here?
    }
    this.head = newNode;
  }

  public String toTheString() {

    Node current = this.head;
    StringBuilder message = new StringBuilder();

    if (current == null) {
      return ("Nothing here");
    }

    if (current.getNext() != null) {
      while (current != null) {
        System.out.print(current.value + " -> ");
        message.append(String.format("%d -> ", current.getValue()));
        current = current.getNext();
      }
    }
    return message + "Null";
  }

  public boolean includes(int searchValue) {
    if (head.getValue() == searchValue) {
      return true;
    }
    Node nextCheck = head.getNext();
    while (nextCheck.getNext() != null) {
      if (nextCheck.getValue() == searchValue) {
        System.out.println("good job checker!");
        return true;
      } else {
        nextCheck = nextCheck.getNext();
      }
    }
    System.out.println("this ain't real");
    return false;
  }

  public void append(int newValue) {
    if (head == null) {
      head = new Node(newValue); // Node newNode = new Node(newValue); used to have that last line one above. but you can create "new" inline.
      return;
    }
    Node nextToCheck = head;

    do {
      if (nextToCheck.getNext() == null) {
        nextToCheck.setNext(new Node(newValue)); // you can create "new" this way!
        break;
      } else {
        nextToCheck = nextToCheck.getNext();
      }
    } while (nextToCheck != null);
  }

  public void insertBefore(int searchValue, int newValue) throws Exception {
    Node previousChecked = head;
    if (head.getValue() == searchValue) {
      insert(newValue);
    }
    do {
      if (previousChecked.getNext() == null) {
        throw new Exception("Value not found.");
      }
      if (previousChecked.getNext().value == searchValue) {
        Node newNode = new Node(newValue);
        newNode.setNext(previousChecked.getNext());
        previousChecked.setNext(newNode);
        return;
      } else {
        previousChecked = previousChecked.getNext();
      }
    } while (previousChecked != null);
  }

  public void insertAfter(int searchValue, int newValue) throws Exception {
    Node currentNode = head;
    while (currentNode != null) {
      if (currentNode.getValue() == searchValue) {
        Node newNode = new Node(newValue);
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        return;
      }
      currentNode = currentNode.getNext();
    }
    throw new Exception("Value not found.");
  }

//  public int[] nodesArray() {
//    int counter = 1;
//    Node currentNode = head;
//    while (currentNode.next != null) {
//      counter++;
//      currentNode = currentNode.next;
//    }
//    int[] complete = new int[counter];
//
//    int counterTwo = 0;

//    for (int i = 0; i < complete.length; i++) {
//      System.out.println(Arrays.toString(complete));
//      complete[i] = currentNode.value;
////      currentNode = currentNode.next;
//      currentNode = currentNode.next;
//    }
//    System.out.println(Arrays.toString(complete));
//    return complete;
//  }
}