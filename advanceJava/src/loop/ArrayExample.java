package loop;

import java.util.ArrayList;

public class ArrayExample {

	static ArrayList<String> aList = new ArrayList<>();
	public static void main(String[] args) {

		aList.add("Megh");
		aList.add("Samyra");
		aList.add("Sangam");
		ArrayExample aExample = new ArrayExample();
		aExample.setname(1, "Samyra Thapa");
		aExample.displayname(aList);
		int position = aExample.Searchname("Sangam");
		System.out.println(position);

	}

	public void displayname(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}

	}
	public void removeName(int name) {
		aList.remove(name);
	}
	public void removeNameByString(String listname) {
		aList.remove(listname);
	}
	public void setname(int position,String newname) {
		aList.set(position, newname);
	}
	public int Searchname(String name) {
		return aList.indexOf(name);
	}


}
