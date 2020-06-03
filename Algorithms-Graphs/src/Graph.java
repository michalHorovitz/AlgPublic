
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Graph<V extends Comparable<V>> {

	private SortedMap<V, TreeSet<V>> vertexToIncidences = new TreeMap<V, TreeSet<V>>();

	/**
	 * Add a new vertex if none exists.
	 */
	public void addVertex(V v) {
		// TODO Add implementation
	}

	/**
	 * Add a new edge from u to v, if none exists. If the vertices u or v do not
	 * exist, add them to the graph.
	 */
	public void addEdge(V from, V to) {
		// TODO Add implementation
	}

	/**
	 * @return if the graph contains the vertex v.
	 */
	public boolean containsVertex(V v) {
		// TODO Add implementation
	}

	/**
	 * Remove the vertex v and its edges from the graph, and return its incidents.
	 * If the vertex dosn't exit return null.
	 */
	public Set<V> removeVertex(V v) {
		// TODO Add implementation
	}

	/**
	 * @return Remove the edge (u,v). Return True if the edge exists. Otherwise
	 *         return false. If one of the vertices does not exist, return false.
	 */
	public boolean removeEdge(V from, V to) {
		// TODO Add implementation
	}

	/**
	 * @returns a BFS Tree where the search starts at source. If the graph does not
	 *          contain the source return an empty tree.
	 */
	public Graph<V> BFSTree(V source) {
		return BFSTree(source, null);
	}

	/**
	 * @returns a BFS Tree where the search starts at source. If the graph does not
	 *          contain the source return an empty tree. If distances is not null,
	 *          then after performing this method, distances will contain a map
	 *          represents the distances of all the reachable vertices from source.
	 */
	public Graph<V> BFSTree(V source, SortedMap<V, Integer> distances) {
		// TODO Add implementation
	}

	/**
	 * @returns a DFS Tree where the search starts at source. If the graph does not
	 *          contain the source return an empty tree.
	 * 
	 *          If vertexToVisitingTime is not null then after performing the method
	 *          it will contain a map representing the visiting time (arrival and
	 *          leaving) of the vertices. The arrival and the leaving time are in
	 *          indices 0 and 1, respectively.
	 * 
	 *          If isAcyclicGraph is not null then after performing the method it
	 *          will represents whether the contains a cycle or not.
	 * 
	 */
	public Graph<V> DFSTree(V source, DFS_Data DFS_data) {
		// TODO Add implementation
	}

	/**
	 * @returns a DFS Tree where the search starts at source. If the graph does not
	 *          contain the source return an empty tree.
	 */
	public Graph<V> DFSTree(V source) {
		// TODO Add implementation
	}

	/**
	 * @returns list of the vertices according to a topological order. If there's no
	 *          topological order, then return null.
	 */
	public List<V> topologicalOrder() {
		// TODO Add implementation
	}

	/**
	 * @returns The concatenation of the vertices separated by newlines Every vertex
	 *          is printed with a comma separated list of its incident edges. The
	 *          list is separated from the vertex with a colon.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		for (V v : vertexToIncidences.keySet()) {
			if (sb.length() != 0)
				sb.append("\n");
			sb.append(toString(v));
		}
		return sb.toString();
	}

	private String toString(V v) {
		SortedSet<V> incidences = vertexToIncidences.get(v);
		StringBuilder sb = new StringBuilder(v.toString());
		boolean first = true;
		String append = ":";
		for (V u : incidences) {
			if (!first)
				append = ",";
			sb.append(append);
			first = false;
			sb.append(u.toString());
		}
		return sb.toString();
	}

	public class DFS_Data {
		private SortedMap<V, int[]> vertexToVisitingTime;
		private boolean isAcyclicGraph = true;

		public DFS_Data() {
			vertexToVisitingTime = new TreeMap<V, int[]>();
			isAcyclicGraph = true;
		}

		private void clear() {
			vertexToVisitingTime.clear();
			isAcyclicGraph = true;
		}

		public SortedMap<V, int[]> getVertexToVisitingTime() {
			return vertexToVisitingTime;
		}

		public String getVertexToVisitingTimeString() {
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<V, int[]> v : vertexToVisitingTime.entrySet()) {
				sb.append(v.getKey() + ": " + v.getValue()[0] + "," + v.getValue()[1] + "\n");
			}
			return sb.toString();
		}

		public boolean isAcyclicGraph() {
			return isAcyclicGraph;
		}

	}

}