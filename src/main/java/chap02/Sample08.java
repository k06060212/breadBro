package chap02;

public class Sample08 {

	public static void main(String[] args) {
		int a = 65;
		byte b = (byte)a;	// int�� byte�� ����� �� ��ȯ
		System.out.println(b);
		
		b = (byte)(a+1);	// a + 1 ���� ���� �� byte�� ����� �� ��ȯ
		System.out.println(b);
		
		a = b;				// byte b�� �� ū ������ ���� int a�� �ڵ� �� ��ȯ
		System.out.println(b);
		
		b = (byte)a;		// int a�� byte b�� ���� ������ byte�� ���� �� ��ȯ
		System.out.println(b);
	}
}
