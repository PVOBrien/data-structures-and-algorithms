## MultiBracketValidation

### Challenge Description

Take in a string of open and close brackets, and returns true if all brackets are properly paired, and false otherwise.

### Approach & Efficiency

Time O(n) // I really want to know if my solution is this, or longer.
Space O(1)

### Solution

Loop over the string, checking each char that is a bracket if the next type of bracket is either another of it's open bracket type, or close, otherwise it fails. If it finds a proper closing bracket, it replaces that char with a blank " ", and proceeds until it finds something that makes it false, or returns true.

### Whiteboard

![MBV Whiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Bracket%20Balance%20Challenge%20Whiteboard.png)
