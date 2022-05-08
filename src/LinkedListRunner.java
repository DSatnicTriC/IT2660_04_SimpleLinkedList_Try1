public class LinkedListRunner {
	public static void main(String[] args) {
		var rootNode = new Node("first");
		
		var insertAtEndValues = new String[] {"a", "b", "c"};
		for (int i = 0; i < insertAtEndValues.length; i++) {
			rootNode.insertAtEnd(new Node(insertAtEndValues[i]));
		}
		
		printNodeInformation(rootNode);
		
		printNodeTree(rootNode);
	}
	
	private static void printNodeTree(Node node) {
		printNodeInformation(node);
		var nextNode = node.getNext();
		while (nextNode != null) {
			printNodeInformation(nextNode);
			nextNode = node.getNext();
		}
	}
	
	private static void printNodeInformation(Node node) {
		System.out.println("Value: " + node.getValue() + " ... List size from here: " + node.getListSizeFromHereOnward());
	}
}