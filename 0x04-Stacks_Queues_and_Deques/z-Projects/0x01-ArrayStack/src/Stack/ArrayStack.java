package Stack;

import java.net.Inet4Address;

public class ArrayStack<E> implements Stack<E> {

    /*
     * Fields
     */
    // We are using an array to implement
    // the stack
    private E[] data;

    // We also want to keep track of the
    // size/length of the array
    private Integer t = -1; // `-1` as the stack is
                    // empty initially

    // We want an initial capacity,
    // in case client did not specify
    public final Integer CAPACITY = 1000;

    /*
     * Constructor methods
     */
    public ArrayStack(Integer capacity) {
       data = (E[]) new Object[capacity];
    }

    /*
     * The stack methods
     */
    @Override
    public boolean isEmpty() {
        // We can use the field `t` to know
        // if stack is empty or not
        return (this.t == -1);
    }

    @Override
    public E top() {
        // We would check if it not empty
        if (this.isEmpty()) {
            return null;
        }
        return data[t];
    }

    @Override
    public void push(E e) {
        // We want to increment the size of the stack
        t += 1;
        // We then enter the new item
        data[t] = e;
    }

    @Override
    public E pop() {
        // We want to check if the stack is empty
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty. You have no champagne to pop!");
        }
        // We keep track of the size of the array
        // from which the stack is made
        E popped = data[t];
        data[t] = null;
        t -= 1;
        return popped;
    }
}
