package com.datastructure.nonlinear;


import java.util.LinkedList;

class Graph {
	private int vertices;
	private LinkedList<Integer> adjList[];
	
	Graph(int v) {
		vertices = v;
		adjList = new LinkedList[v];
		for(int i=0; i<v; ++i) {
			adjList[i] = new LinkedList<>();
		}
	}
	void addEdge(int v, int w) {
		adjList[v].add(w);
	}
	void printGraph() {
		for(int i=0; i<vertices; ++i) {
			System.out.print("Vertex" +i+".");
			for(Integer node: adjList[i]) {
				System.out.print("->" + node);
			}
			System.out.println();
		}
	}
}



public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=5;
         Graph g= new Graph(V);
		g.addEdge(0,1);
		g.addEdge(0,4);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		
		g.printGraph();
	}

}
