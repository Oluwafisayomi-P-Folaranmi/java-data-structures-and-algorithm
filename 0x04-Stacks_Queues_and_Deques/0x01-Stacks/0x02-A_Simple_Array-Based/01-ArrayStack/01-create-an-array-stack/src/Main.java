import java.io.File;

public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack;
        arrayStack = new ArrayStack<Integer>();

        System.out.println("arrayStack has size -> '" + arrayStack.size() + "'");
        System.out.println("arrayStack is empty -> '" + arrayStack.isEmpty() + "'");

    }
}
