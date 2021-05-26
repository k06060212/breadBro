package chap08.Sample02;

public class VO {
	// 인스턴스 변수
	String name;
	int age;
	
	// 클래스 변수(상수)
//	static final int ONE = 1;
//	static final int TWO = 2;
//	static final int THREE = 3;
	
//	public static final int ZERO = 0;	// 상수 
	public static int ZERO = 0; 		// 스태틱 변수
	
	// 이와 같이 사용하는 사람도 있다.
	static final int ONE;
	static final int TWO;
	static final int THREE;
		
	static {
		ONE = 1;
		TWO = 2;
		THREE = 3;
	}
}