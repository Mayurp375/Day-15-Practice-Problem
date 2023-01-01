package classProblemByAmolMateSir.Day15PracticeProblem;

import classProblemByAmolMateSir.dailyClass.linedListNode.usingNode.Node;

class MyLinkedList<K> {
    private Node<K> head;
    private Node<K> tail;

    public void add(Node<K> value) {
        if (tail == null) {
            tail = value;
            System.out.println(tail);
        }

        if (head == null) {
            head = value;
        } else {
            Node<K> temp = head;
            head = value;
            head.setNext(temp);
            System.out.println(head);
        }
    }

    @Override
    public String toString() {

        StringBuilder myString = new StringBuilder();

        myString.append("head=").append(head);
        if (tail != null) {
            myString.append("->").append(tail);
        }
        return myString.toString();
    }

    public K serch(K key) {

        if (key == head.getNext()) {
            return key;
        }
        return key;
    }
}

