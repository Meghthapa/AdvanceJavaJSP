package loop;

import java.util.ArrayList;
import java.util.Stack;

public class WrapClass {
 public static void main(String[] args) {
	ArrayList<Integer> alArrayList = new ArrayList<Integer>();
	alArrayList.add(25);
	System.out.println(alArrayList);
	ArrayList<Double> doubleAutoUnbox= new ArrayList<Double>();
	doubleAutoUnbox.add(30.2);
	System.out.println(doubleAutoUnbox.get(0));
	
	Stack<Integer> stack =new Stack<>();
	stack.push(2);
	stack.push(8);
	stack.push(6);
	stack.push(7);
	stack.push(2);
	stack.push(10);
	stack.push(1);
	
	for(Integer demo: stack) {
		System.out.println(demo);
		
	}
}
}
