package linkedList;

class Node {

  int value;
  private Node next;

  public Node(int number) {
    setValue(number);
    setNext(null);
  }

  public int getValue() { return value; }
  public Node getNext() { return next; }

  public void setValue(int value) { this.value = value; }
  public void setNext(Node next) { this.next = next; }

}
