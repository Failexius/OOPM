public class myFormLinkedList implements myFormList {
    private class Node {
        Form form;
        Node next;

        public Node(Form form) {
            this.form = form;
        }
    }

    private Node kopf = null;
    private Node ende = null;
    public int size = 0;

    public void add(Form form) {
        if (form == null) return;

        Node newNode = new Node(form);
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

    public Form getItem(int position) {
        if (kopf == null) return null;
        if (position < 0 || position > this.size) return null;

        Node aktuellesElement;
        Form returnElement = null;
        aktuellesElement = this.kopf;
        for (int i = 0; i < this.size; i++) {
            if (i == position)
                return aktuellesElement.form;
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
