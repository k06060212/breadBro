package chap02;

public class Sample16 {

	public static void main(String[] args) {
		
//		int num = random.nextInt(3) + 1;		// 0 ~ 2 --> 1 ~ 3
		int num = (int)(Math.random() * 3 + 1);
		System.out.printf("난수 : %d", num);

	}

}
