package chap02;

public class Sample06 {

	public static void main(String[] args) {
		int a = 32767;	// short �ִ밪
		short b = 40;
		
//		b = a;	int���� short������ ��ȯ�� �� ���ٴ� error �߻�
		b = (short) a;
		System.out.println(b);	// 32767
		
		int c = 32768;	// short �ִ밪 + 1, �Ǵ� �ٸ� ���� �־ test �غ���.
		b = (short) c;	// ����� �� ��ȯ
		System.out.println(b);	// -32768 ������ �ƴѵ� ������ ���Դ�.
	}
}
