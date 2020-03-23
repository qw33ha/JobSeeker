
public class DFS {
	private boolean[] marked;
	private int count = 0;
	public DFS(Graph G, int s) {
		marked = new boolean[G.V()];
		dfs(G, s);
	}
	private void dfs(Graph G, int v) {
		marked[v] = true;
		for(int w : G.adj(v)) {
			if(!marked[w]) {
				dfs(G,w);
				count++;
			}
		}
	}
	public boolean marked(int w) {
		return marked[w];
	}
	public int count() {
		return count;
	}
}
