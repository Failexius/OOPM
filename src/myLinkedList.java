public class myLinkedList<T> implements myList<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node kopf = null;
    private Node ende = null;
    public int size = 0;

    public void add(T element) {
        if (element == null) return;

        Node newNode = new Node(element);
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

    public T getItem(int position) {
        if (kopf == null) return null;
        if (position < 0 || position > this.size) return null;

        Node aktuellesElement;
        T returnElement = null;
        aktuellesElement = this.kopf;
        for (int i = 0; i < this.size; i++) {
            if (i == position)
                return aktuellesElement.data;
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
