package chap02;

public class Sample06 {

	public static void main(String[] args) {
		int a = 32767;	// short 최대값
		short b = 40;
		
//		b = a;	int형을 short형으로 변환할 수 없다는 error 발생
		b = (short) a;
		System.out.println(b);	// 32767
		
		int c = 32768;	// short 최대값 + 1, 또는 다른 값을 넣어서 test 해본다.
		b = (short) c;	// 명시적 형 변환
		System.out.println(b);	// -32768 음수가 아닌데 음수로 나왔다.
	}
}
