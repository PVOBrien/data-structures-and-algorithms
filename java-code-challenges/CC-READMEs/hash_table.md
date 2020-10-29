# Hash Table
   Make a hash table that stores uniquely identified value via unique keys (aka hashed values).
   
## Challenge
- Make the list, the correct node, and be able to store, check, and retrieve values from a hashtable.

## Approach and Efficiency
- Space O(n)
- (for retrieval) Time O(1) 
- (for putting) Time O(n)

## API
- add() : add a value by creating a key (via hash, see below) and then assigning it a place in the hashmap.
- get() : retrieve a value by its key from its respective place in the hashmap 
- contains() : returns a boolean if a value exists or not in a particular hash table bucket.
- hash() : gives each value a unique key and then stores that value in the respective bucket.

## Whiteboard

![Hashmap Creation](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/2020-10-29%20hashmap%20creation%20WB_copy.png?raw=true)