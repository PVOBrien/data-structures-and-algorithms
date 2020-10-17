# K-ary FizzBuzz Tree
   Make a function that swaps out any numbers divisible by 3 with "Fizz", 5 with "Buzz", and if it is divisble by both 3 and 5 with "FizzBuzz". In all other cases not divisible by 3 and/or 5, turn the number into a String.
   Return a __new tree__. NOTE: This is now a kary tree, not a binary tree. It is also using entirely generic classes of nodes and the kary binary tree.

## Challenge
- The strings of the new tree are based on the values from the old tree.
- Take a tree of ints and create a new tree of strings. (We ended up parsing strings as ints to keep it simple.)

## Approach and Efficiency
- Space O(1)
- Time O(n)

## Whiteboard

![thewhiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Code%20Challenge%2018%20Whiteboard%20FizzBuzz%20K%20ary%20Tree.png?raw=true)

## Additional Details
  This code was covered fully in CF Java 401d8. As such, I was able to address other details I'd been meaning to. Namely the @Before annotation (and slowly refactoring other data structures to be generic). I have a grasp on what the @Before annotation does (runs code before), but in our current situation is only slightly more helpful than helper functions in the testing environment, useful for spooling up trees, queues, and the like.
  But in the future, @Before / @BeforeClass - now in JUnit5 to become @BeforeEach / @BeforeAll, respectively - they will be useful to turn things on, or spool up files or other "pre" work, and then @After / @AfterEach and @AfterClass / @AfterAll can close them down. That will become very useful to save lines.
