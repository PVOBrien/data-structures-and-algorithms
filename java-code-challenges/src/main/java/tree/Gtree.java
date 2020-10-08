package tree;

import org.checkerframework.checker.units.qual.A;
import utilities.AnimalShelter;

public class Gtree<T> {

    GtreeNode root = null;

    public Gtree(){}

    public Gtree(T root) {
        this.root = new GtreeNode(root);
    }

    public T getRoot() {
        return (T) root.getValue();
    }

    public void setRoot(T root) {
        this.root = new GtreeNode(root);
    }

    @Override
    public String toString() {
        return "Gtree { root=" + root + '}';
    }

    AnimalShelter animalShelter;

//    public void add (T newVal) {
//        if (this.root == null) {
//            this.root = new GtreeNode(newVal);
//            return;
//        }
//        AnimalShelter qQueue = new AnimalShelter();
//        GtreeNode newNode = new GtreeNode<>(newVal);
//        this.walk(this.root, newNode);
//    }

//    private void walk(GtreeNode<T> newRoot, GtreeNode<T> newNode) {
//        if (newRoot.getLeft() != null) {
//            animalShelter.enqueue(newRoot.getLeft());
//        }
//    }

}
