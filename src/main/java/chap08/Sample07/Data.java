package chap08.Sample07;

public class Data {
	
	String name;
	int age;

	public Data() {
		System.out.println("Data를 초기화 합니다.");
		name = "빵형";
		age = 21;
	}

	public Data(String name) {
		super();
		this.name = name;
	}

	public Data(String name, int age) {
//		super();
		System.out.println("Data를 초기화 합니다.");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
	

}
