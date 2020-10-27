## Tree Intersection

# Challenge Summary
Check two trees against each other, and return a list of all values that are included in each.

## Challenge Description
Two trees are given, and somehow, the values of each trees need to be checked against each other thoroughly.

## Approach & Efficiency

Using a hashmap to store the values, the first tree is added to the hashmap. When the second tree is iterated over into the hashmap (but prior to it being added), if that value already exists, it is added to an array list. Then the array list is returned. 
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## Solution
<!-- Embedded whiteboard image -->
![The Whiteboard Solution](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/treeIntersection%20whitebaord.png?raw=true)
