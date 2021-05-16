package chap06;

public class Sample11 {
	// 한개씩 늘어나는 *출력
	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			for(int j = 0; j < i; j++) {
				System.out.print("*"); 	// 실행문
			}
			System.out.println();
			i++;
			
		}while(i <= 5);
	}
}
