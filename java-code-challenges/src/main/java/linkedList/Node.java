package linkedList;

class Node {

  int value;
  private Node behindLine;
  private Node aheadLine;

  public Node(int number) {
    this.setValue(number);
    this.setBehindInLine(null);
  }

  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  public Node getBehindInLine() {
    return behindLine;
  }
  public void setBehindInLine(Node behindInLine) {
    this.behindLine = behindInLine;
  }

}
