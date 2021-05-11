package chap02;

public class Sample14 {
	public static void main(String[] args) {

		// 상수 만드는 방법
		//		final [자료형] 변수명 = 리터럴
		
		final float PI; 	// 초기값을 정하지 않고 PI를 상수로 선언
		PI = 3.14f; 		// 최초 값을 선언한다. 이후 PI값을 변경하면 오류가 발생한다.
//		PI = 3.141592f;		// The final local variable PI may already have been assigned
		
		final var PI2 = 3.141592f;
		
		int radius = 10;
		
		float area = radius * radius * PI;
		
		System.out.printf("원의 넓이 : %f" , area);
	}

}
