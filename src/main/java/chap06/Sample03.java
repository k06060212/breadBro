package chap06;

public class Sample03 {
	// String 자료형을 char 자료형의 배열로 받아서 for문을 이용해서 한 줄로 출력
	public static void main(String[] args) {
		String str = "Hello, Java";
		
		// toCharArray() 메소드를 이용하여 char 자료형인 배열로 변환해준다.
		char[] chr = str.toCharArray();
		
		for(int i = 0; i < chr.length; i++) {
			System.out.println(chr[i]);
		}
	}
	
}
