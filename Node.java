public class Node {

    private int data;
    private Node neighbour;

    public int getData() {
        return data;
    }

    public void setData(int value) {
        this.data = value;
    }

    public Node getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(Node n) {
        this.neighbour = n;
    }

    public Node(int data) {
        this.data = data;
    }

}
