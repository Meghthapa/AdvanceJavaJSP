package loop;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

class Data1{
	
	public <E> void printlist(List<E> list) {
		for(E listprint: list) {
			System.out.println(listprint);
		}
	}
	
	public <E> void PrintArray(ArrayExample[] arr) {
		for(ArrayExample element:arr) {
			System.out.println(element);
		}
	}
}

public class GenericsMethod {
	
  public static void main(String[] args) {
	List<String> nameStrings= new ArrayList<>();
	nameStrings.add("Samyra");
	nameStrings.add("Sangam");
	nameStrings.add("Megh");
	nameStrings.add("Mummy");
	Data1 gmGenericsmethod= new Data1();
	gmGenericsmethod.printlist(nameStrings);
	
	
 }
}
