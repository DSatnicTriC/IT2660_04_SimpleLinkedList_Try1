public class LinkedListRunner {
	public static void main(String[] args) {
		var rootNode = new Node("first");

		var insertAtEndValues = new String[] { "a", "b", "c" };
		for (int i = 0; i < insertAtEndValues.length; i++) {
			rootNode.insertAtEnd(new Node(insertAtEndValues[i]));
		}

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