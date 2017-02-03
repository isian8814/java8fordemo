package a.Interview.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by minchanglong on 1/19/17.
 */
public class InOrder {
    /**
     * Iterative
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalLoop(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node top = stack.peek();
            if(top.left!=null){
                stack.push(top.left);
                top.left=null;
            }else{
                result.add(top.data);
                stack.pop();
                if(top.right!=null){
                    stack.push(top.right);
                }
            }
        }

        return result;
    }

    public List<Integer> solution(Node root) {
        List<Integer> result = new LinkedList<>();

        if (root == null) {
            return null;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();

            if (node.left != null) {
                stack.push(node.left);
                node.left = null; /** Important to set the pushed left child to null **/
            } else {
                result.add(node.data);
                stack.pop();
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
        }

        return result;
    }

    /**
     * Recursive
     */
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversalRecursive(Node root) {
        if(root !=null){
            helper(root);
        }

        return result;
    }

    public void helper(Node p){
        if(p.left!=null)
            helper(p.left);

        result.add(p.data);

        if(p.right!=null)
            helper(p.right);
    }

}
