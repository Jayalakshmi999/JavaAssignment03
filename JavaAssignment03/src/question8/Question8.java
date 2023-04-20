package question8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question8 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = null;
		try {
		    fis = new FileInputStream("myfile.txt");
		    
		} finally {
		    if (fis != null) {
		        try {
		            fis.close();
		        } catch (IOException e) {
		        	
		        }
		    }
		}

	}

}
