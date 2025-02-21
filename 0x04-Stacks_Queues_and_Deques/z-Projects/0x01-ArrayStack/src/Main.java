import Stack.ArrayStack;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. Hello");

        // Test `isEmpty`
        ArrayStack<Integer> integerStack = new ArrayStack<Integer>(100);
        System.out.println("\n2. `integerStack` is empty: `" + integerStack.isEmpty() + "`");

        // Test `top`
        System.out.println("\n3. `integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        // Test `push` and check the `top`
        integerStack.push(6);
        System.out.println("\n4. `integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        integerStack.push(7);
        System.out.println("\n5. `integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        integerStack.push(2);
        System.out.println("\n6. `integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        // Test `pop` and check `top`
        Integer popped = integerStack.pop();
        System.out.println("\n7. Popped '" + popped + "'" +
                "\n...`integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        popped = integerStack.pop();
        System.out.println("\n8. Popped '" + popped + "'" +
                "\n...`integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        popped = integerStack.pop();
        System.out.println("\n9. Popped '" + popped + "'" +
                "\n...`integerStack` has the item `" + integerStack.top() +
                "` at the top.");

        try {
            popped = integerStack.pop();
        }
        catch (RuntimeException e) {
            System.out.println("\n10. Catch yah!");
        }
    }
}