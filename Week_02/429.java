class Solution{
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		//第一层
		List<Node> previousLayer = Arrays.asList(root);
		while (!previousLayer.isEmpty()) {
			List<Node> currentLayer = new ArrayList<>();
			List<Integer> previousVals = new ArrayList<>();
			for(Node node: previousLayer) {
				previousVals.add(node.val);
				currentLayer.addAll(node.children);
			}
			result.add(previousVals);
			previousLayer = currentLayer;
		}
		return result;
	}
	
}



















