# Hashmap LEFT JOIN
- Join up the key and value of a "left" table and matching values from the "right" table.

## Challenge
- Two hashmaps are passed in, the key value pairs must be pulled out and properly iterated over and matched up.


## Approach & Efficiency
- The left hashmap's keys were put into a list, then passed along to an array of arrays. The left table was checked to see if there was a matching key, and if so, that value was passed into the corresponding array position alongside the left's key and value.

- Time O(n)
- Space O(n)

## Solution
![whiteboard for the day](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/2020-10-28%20joinTable%20whiteboard.png?raw=true)