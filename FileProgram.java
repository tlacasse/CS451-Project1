
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileProgram {

    public static void main(String[] args) throws IOException {
        System.out.println(ManagementFactory.getRuntimeMXBean().getName());
        
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
        }
        
        Files.copy((new File("/home/osboxes/Documents/CS451-Project1/in/in.txt")).toPath(), 
                (new File("/home/osboxes/Documents/CS451-Project1/out/out.txt")).toPath(),
                StandardCopyOption.REPLACE_EXISTING);
        
        System.out.println("Banana Muffins.");
        
    }
    
}
