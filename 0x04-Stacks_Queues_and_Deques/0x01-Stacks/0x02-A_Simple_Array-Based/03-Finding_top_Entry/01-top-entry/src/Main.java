import java.io.File;

public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack;
        arrayStack = new ArrayStack<Integer>();

        arrayStack.push(5);
        int topValue = arrayStack.top();

        System.out.println("arrayStack has top value -> '" + topValue + "'");
        System.out.println("arrayStack has size -> '" + arrayStack.size() + "'");
        System.out.println("arrayStack is empty -> '" + arrayStack.isEmpty() + "'");

    }
}
