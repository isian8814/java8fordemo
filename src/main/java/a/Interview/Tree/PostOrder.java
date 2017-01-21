package a.Interview.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by minchanglong on 1/19/17.
 */
public class PostOrder {
    public List<Integer> postorderTraversalLoop(Node root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.peek(); //Not pop first, need to check the children of the node first
            if (temp.left == null && temp.right == null) {
                Node pop = stack.pop();
                res.add(pop.data);
            } else {
                if (temp.right != null) {
                    stack.push(temp.right);
                    temp.right = null; //after the right child is pushed, the root do not keep the right child
                }

                if (temp.left != null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }

        return res;
    }

    List<Integer> res = new ArrayList<Integer>();

    void postOrderRecursive(Node root) {

        if (root == null) return;

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);

        res.add(root.data);
    }


}
