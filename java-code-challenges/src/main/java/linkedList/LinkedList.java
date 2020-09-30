package linkedList;


import java.util.ArrayList;

public class LinkedList {

  public Node head = null;

  public void insert(int newValue) {
    Node newNode = new Node(newValue);
    if (head != null) {
      newNode.setBehindInLine(head); // which getter/setter should work here?
    }
    head = newNode;
  }

  public String toTheString() {

    Node current = head;
    StringBuilder message = new StringBuilder();

    if (current == null) {
      return ("Nothing here");
    }

    if (current.getBehindInLine() != null) {
      while (current != null) {
        message.append(String.format("%d -> ", current.getValue()));
        current = current.getBehindInLine();
      }
    }
    return message + "Null";
  }

  public boolean includes(int searchValue) {
    if (head.getValue() == searchValue) {
      return true;
    }
    Node nextCheck = head.getBehindInLine();
    while (nextCheck.getBehindInLine() != null) {
      if (nextCheck.getValue() == searchValue) {
//        System.out.println("good job checker!");
        return true;
      } else {
        nextCheck = nextCheck.getBehindInLine();
      }
    }
    return false;
  }

  public void append(int newValue) {
    if (head == null) {
      head = new Node(newValue);
      return;
    }
    Node nextToCheck = head;

    do {
      if (nextToCheck.getBehindInLine() == null) {
        nextToCheck.setBehindInLine(new Node(newValue)); // you can create "new" this way!
        break;
      } else {
        nextToCheck = nextToCheck.getBehindInLine();
      }
    } while (nextToCheck != null);
  }

  public void insertBefore(int searchValue, int newValue) throws Exception {
    Node previousChecked = head;
    if (head.getValue() == searchValue) {
      insert(newValue);
    }
    do {
      if (previousChecked.getBehindInLine() == null) {
        throw new Exception("Value not found.");
      }
      if (previousChecked.getBehindInLine().value == searchValue) {
        Node newNode = new Node(newValue);
        newNode.setBehindInLine(previousChecked.getBehindInLine());
        previousChecked.setBehindInLine(newNode);
        return;
      } else {
        previousChecked = previousChecked.getBehindInLine();
      }
    } while (previousChecked != null);
  }

  public void insertAfter(int searchValue, int newValue) throws Exception {
    Node currentNode = head;
    while (currentNode != null) {
      if (currentNode.getValue() == searchValue) {
        Node newNode = new Node(newValue);
        newNode.setBehindInLine(currentNode.getBehindInLine());
        currentNode.setBehindInLine(newNode);
        return;
      }
      currentNode = currentNode.getBehindInLine();
    }
    throw new Exception("Value not found.");
  }

  public int valueFromKthLazy(int kthPlace) throws Exception {
    Node current = head;
    ArrayList<Integer> complete = new ArrayList<>();

    if (current.getBehindInLine() != null)
      do {
        complete.add(current.getValue());
        current = current.getBehindInLine();
    } while (current != null);

    if (kthPlace > complete.size() - 1 || kthPlace < 0) {
      System.out.println("There was an exception: no kth place in this LinkedList.");
      throw new Exception("Exception: Kth place not in LinkedList");
    }

    return complete.get(complete.size() - 1 - kthPlace);

  }

  public int valueFromKthSlowNumber(int kthPlace) {
    Node fast = this.head;
    Node slow = this.head;

    for(int i = 0; i < kthPlace; i++){
      fast = fast.getBehindInLine();
    }

    while (fast != null){
      fast = fast.getBehindInLine();
      slow = slow.getBehindInLine();
    }

    return slow.getValue();
  }

  public LinkedList zip(LinkedList first, LinkedList second) {
    Node firstL = first.head;
    Node secondL = second.head;
    while(firstL != null) {
      if(secondL != null) {
        Node newThing = new Node(secondL.value);
        newThing.setBehindInLine(firstL.getBehindInLine());
        firstL.setBehindInLine(newThing);
        Node nextOfNext = firstL.getBehindInLine();
        if(nextOfNext.getBehindInLine() != null) {
          firstL = nextOfNext.getBehindInLine();
        } else {
          firstL = firstL.getBehindInLine();
        }
        secondL = secondL.getBehindInLine();
      } else {
        break;
      }
    }
    return first;
  }

}