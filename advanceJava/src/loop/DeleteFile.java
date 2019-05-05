package loop;

import java.io.File;

public class DeleteFile {
  public static void main(String[] args) {
	 File file = new File("TestData\\Samyra.txt");
	 if(file.delete()) {
		 System.out.println("Deletion is sucessful");
	 }else {
		 System.out.println("Cannot delete the file");
	 }
 }
}
