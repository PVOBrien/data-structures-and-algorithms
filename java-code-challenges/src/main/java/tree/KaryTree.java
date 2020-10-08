package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class KaryTree <T> {

    Node<T> root;



    public class Node<T> {
        ArrayList<Node<T>> children = new ArrayList<>();
        T value;

        public Node(T value) {
            this.value = value;
        }
    }

    public void insert(T value) {
        if (root == null) {
            root = new Node<>(value);
            return;
        }
        insert(root, value);
    }

    private void insert(Node<T> nodeWeAreOn, T value) {
        int a = (int) Math.floor(Math.random() * nodeWeAreOn.children.size());

        if (nodeWeAreOn.children.size() == 0) {
            nodeWeAreOn.children.add(new Node<>(value));
            return;
        }
        insert(nodeWeAreOn.children.get(a), value);
    }

    public String toString() {
        StringJoiner join = new StringJoiner(", ");
        Queue<Node<T>> queue = new LinkedList<>();
        if (root == null) return "empty tree";
        queue.add(root);
        while (!queue.isEmpty()) { // a better way of not null
            Node<T> node = queue.remove();
            join.add(node.value.toString());
            for (Node<T> child : node.children) {
                queue.add(child);
            }
        }
        return join.toString();
    }

    public KaryTree<T> fizzBuzz(){
        KaryTree<T> newTree = new KaryTree<>();
        newTree.root = fizzBuzz(this.root);
        return newTree;
    }

    public Node<T> fizzBuzz(Node<T> currentNode) {
        if(currentNode == null) return null;
        Node<T> newNode = new Node<>(currentNode.value);
        int fizzInt = Integer.parseInt(newNode.value.toString());
        if (fizzInt % 15 == 0) {
            newNode.value =(T) "FizzBuzz";
        } else if (fizzInt % 5 == 0) {
            newNode.value = (T) "Buzz";
        } else if (fizzInt % 3 == 0) {
            newNode.value = (T) "Fizz";
        }

        // we Recurse!

        for(Node<T> childNode : currentNode.children){
            newNode.children.add(fizzBuzz(childNode));
        }

        return newNode;
    }
}
