package Stack;

/**
 * This is a stack interface
 */
public interface Stack<E> {

    /**
     *
     * @return true if there is at least an object, else false
     */
    boolean isEmpty();

    /**
     *
     * @return an item of the stack
     */
    E top();

    /**
     * Pushes an item to the stack
     * @param e
     */
    void push(E e);

    /**
     *
     * @return an item from the stack
     */
    E pop();

}
