import java.io.File;

public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack;
        arrayStack = new ArrayStack<Integer>();

        arrayStack.push(5);
        arrayStack.push(4);
        arrayStack.push(7);
        int topValue = arrayStack.top();
        System.out.println("arrayStack has top value -> '" + topValue + "'");

        // Using the `pop` method
        int poppedValue = arrayStack.pop();
        System.out.println("\npopped value is -> '" + poppedValue + "'");
        System.out.println("arrayStack has top value -> '" + arrayStack.top() + "'");


    }
}
