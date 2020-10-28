package treeIntersection;

import org.checkerframework.checker.units.qual.A;
import tree.GtreeNode;
import tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TreeIntersection extends Tree {

// PreOrder Walk w Node add to Hashmap

    ArrayList<Integer> collisionList = new ArrayList<>();


    public HashMap preOrderHashMapCreation(Tree tree) throws Exception {
        HashMap hashMap = new HashMap();

        if (tree.root == null){
            throw new Exception("no root, no play");
        }

        preOrderWalkWHashMap(tree.root, hashMap);
        return hashMap;
    }

    void preOrderWalkWHashMap(GtreeNode node, HashMap hashMap) {
        if (hashMap.containsKey(node.getValue())) collisionList.add((Integer) node.getValue());
        hashMap.put(node.getValue(), node.getValue());
        if (node.getLeft() != null)  preOrderWalkWHashMap(node.getLeft(), hashMap);
        if (node.getRight() != null) preOrderWalkWHashMap(node.getRight(), hashMap);
    }
}

// https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/ for another solution