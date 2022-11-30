import java.util.*;
import java.io.*;

public class StringSearch {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of arguments.");
            return;
        }
        File file = new File(args[1]);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.contains(args[0])) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
 