package chap02;

public class Sample01 {
	
	public static void main(String[] args) {

//		[������ �ڷ���] [������] =  ���ͷ�
		
//		�⺻ �ڷ���
//		1. ����
//		2. ������
//		3. ������
		
//		������
		int score = 100;
		score = score + 200;
		System.out.printf("%d", score);
		
		System.out.println("==========================");
//		����(���� ������ �տ� is�� �ٿ��ش�. ���� �ϴ��� ���� �ʴ���, has ������ �ִ��� ������ ���� �ʴ���)
		boolean isExist = true;
		boolean hasClass = true;
		
		System.out.println("==========================");
//		������
		char chr = 'A';
		System.out.println("char : " + chr); 			// ����
		System.out.println("Incoding : " + (int)chr);	//
		System.out.println("Decoding : " + (char)65);	//
		
	}
}
