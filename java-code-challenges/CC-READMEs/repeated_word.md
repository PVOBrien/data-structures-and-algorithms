# Challenge 
- Create a function that checks for and returns the first repeated word.

# Challenge Description
- Take in a string, and without using a directly built in language method (ie cannot directly use .contains()), solve the challenge.

## Approach & Efficiency

Hashtable for quick key discovery and value retrieval.

Time: O(n)
Space O(1)


## Approach & Efficiency
- Using a hashtable (the built-in method within Java) the method strips all punctuation, turns everything to lowercase, and then - after checking that the string passed in not 1 or less "string blocks" - goes to either return the first repeated word or adds it to the hashed table.

#### (No whitetable assigned)