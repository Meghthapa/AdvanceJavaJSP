package loop;

import java.awt.DisplayMode;

class data2<K,V>{
	private K key;
	private V value;

	public data2(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	public<E,N> void DisplayMode(E element,N number) {
		System.out.println("Element is:"+element+" Number is :"+ number);
	}
} 

class BoundedType {
	public static void main(String[] args) {
		data2<Integer,String> dtData = new data2<Integer,String>(1, "value");
		dtData.DisplayMode("element", 1);
	}
 }
	


