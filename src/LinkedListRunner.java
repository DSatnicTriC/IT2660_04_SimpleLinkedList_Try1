public class LinkedListRunner {
	public static void main(String[] args) {
		System.out.println("Starting with this node");
		
		var rootNode = new Node("first");
		
		printNodeTree(rootNode);

		System.out.println("Appending some nodes to the end");
		
		var insertAtEndValues = new String[] { "a", "b", "c" };
		for (int i = 0; i < insertAtEndValues.length; i++) {
			rootNode.insertAtEnd(new Node(insertAtEndValues[i]));
		}
		
		printNodeTree(rootNode);
		
		System.out.println("Replacing the root node");

		rootNode = rootNode.insertInPositionOfThisOne(new Node("new first"));
		rootNode.getNext().setValue("started out first");

		printNodeTree(rootNode);
	}

	private static void printNodeTree(Node node) {
		var counter = 0;
		printNodeInformation(node, counter);
		var nextNode = node.getNext();
		while (nextNode != null) {
			counter++;
			printNodeInformation(nextNode, counter);
			nextNode = nextNode.getNext();
		}
	}

	private static void printNodeInformation(Node node, int counter) {
		var printOutput = "Position: " + counter + " ... List size (this node + children): "
				+ node.getListSizeFromHereOnward() + " ... Value: " + node.getValue();
		System.out.println(printOutput);
	}
}