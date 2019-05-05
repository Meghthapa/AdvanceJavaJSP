package loop;

class genericstype<T>{
	private T data;

	public genericstype(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}	
public class Genericstest {
	
  public static void main(String[] args) {
	genericstype<String> gsGenericstype = new genericstype<String>("Megh");
	String sometextString= gsGenericstype.getData();
	System.out.println(sometextString);
}
}
