package graph;

import java.util.*;

public class Graph {
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
	
	//Constructor to initialize no. of lists in a list. v-vertices
	Graph(int v){
		for(int i=0; i<v; i++){
			adjList.add(new ArrayList<Integer>());
		}
	}
	
	//To add values in a particular vertex both sides
	public void addEdge(int u, int v){
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	
	//To print the values in the List
	public void printAdjList(){
		for(int i=0; i<adjList.size(); i++){
			System.out.println("Adjacency List of Vertex: " + i);   //i -vertex number
			
			for(int j=0; j<adjList.get(i).size(); j++){
				System.out.println(" " + adjList.get(i).get(j));
			}
		}	
	}
	
	
	//BFS - Breadth First Search
	public void bfs(int v){   // v-starting vertex
		
		int V = adjList.size();  //no of vertices
		
		boolean[] visited = new boolean[V];  //as 'V' is total no of vertices
		visited[v] = true; 					 //'v' is starting vertex
		
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		
		while(q.size()!=0){
			int vertex = q.remove();      //dequeue
			System.out.println(vertex + " ");
			
			for(int i=0; i<adjList.get(vertex).size(); i++){
				int av = adjList.get(vertex).get(i);
				
				if(!visited[av]){
					q.add(av);
					visited[av] = true;
				}
			}	
		}	
	}
}
