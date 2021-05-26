# Algorithm-Ford-Fulkerson




The Ford-Fulkerson algorithm is an algorithm that tackles the max-flow min-cut problem. That is, given a network with vertices and edges between those vertices that have certain weights, how much "flow" can the network process at a time? Flow can mean anything, but typically it means data through a computer network.

It was discovered in 1956 by Ford and Fulkerson. This algorithm is sometimes referred to as a method because parts of its protocol are not fully specified and can vary from implementation to implementation. An algorithm typically refers to a specific protocol for solving a problem, whereas a method is a more general approach to a problem.

The Ford-Fulkerson algorithm assumes that the input will be a graph, GG, along with a source vertex, ss, and a sink vertex, tt. The graph is any representation of a weighted graph where vertices are connected by edges of specified weights. There must also be a source vertex and sink vertex to understand the beginning and end of the flow network.

Ford-Fulkerson has a complexity of O\big(|E| \cdot f^{*}\big),O(∣E∣⋅f 
∗
 ), where f^{*}f 
∗
  is the maximum flow of the network. The Ford-Fulkerson algorithm was eventually improved upon by the Edmonds-Karp algorithm, which does the same thing in O\big(V^2 \cdot E\big)O(V 
2
 ⋅E) time, independent of the maximum flow value.
