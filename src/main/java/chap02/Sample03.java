package chap02;

public class Sample03 {

	public static void main(String[] args) {
		byte   a1 = -128;		// byte �ּҰ�
		byte   a2 = 127;		// byte �ִ밪
		short  b1 = -32768;	// short �ּҰ�
		short  b2 = 32767;	// short �ִ밪
		int    c = 10000;
		long   d = 10000L;
		float  e = 10.1f;
		double f = 10.1;
		
		System.out.printf("byte : %d,\t\t short : %d%n", a1, b2);
		System.out.printf("int : %d,\t\t long : %d%n", c, d);
		System.out.printf("int : %f,\t long : %f%n", e, f);
		
//		alt + shift + a �������
	}
}
