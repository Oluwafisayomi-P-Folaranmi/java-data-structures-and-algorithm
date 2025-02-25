public class ArrayStack<E> implements Stack<E> {

    /*
     * ArrayStack class fields
     */
    public static final int CAPACITY = 1000; // default array capacity
    private E[] data; // generic array used for 'storage'
    private int t = -1; // index of the top element in stack

    /*
     * The constructors
     */
    // constructs stack with default capacity
    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    /*
     * Utility methods
     */
    public int size() {
        return (t + 1);
    } // constructs stack with given capacity

    public boolean isEmpty() {
        return (t == -1);
    }

    /*
     * Update methods
     */
    @Override
    public void push(E e) throws IllegalStateException {
        if (size() == data.length)
            throw new IllegalStateException("Stack is full.");
        data[++t] = e;
    }

    @Override
    public E top() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }
}
