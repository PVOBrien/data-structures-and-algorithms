package tree;

import org.checkerframework.checker.units.qual.A;
import utilities.AnimalShelter;

public class Gtree<T> {

    public GtreeNode getRoot() {
        return root;
    }

    public void setRoot(T root) {
        this.root = (GtreeNode) root;
    }

    GtreeNode root = null;

    public Gtree(){}

    }



//
//    @Override
//    public String toString() {
//        return "Gtree { root=" + root + '}';
//    }
//
//    AnimalShelter animalShelter;

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
//
//}
