package Trees;

public class GraphNode {

	int id;
	boolean isVisited;

	public GraphNode(int id) {
		this.id = id;
	}
	
	public void isVisited(boolean value)
	{
		isVisited = value;
	}
}
