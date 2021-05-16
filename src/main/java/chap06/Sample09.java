package chap06;

public class Sample09 {
	public static void main(String[] args) {
		String str = "Hello, Java";

		// toCharArray() 메소드를 이용하여 char 자료형인 배열로 변환해준다.
		char[] chr = str.toCharArray();

		for(char c : chr) {
			System.out.println(c);
		}
	}
}
