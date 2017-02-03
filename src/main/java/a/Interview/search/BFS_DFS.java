package a.Interview.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by minchanglong on 1/20/17.
 */
public class BFS_DFS {

    /** iteratively BFS **/
    public void bfs(Node rootNode) {
        // BFS_DFS uses Queue data structure
        Queue<Node> queue = new LinkedList();
        queue.add(rootNode);
        printNode(rootNode);
        rootNode.visited = true;
        while(!queue.isEmpty()) {
            Node node = (Node)queue.remove();
            Node child=null;
            while((child=getUnvisitedChildNode(node))!=null) {
                child.visited=true;
                printNode(child);
                queue.add(child);
            }
        }
        // Clear visited property of nodes
        clearNodes();
    }

    static void bfsIterativeSolution(Node rootNode) {
        if (rootNode != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(rootNode);

            while(!queue.isEmpty()) {
                Node node = queue.poll();
                printNode(node);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    /** iteratively DFS **/
    public void dfs(Node rootNode) {
        // DFS uses Stack data structure
        Stack<Node> stack = new Stack();
        stack.push(rootNode);
        rootNode.visited=true;
        printNode(rootNode);
        while(!stack.isEmpty()) {
            Node node = stack.peek();
            Node child = getUnvisitedChildNode(node);
            if(child != null) {
                child.visited = true;
                printNode(child);
                stack.push(child);
            } else {
                stack.pop();
            }
        }
        // Clear visited property of nodes
        clearNodes();
    }

    static void dfsIterativeSolution(Node rootNode) {
        if (rootNode != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(rootNode);

            while (!stack.isEmpty()) {
                Node node = stack.pop();
                printNode(node);

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
    }

    /** recursively DFS **/
    public void dfsSearch(Node rootNode) {
        if (rootNode == null) return;
        printNode(rootNode);
        rootNode.visited = true;

        while (getUnvisitedChildNode(rootNode) != null) {
            dfsSearch(getUnvisitedChildNode(rootNode));
        }
    }

    private Node getUnvisitedChildNode(Node node) {
        if (node.left !=null && !node.left.visited) {
            return node.left;
        }

        if (node.right !=null && !node.right.visited) {
            return node.right;
        }

        return null;
    }

    private static void printNode(Node rootNode) {
    }

    private void clearNodes() {
    }
}
