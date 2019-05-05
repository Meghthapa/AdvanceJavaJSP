package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
 
	public static void main(String[] args) {
          File direcFile = new File("TestData");
          direcFile.mkdir();
          direcFile = new File("TestData\\Samyra.txt");
        		
          try(BufferedWriter bWriter= new BufferedWriter(new FileWriter(direcFile,true))) {
			bWriter.write("Megh");
			bWriter.newLine();
			bWriter.write("Samyra");
			bWriter.newLine();
			bWriter.write("Sangam");
			bWriter.newLine();
			bWriter.write("Mom");
			bWriter.newLine();
			bWriter.write("Hi Janu chori");
			bWriter.close();
			
			System.out.println("writing on to the file is completed");
		} catch (Exception e) {
			System.out.println("Error occured when writing a file");
		}
          try {
			BufferedReader br = new BufferedReader(new FileReader("TestData\\Samyra.txt"));
			String lineString;
			while((lineString=br.readLine()) !=null) {
				System.out.println(lineString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          
	}
}
