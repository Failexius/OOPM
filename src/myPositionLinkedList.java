public class myPositionLinkedList implements myPositionList {
    private class Node {
        Position position;
        Node next;

        public Node(Position position) {
            this.position = position;
        }
    }

    private Node kopf = null;
    private Node ende = null;
    public int size = 0;

    public void add(Position position) {
        if (position == null) return;

        Node newNode = new Node(position);
        if (kopf == null) {
            kopf = ende = newNode;
        } else {
            ende.next = newNode;
            ende = newNode;
        }
        size++;
    }

    public int getSize() {
        return this.size;
    }

    public Position getItem(int position) {
        if (kopf == null) return null;
        if (position < 0 || position > this.size) return null;

        Node aktuellesElement;
        Position returnElement = null;
        aktuellesElement = this.kopf;
        for (int i = 0; i < this.size; i++) {
            if (i == position)
                return aktuellesElement.position;
            else
                aktuellesElement = aktuellesElement.next;
        }
        return returnElement;
    }

    public void clearList() {
        kopf = ende = null;
        size = 0;
    }
}
