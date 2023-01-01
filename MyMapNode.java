package classProblemByAmolMateSir.Day15PracticeProblem;

class MyMapNode<K, V> {
    K key;
    V vaue;
    MyMapNode<K, V> next;


    public MyMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(MyMapNode<K, V> next) {
        this.next = next;
    }

    public MyMapNode(MyMapNode<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVaue() {
        return vaue;
    }

    public void setVaue(V vaue) {
        this.vaue = vaue;
    }
}
