package trabalhofinal;

public class listadupla<T> {

    private static class Node<T> {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
        }

        public void displayNode() {
            System.out.print(data + " ");
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public Node primeiro = null;
    public Node ultimo = null;

    public void addPrimeiro(T data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            newNode.next = null;
            newNode.prev = null;
            primeiro = newNode;
            ultimo = newNode;

        } else {
            primeiro.prev = newNode;
            newNode.next = primeiro;
            newNode.prev = null;
            primeiro = newNode;
        }
    }

    public boolean isEmpty() {
        return (primeiro == null);
    }

    public void displayList() {
        Node current = primeiro;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void removeprimeiro() {
        if (!isEmpty()) {
            Node temp = primeiro;

            if (primeiro.next == null) {
            	primeiro = null;
                ultimo = null;
            } else {
            	primeiro = primeiro.next;
            	primeiro.prev = null;
            }
            System.out.println(temp.toString() + " extrai da lista");
        }
    }

    public void removeultimo() {
        Node temp = ultimo;

        if (!isEmpty()) {

            if (primeiro.next == null) {
            	primeiro = null;
                ultimo = null;
            } else {
                ultimo = ultimo.prev;
                ultimo.next = null;
            }
        }
        System.out.println(temp.toString() + " que resta na lista");
    }
}