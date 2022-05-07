public class LinkedListRunner {
	public static void main(String[] args) {
		var rootNode = new Node("first");
		printNodeInformation(rootNode);
	}
	
	private static void printNodeInformation(Node node) {
		System.out.println("Value: " + node.getValue() + " ... List size from here: " + node.getListSizeFromHereOnward());
	}
}