package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class FindTravelProssible {

	public boolean isTravelPossible(int from, int to, GraphClass g) {
		Stack<GraphNode> s = new Stack<GraphNode>();
		for (GraphNode graphNode : g.nodeArray) {

			graphNode.isVisited = false;

		}

		ArrayList<GraphNode> gn = new ArrayList<GraphNode>();
		s.push(g.nodeArray.get(from));
		GraphNode n;

		while (!s.isEmpty()) {
			n = s.pop();

			if (n.id == to)
				return true;

			if (n.isVisited == false) {
				n.isVisited = true;
				gn = g.getNeighbours(n.id);

				for (GraphNode gn1 : gn) {
					if (gn1.isVisited == false)
						s.push(gn1);
				}

			}
		}

		return false;
	}

	public static void main(String[] args) {

		GraphClass g = new GraphClass();
		g.createGraph();
		FindTravelProssible ftp = new FindTravelProssible();
		boolean result = ftp.isTravelPossible(2, 3, g);
		System.out.println("Is travel possible " + result);

	}

}
