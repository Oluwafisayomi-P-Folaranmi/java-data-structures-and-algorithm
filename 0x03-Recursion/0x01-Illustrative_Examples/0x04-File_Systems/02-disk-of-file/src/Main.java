import java.io.File;

public class Main {

    public static void main(String[] args) {

        File folder = new File("C:\\Users\\Folaranmi\\Desktop\\New folder"); // You can try any folder
        int numberOfFiles = totalFile(folder);
        System.out.println("The total number of files in '" +
                folder + "' is -> '" +
                numberOfFiles + "'");

    }

    private static int totalFile(File root) {
        int number = 0;
        for (String childname : root.list()) {
            File child = new File(root, childname);
            if (child.isDirectory()) {
                number += totalFile(child);
            }
            number++;
        }
        return number;
    }
}
