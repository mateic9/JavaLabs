/**
 * This class represents a generic pair, which holds two elements of different
 * types.
 * 
 * @param <K> The type of the first element (key).
 * @param <V> The type of the second element (value).
 */
public class Pair<K, V> {

    /**
     * The first element of the pair (key).
     */
    private K key;

    /**
     * The second element of the pair (value).
     */
    private V value;

    /**
     * Constructor to create a new `Pair` object.
     * 
     * @param first  The first element (key) of the pair.
     * @param second The second element (value) of the pair.
     */
    public Pair(K first, V second) {
        this.key = first;
        this.value = second;
    }

    /**
     * Sets the first element (key) of the pair.
     * 
     * @param key The new value for the key.
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Sets the second element (value) of the pair.
     * 
     * @param value The new value for the value.
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Retrieves the first element (key) of the pair.
     * 
     * @return The current value of the key.
     */
    public K getKey() {
        return key;
    }

    /**
     * Retrieves the second element (value) of the pair.
     * 
     * @return The current value of the value.
     */
    public V getValue() {
        return value;
    }
}
