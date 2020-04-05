/**
  *  Author: Zihao Du
  *  Revised: April 05, 2020
  *  
  *  Description: Test the DFS class 
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestDFS {
	private DFS dfs;
	private Graph G;
	@Before
	/**
	 * @brief Set up a graph and a DFS ADT for testing
	 */
	public void setUp() {
		G = new Graph(7);
		G.addedge(0,1);
		G.addedge(0,2);
		G.addedge(1,2);
		G.addedge(1,5);
		G.addedge(3,4);
		dfs = new DFS(G,0);
	}
	@After
	/**
	 * @brief Free the graph and DFS after a test
	 */
	public void teardown() {
		G = null;
		dfs = null;
	}
	@Test
	/**
	 * @brief Test the method hasPathTo() for all reachable nodes
	 */
	public void TesthasPathTotrue() {
		assertTrue(dfs.hasPathTo(1) && dfs.hasPathTo(2) && dfs.hasPathTo(5));
	}
	@Test
	/**
	 * @brief Test the method hasPathTo() for all unreachable nodes
	 */
	public void TesthasPathTofalse() {
		assertFalse(dfs.hasPathTo(3) && dfs.hasPathTo(4) && dfs.hasPathTo(6));
	}
	@Test
	/**
	 * @brief Test the method count(), normal case
	 */
	public void Testcount1() {
		assertTrue(dfs.count() == 3);
	}
	/**
	 * @brief Test the method count(), edge case
	 */
	@Test 
	public void Testcount2() {
		DFS dfs2 = new DFS(G,6);
		assertTrue(dfs2.count() == 0);
	}

}
