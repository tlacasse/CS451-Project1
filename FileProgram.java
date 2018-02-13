
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.util.Scanner;

public class FileProgram {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
        }
        Files.copy((new File("C:\\Users\\XYZ\\Documents\\GitHub\\CS451-Project1\\in\\in.txt")).toPath(), 
                (new File("C:\\Users\\XYZ\\Documents\\GitHub\\CS451-Project1\\out\\out.txt")).toPath());
        System.out.println("Banana Muffins.");
        
        System.out.println(ManagementFactory.getRuntimeMXBean().getName());
    }
    
}
