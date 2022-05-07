public class Node {
	private String value;
	private Node next;
	
	private int getNumberOfChildren( ) {
		int childCount = 0;
		
		var iterator = this.getNextNode();
		while (iterator != null) {
			children++;
			iterator = this.getNextNode();
		}
		
		return childCount;
	}
	
	private int getListSizeFromThisNode() {
		return this.getNumberOfChildren() + 1;
	}
}