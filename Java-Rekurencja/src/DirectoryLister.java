import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("C:/Users/hp/Desktop/a");
        showDirectories(file);
    }

    private static void showDirectories(File file) {
        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("folder: " + f.getAbsolutePath());
                    showDirectories(f);
                }else {
                    System.out.println("  plik: " + f.getAbsolutePath());
                }
            }
        }

    }

}
