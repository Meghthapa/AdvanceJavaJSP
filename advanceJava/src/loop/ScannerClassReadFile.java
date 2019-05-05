package loop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClassReadFile {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("TestData//Samyra.txt"));
			String line;
			while(sc.hasNext()) {
			 line= sc.nextLine();
			 System.out.println(line);
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("did not read file");
		}
	}
}
