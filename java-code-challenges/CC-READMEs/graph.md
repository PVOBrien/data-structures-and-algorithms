# Graphs
Create a data structure that can keep track of what points, and are "next to it" and that distance (or, weight).

## Challenge
Create a graph from scratch in order to understand it.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

I used hashset Sets in order to ensure each point of the graph is unique, likewise with edges. So each point has it's own value, and keeps track of what other points it can reach (and the weight/distance from it).
There are helper methods and classes to order the data. Those are described below.

## API

Note: all classes have getters and setters.

#### - Graph graph = new Graph();
 - creates a new instance of the Graph class. It comes with an instantiated Hashset of Graphnodes (more on that below) called vertexes. (should be vertices, refactor to come)
 - add() - creates a new GraphNode and then adds it to the graph.

#### - GraphNode
 - what is added to the vertexes set. Includes its own value plus a private hashset for edges between it and other graphnodes it has an edge to.

#### - Edge
 - a private class to keep track of a graphnodes edges.
#### - addEdge()
 - takes in two nodes (origin, destination) plus a "weight" (integer) between the two. It is currently bi-directional, in that both the origin and destination count each as a connection.

#### getNeighbors()
 - takes in a node and returns a list of Neighbors - nodes it has an edge to/with.
 - Neighbor: a private class that bundles a node's destination and weight together.

#### breadthFirstTraversal()
 - __Challenge Summary__ - create a way to see what graphnodes have edges and can be traversed to from one to another.
 - __Challenge Description__ - create it "from scratch". The function takes in a node, then iteratively checks each neighboring node to see if there are additional nodes to check (against a hashset of already visited nodes).
 - __Approach & Efficiency__
   - Approach: Iteration.
   - Efficiency:
        Time O(n) __||__ Space O(n)
- Whiteboard for breadthFirstTraversal:
- ![breadthFirstTraversal Whiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Code%20Challenge%2017%20-%20Breadth%20First%20Traversal.png?raw=true)