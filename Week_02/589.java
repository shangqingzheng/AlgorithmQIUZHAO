/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        //跟后续遍历思路一样还是使用 栈和队列。
        LinkedList<Node> stack = new LinkedList<Node>();
        LinkedList<Integer> res = new LinkedList<Integer>();
        //判断root如果为空的情况
        if (root == null) {
            return res;
        }

        //初始化栈
        stack.add(root);

        //迭代
        while(!stack.isEmpty()) {
            //先从栈中取元素
            Node node = stack.pollLast();
            //把栈中取出的元素值放入队列。
            res.add(node.val);
            //如果当前节点还有子节点，取出当前节点的子节点。翻转
            if (node.children != null) {
                Collections.reverse(node.children);
                for (Node item : node.children) {
                    stack.add(item);
                }
            }

        }
        return res;
    }
}