package _06_generic._ex;

public class Pair<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public void printPair() {
        System.out.println("Key: " + getKey() + ", Value: " + getValue());
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>("One", 1);
        pair1.printPair();
        Pair<Integer, String> pair2 = new Pair<Integer, String>(2, "Two");
        pair2.printPair();
    }
}
