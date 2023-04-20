package question12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question12b {
	    public static void main(String[] args) {
	        Scanner scanner = null;
	        try {
	            File file = new File("myfile.txt");
	            scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                System.out.println(scanner.nextLine());
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        } finally {
	            if (scanner != null) {
	                scanner.close();
	            }
	        }
	    }
}
