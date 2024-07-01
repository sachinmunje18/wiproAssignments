package com.datastructure.nonlinear.graphsalgo;

public class FloydWarshallAlgorithmDemo {

	final static int INF = 99999;
	final static int V = 4;

	void floydWarshall(int graph[][]) {
		int dist[][] = new int[V][V];
		int i, j, k;

		// Initialize the solution matrix same as input graph matrix
		for (i = 0; i < V; i++) {
			for (j = 0; j < V; j++) {
				dist[i][j] = graph[i][j];
			}
		}

		// Update the solution matrix
		for (k = 0; k < V; k++) {
			for (i = 0; i < V; i++) {
				for (j = 0; j < V; j++) {
					if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

		printSolution(dist);
	}

	void printSolution(int dist[][]) {
		System.out.println("The following matrix shows the shortest distances between every pair of vertices");
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if (dist[i][j] == INF)
					System.out.print("INF ");
				else
					System.out.print(dist[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int graph[][] = { { 0, 4, 1, 2 }, { 4, 0, 3, 2 }, { 1, 3, 0, 1 }, { 2, 2, 1, 0 } };

		FloydWarshallAlgorithmDemo fwa = new FloydWarshallAlgorithmDemo();
		fwa.floydWarshall(graph);
	}
}
