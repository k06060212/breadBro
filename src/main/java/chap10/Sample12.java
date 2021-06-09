package chap10;
// 제너릭 메서드(Generic Method) 활용

public class Sample12 {
	public static void main(String[] args) {
		Data data = new Data();
		data.setValue(3);
		System.out.println(data.getValue());
	}
}

class Data{
	String value;
	public<T> void setValue(T t) {
		this.value = t.toString();
	}
	
	public String getValue() {
		return this.value;
	}
}
