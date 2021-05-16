package chap06;

public class Sample06 {
//		구구단 출력 1까지만 출력하고 중단.
//		2 x 1
//		3 x 1
	public static void main(String[] args) {
		for(int i=2; i <= 9; i++) {
			for(int j=1; j<=9; j++) {
				if(j == 1) {
					System.out.printf("%d X %d = %d \n", i, j, i*j);
					break;
				}
			}
		}
		
		System.out.println("==================================");
		
		for(int i=2; i <= 9; i++) {
			for(int j=1; j<=1; j++) {
				System.out.printf("%d X %d = %d \n", i, j, i*j);
			}
		}
	}
}
