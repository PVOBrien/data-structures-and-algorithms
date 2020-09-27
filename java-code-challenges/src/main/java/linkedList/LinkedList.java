package linkedList;


import java.util.ArrayList;

public class LinkedList {

  public Node head = null;

  public void insert(int newValue) {
    Node newNode = new Node(newValue);
    if (head != null) {
      newNode.setNext(head); // which getter/setter should work here?
    }
    head = newNode;
  }

  public String toTheString() {

    Node current = head;
    StringBuilder message = new StringBuilder();

    if (current == null) {
      return ("Nothing here");
    }

    if (current.getNext() != null) {
      while (current != null) {
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

  public int valueFromKthLazy(int kthPlace) throws Exception {
    Node current = head;
    ArrayList<Integer> complete = new ArrayList<>();

    if (current.getNext() != null)
      do {
        complete.add(current.getValue());
        current = current.getNext();
    } while (current != null);

    if (kthPlace > complete.size() - 1 || kthPlace < 0) {
      throw new Exception("Exception: Kth place not in LinkedList");
    }

    System.out.println(complete);
    return complete.get(complete.size() - 1 - kthPlace);
  }

  public int valueFromKthSlowNumber(int kthPlace) {
    Node fast = this.head;
    Node slow = this.head;

    for(int i = 0; i < kthPlace; i++){
      fast = fast.getNext();
    }

    while (fast != null){
      fast = fast.getNext();
      slow = slow.getNext();
    }

    return slow.getValue();
  }

  public LinkedList zip(LinkedList first, LinkedList second) {
    Node firstL = first.head;
    Node secondL = second.head;
    while(firstL != null) {
      if(secondL != null) {
        Node newThing = new Node(secondL.value);
        newThing.setNext(firstL.getNext());
        firstL.setNext(newThing);
        Node nextOfNext = firstL.getNext();
        if(nextOfNext.getNext() != null) {
          firstL = nextOfNext.getNext();
        } else {
          firstL = firstL.getNext();
        }
        secondL = secondL.getNext();
      } else {
        break;
      }
    }
    return first;
  }

}