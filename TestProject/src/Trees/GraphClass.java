package Trees;

import java.util.ArrayList;

public class GraphClass {

	ArrayList<GraphNode> nodeArray = new ArrayList<GraphNode>();
	ArrayList<GraphEdges> edgeArray = new ArrayList<GraphEdges>();

	public void createGraph() {
		GraphNode node = new GraphNode(0);
		nodeArray.add(node);

		node = new GraphNode(1);
		nodeArray.add(node);

		node = new GraphNode(2);
		nodeArray.add(node);

		node = new GraphNode(3);
		nodeArray.add(node);

		node = new GraphNode(4);
		nodeArray.add(node);

		GraphEdges edge = new GraphEdges(0, 1);
		edgeArray.add(edge);

		edge = new GraphEdges(1, 2);
		edgeArray.add(edge);

		edge = new GraphEdges(2, 3);
		edgeArray.add(edge);

		edge = new GraphEdges(3, 4);
		edgeArray.add(edge);

	}

	public ArrayList<GraphNode> getNeighbours(int i) {

		ArrayList<GraphNode> nodeArray1 = new ArrayList<GraphNode>();

		for (GraphEdges edge : edgeArray) {
			if (edge.from == i) {
				nodeArray1.add(nodeArray.get(edge.to));
			}
		}
		return nodeArray1;
	}

}
