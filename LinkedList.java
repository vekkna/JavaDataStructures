public class LinkedList {

    private Node first, last;
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void add(int data) {

        Node node = new Node(data);

        if (first == null) {
            first = node;
            last = node;
        }

        else {
            node.setNeighbour(last);
            last = node;
        }
        length += 1;
    }

    public void removeFirst(int data) {
        var current = this.first;
        while (current.getNeighbour() != null) {
            if (current.getData() == data) {
                current.setNeighbour(null);
                length -= 1;
                break;
            }
            current = current.getNeighbour();
        }
    }

    public void removeAll(int data) {

    }

    public void replaceAt(int idx) {

    }

    public void removeAt(int idx) {

    }

    public Boolean contains(int data) {
        return false;
    }
}