public class LinkedList {

    private Node first, last;
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void add(int data) {
        /*
         * Node node = new Node(data);
         * 
         * if (first == null) { first = node; last = node; }
         * 
         * else { node.setNeighbour(last); last = node; } length += 1;
         */
        Node node = new Node(data);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.setNeighbour(node);
            last = node;
        }
        length += 1;

    }

    public void removeFirst(int data) {
        var current = this.first;
        while (current.getNeighbour() != null) {
            current = current.getNeighbour();
        }
    }

    public void removeAll(int data) {

    }

    public void replaceAt(int idx) {

    }

    public void removeAt(int idx) {
        if (idx >= this.length) {
            return;
        } else if (idx == 0) {
            this.first = this.first.getNeighbour();
        } else {
            var current = this.first;
            for (int i = 0; i < idx - 1; i++) {
                current = current.getNeighbour();
                current.setNeighbour(current.getNeighbour().getNeighbour());
            }
            this.length -= 1;
        }
    }

    public Boolean contains(int data) {
        return false;
    }

    public void printAll() {
        var current = this.first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNeighbour();
        }
    }
}