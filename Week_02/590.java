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
    public List<Integer> postorder(Node root) {
        //利用栈。链表
        LinkedList<Node> stack = new LinkedList<Node>();//栈
        LinkedList<Integer> res = new LinkedList<Integer>();//结果链表。一直往链表头节点插入。
        //处理root为null的情况
        if (root == null) {
            return res;
        }
        //初始化栈
        stack.add(root);

        //迭代
        while(!stack.isEmpty()) {//迭代条件是栈不为空，如果栈为空，则遍历完成
            //先从栈里面取出来最新放进去的元素。
            Node node = stack.pollLast();
            //把栈当前取出来的元素放入链表头。
            res.addFirst(node.val);

            //如果当前节点还有子节点，则把子节点顺序加入到栈中。
            for(Node item : node.children) {
                if (item != null) {
                    stack.add(item);
                }
            }
        }
        return res;
    }
}

//递归方式
class Solution {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
       if (root != null) {
           for(Node item: root.children) {
               postorder(item);
           }
           res.add(root.val);
       }
       return res;
    }
}
