package loop;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Data<T>{
	private T data;

	public Data(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
	
	
	
}
public class Linklist {
public static void main(String[] args) {
	List<Data<Object>> linkedList = new LinkedList<>();
	linkedList.add(new Data<Object>("Megh"));
	linkedList.add(new Data<Object>(2.0));
	linkedList.add(new Data<Object>(1));
	linkedList.add(new Data<Object>(200));
	
	printlinkList(linkedList);
	
}
// public static void printlinkList(List<String> printlist) {
//	 for(String list:printlist) {
//		 System.out.println(list);
//	 }
//	 System.out.println("***************");
// }

public static void printlinkList(List<Data<Object>> list) {
	
	ListIterator<Data<Object>> iterator= list.listIterator();
	while(iterator.hasNext()) {
		System.out.println("iterate: "+iterator.next().getData());
	}
	System.out.println("*************");
}
}
