package chap08.Sample09_1;

public class Data {
	String name;
	int age;
	
	public Data() {
		// 매개변수의 값이 없을 경우 이름은 무명 나이는 0살로 처리한다.
		this("무명", 0);
	}
	
	public Data(String name, int age) {
		System.out.println("Data를 초기화 합니다.");
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 초기화된 내용을 출력하기 위한 메서드
	 */
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
}
