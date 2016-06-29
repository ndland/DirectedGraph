import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 6/29/16.
 */
public class DirectedGraph {

    // Keep a list of nodes that are tied to this graph
    public List<Node> nodesInGraph = new ArrayList<Node>();

    public void addNode(Node node) {
        System.out.printf("Added new node %s \n", node.name);
        nodesInGraph.add(node);
    }

    public void addEdge(Node from, Node to) {
        if (from.adjacentNodes.contains(to) || to.adjacentNodes.contains(from) || !nodesInGraph.contains(to)) {
            throw new RuntimeException();
        } else {
            System.out.printf("Added new edge from: %s \n", from.name);
            System.out.printf("Added new edge to: %s \n", to.name);
            from.adjacentNodes.add(to);
            to.adjacentNodes.add(from);
            from.outgoingEdges.add(to);
            to.incomingEdges.add(from);
        }
    }
}
