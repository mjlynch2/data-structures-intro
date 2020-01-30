class Queue {

    private Node head;
    private Node tail;

    private class Node {
        private String value;
        private Node next;
    }

    public Queue() {
        head = null;
        tail = null;
    }

    public String peek() {
        return head.value;
    }

    public void push(String s) {
        Node oldTail = tail;
        tail = new Node();
        tail.value = s;
        if (head == null) {
            head = tail;
        } else {
            tail.next = oldTail;
        }
        tail.next = oldTail;
    }

    public String pop() {
        String s = head.value;
        head = head.next;
        return s;
    }
}
