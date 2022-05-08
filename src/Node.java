public class Node {
	private String value;
	private Node next;
	
	public Node(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

//	public void setNext(Node next) {
//		this.next = next;
//	}
	
	public void insertAtEnd(Node node) {
		var lastNode = this;
		var nextNode = lastNode.getNext();
		while (nextNode != null) {
			lastNode = nextNode;
			nextNode = lastNode.getNext();
		}
		
		lastNode.next = node;
	}
	
	public int getListSizeFromHereOnward() {
		return this.getNumberOfChildren() + 1;
	}
	
	private int getNumberOfChildren( ) {
		int childCount = 0;
		
		var iterator = this.getNext();
		while (iterator != null) {
			childCount++;
			iterator = iterator.getNext();
		}
		
		return childCount;
	}
	

}