package chap08.vo;

public class Sample16 {
	public static void main(String[] args) {
//		System.out.println(new Sample16().toString());
		
		String A = new String("빵형");
		String B = "빵형";
		String C = "빵형";
		String D = new String("빵형");
		
		if(A == B) {
			System.out.println("A와 B는 주소가 같습니다");
		}else {
			System.out.println("A와 B는 주소가 다른 주소입니다.");
		}
		
		if(A.equals(B)) {
			System.out.println("A와 B는 같은 값입니다.");
		}else {
			System.out.println("A와 B는 서로 다른 값입니다.");
		}
		
		if(C == B) {
			System.out.println("A와 B는 주소가 같습니다");
		}else {
			System.out.println("A와 B는 주소가 다른 주소입니다.");
		}
		
		if(C.equals(B)) {
			System.out.println("A와 B는 같은 값입니다.");
		}else {
			System.out.println("A와 B는 서로 다른 값입니다.");
		}
		
		System.out.printf("%s%s%s%s", A, B, C, D);
	}
}
