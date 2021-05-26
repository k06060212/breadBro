package chap08.vo;

public class Sample01 {
	
	/* 필드 영역 시작*/
	String name = "멤버 변수";	// 접근제어자가 생량된 멤버 변수
	
	private int age; 		// 접근제어자가 있는 멤버 변수
	
//	var age = 10;			// 지역 변수인 타입추론 변수는 사용할 수 없음
	/* 필드 영역 끝*/
	
	/* 메서드 영역 시작*/
	public static void main(String[] args) {	}
		
	public void sayHello() {
		var friend = "친구야";	// 메서드 내의 변수를 지역변수라고 함.
		System.out.printf("%s 안녕?\n", friend);
	}
	
	public void sayHello(String friend) {	// 오버로딩
		System.out.printf("%s 안녕?\n", friend);
	}

	public String getName() {	// Getter
		return name;
	}


	public void setName(String name) {	// Setter
		this.name = name;
	}
	
	/* 메서드 영역 끝*/
	
	/* 생성자 영역 시작 */
	
	public Sample01() {
//		super();
	}
		
	public Sample01(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	/* 생성자 영역 끝 */

}
