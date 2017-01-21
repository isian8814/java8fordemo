package a.Interview.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by minchanglong on 1/20/17.
 */
public class BFS_DFS {
    public void bfs(Node rootNode)
    {
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
            }
            else {
                stack.pop();
            }
        }
        // Clear visited property of nodes
        clearNodes();
    }

    private Node getUnvisitedChildNode(Node node) {
        return null;
    }


    private void printNode(Node rootNode) {
    }

    private void clearNodes() {
    }
}
