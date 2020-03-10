package final_project_2xb3_l03_g03;


import java.util.ArrayList;
public class Graph {
	private final int V;
	private int E;
	private ArrayList<Integer>[] adj;
	public Graph(int V) {
		this.V = V;
		adj = new ArrayList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}
	public void addedge(int w, int v) {
		if(w > V || v > V)	throw new IllegalArgumentException();
		adj[w].add(v);
		adj[v].add(w);
	}
	public int V() {
		return this.V;
	}
	public Iterable adj(int v) {
		return adj[v];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
