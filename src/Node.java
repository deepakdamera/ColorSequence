import java.util.ArrayList;
import java.util.List;

class Node {
	private List<Node> neighbours;
	private int data;
	private boolean visited;

	Node(int data) {
		this.data = data;
		this.neighbours = new ArrayList<>();

	}

	@SuppressWarnings("unchecked")
	public void addneighbours(Node neighbourNode) {
		this.neighbours.add(neighbourNode);
	}

	@SuppressWarnings("unchecked")
	public List<Node> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(
			@SuppressWarnings("rawtypes") List<Node> neighbours) {
		this.neighbours = neighbours;
	}
}
