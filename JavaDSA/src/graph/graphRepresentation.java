package graph;

public class graphRepresentation {

	public static void main(String[] args) {
		
		//Adjacency Matrix Representation
//		int[][] graph = {
//				{0,1,0,0,1},
//				{1,0,1,0,1},
//				{0,1,0,1,0},
//				{0,0,1,0,1},
//				{1,1,0,1,0}
//		};
//		
		
		//Adjacency List Representation - List of Lists
		Graph g = new Graph(5);     //no of vertices is 5
		
		g.addEdge(0, 1);
		g.addEdge(2, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 4);
		g.addEdge(0, 4);
		g.addEdge(1, 4);
		
		//Print all lists
		g.printAdjList();  //Refer Screenshot no 180+
		
		g.bfs(0);          //BFS Order
	}

}
