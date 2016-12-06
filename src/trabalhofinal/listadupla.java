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

}