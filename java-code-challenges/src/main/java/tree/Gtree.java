package tree;

import org.checkerframework.checker.units.qual.A;
import utilities.AnimalShelter;

public class Gtree<T> {

    public Gtree(){}
    GtreeNode root = null;

    public GtreeNode getRoot() { return root; }
    public void setRoot(GtreeNode<String> root) { this.root = root; }

    @Override
    public String toString() {
        return "Gtree{" +
                "root=" + root +
                '}';
    }

    }
