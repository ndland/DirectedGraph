import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 6/29/16.
 */
public class Node {

    // Each node has a name
    public String name;

    // List the adjacent nodes
    public List<Node> adjacentNodes = new ArrayList<Node>();

    // List all the outgoing edges to a node
    public List<Node> outgoingEdges = new ArrayList<Node>();

    // List all the outgoing edges to a node
    public List<Node> incomingEdges = new ArrayList<Node>();

    public Node(String name) {
        this.name = name;
    }
}
