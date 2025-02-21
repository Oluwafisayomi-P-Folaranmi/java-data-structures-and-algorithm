import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\Folaranmi\\Desktop\\minigrep");
        long disk = diskUsage(file1);
        System.out.println("The amount of space in '" +
                file1 + "' is -> '" +
                disk + "'\n");

        File file2 = new File("C:\\Users\\Folaranmi\\Desktop\\django-practice");
        disk = diskUsage(file2);
        System.out.println("The amount of space in '" +
                file2 + "' is -> '" +
                disk + "'");

    }

    private static long diskUsage(File root) {
        long total = 0;
        if (!root.isDirectory()) {
            total = root.length();
        } else {
            for (String childname : root.list()) {
                File child = new File(root, childname);
                total += child.length();
            }
        }
        return total;
    }
}
