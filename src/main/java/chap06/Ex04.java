package chap06;

public class Ex04 {
	public static void main(String[] args) {
//		1부터 100까지의 수 중에서 소수만 출력하세요
		
//		소수
//		1과 자기 자신 이외의 자연수로는 나누어 떨어지지 않는 자연수이다.
		
		// 2부터 100까지의 자연수
		for(int i = 2; i <= 100; i++) {
			boolean f = true;
			
			// 1보다 크고 자신보다 작은 자연수
			for(int j = 2; j < i; j++) {
				// 자신보다 작은 수로 나누어지는 수는 자연수가 아님
				if((i % j) == 0) {
					f = false;
				}
			}
			if(f) System.out.printf("%d\t", i);
		}
	}
}
