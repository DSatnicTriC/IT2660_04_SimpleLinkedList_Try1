public class Node {
	private String value;
	private Node next;
	
	public Node(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void insertAtEnd(Node node) {
		var lastNode = this;
		var nextNode = lastNode.next;
		while (nextNode != null) {
			lastNode = nextNode;
			nextNode = lastNode.next;
		}
		
		lastNode.next = node;
	}
	
	public Node insertInPositionOfThisOne(Node node) {
		node.next = this;
		return node;
	}
	
	public void insertAtPosition(Node insertionNode, int position) throws Exception {
		if (position < 0) {
			throw new Exception("No negative positions!");
		}
		if (position == 0) {
			throw new Exception("Use insertInPositionOfThisOne to not lose root node");
		}
		
		var nodeBefore = this.getNodeAtPosition(position - 1);
		insertionNode.next = nodeBefore.next;
		nodeBefore.next = insertionNode;
	}
	
	public int getListSizeFromHereOnward() {
		return this.getNumberOfChildren() + 1;
	}
	
	private int getNumberOfChildren( ) {
		int childCount = 0;
		
		var iterator = this.next;
		while (iterator != null) {
			childCount++;
			iterator = iterator.next;
		}
		
		return childCount;
	}
	
	private Node getNodeAtPosition(int position) throws Exception {
		var iterator = this;
		for (int i = 0; i < position; i++) {
			iterator = this.next;
			if (iterator == null) {
				throw new Exception("List does not have that many elements");
			}
		}
		return iterator;
	}
}