import java.util.Arrays;

/**
 * Created by nick on 6/29/16.
 */
public class Runner {

    public static void main(String[] args) {
        String[] adjacentNodes = new String[2];
        String[] outgoingEdges = new String[1];
        String[] incomingEdges = new String[1];
        Node nodeOne = new Node("1");
        Node nodeTwo = new Node("2");
        Node nodeThree = new Node("3");

        DirectedGraph directedGraph = new DirectedGraph();

        directedGraph.addNode(nodeOne);
        directedGraph.addNode(nodeTwo);
        directedGraph.addNode(nodeThree);

        directedGraph.addEdge(nodeOne, nodeThree);
        directedGraph.addEdge(nodeTwo, nodeThree);
        directedGraph.addEdge(nodeTwo, nodeOne);

        for(int i = 0; i < nodeOne.adjacentNodes.size(); i++) {
            adjacentNodes[i] = nodeOne.adjacentNodes.get(i).name;
        }
        System.out.printf("Nodes that are adjacent to nodeOne: %s \n", Arrays.toString(adjacentNodes));

        for(int i = 0; i < nodeOne.outgoingEdges.size(); i++) {
            outgoingEdges[i] = nodeOne.outgoingEdges.get(i).name;
        }
        System.out.printf("Nodes that are adjacent to nodeOne: %s \n", Arrays.toString(outgoingEdges));

        for(int i = 0; i < nodeOne.outgoingEdges.size(); i++) {
            incomingEdges[i] = nodeOne.incomingEdges.get(i).name;
        }
        System.out.printf("Nodes that are adjacent to nodeOne: %s \n", Arrays.toString(incomingEdges));
    }
}
