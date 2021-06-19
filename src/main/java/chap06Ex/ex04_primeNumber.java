package chap06Ex;

/**
 * @author k0606
 * 
 * 문제 : 1부터 100까지의 수 중에서 소수만 출력하세요
 * 
 * 소수란? : 1과 자기 자신 이외의 자연수로는 나누어 떨어지지 않는 자연수이다.
 */
public class ex04_primeNumber {
	public static void main(String[] args) {
		// 자연수 2 ~ 100
		for(int i = 2; i <= 100; i++ ) {
			boolean f = true;
			
			// 1보다 크고 자신보다 작은 자연수
			for(int j = 2; j < i; j++) {
				if((i % j) == 0) {
					f = false;
				}
			}
			if(f) {
				System.out.println(i);
			}
		}
	}
}
