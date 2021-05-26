package chap07;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		// [가위 바위 보]으로 키보드로부터 값을 입력받아서 랜덤값과 비교하여 승리 여부를 출력합니다.
		// 입력받는 값은 1자리 숫자로 가위는 1을 바위는 2를 보는 3을 입력받습니다.
		// 0을 입력하기 전까지 무한 반복 처리하며 
		// 0을 입력할 경우 프로그램을 종료합니다.
		// [가위(1), 바위(2), 보(3), 종료(0)]
		
		// 예) 출력
		// 숫자를 입력하세요 : 1
		// 컴퓨터 : 2
		// 결과 : 패
		// 숫자를 입력하세요 : 0
		// 프로그램을 종료합니다.
		
		Scanner sc = new Scanner(System.in);
		
		int in;
		int enemy;
		
//		if(enemy == 1) {
//			System.out.println("가위");
//		}else if(enemy == 2) {
//			System.out.println("바위");
//		}else if(enemy == 3) {
//			System.out.println("보");
//		}
//		
		// 방법 1 노가다..
//		System.out.print("숫자를 입력하세요 : ");
//		while(sc.hasNext()) {
//			in = sc.nextInt();	
//			enemy = (int)((Math.random() * 3) + 1);
//			if(in == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else if(in == 1) {
//				System.out.printf("컴퓨터 : %d\n", enemy);
//				if(enemy == 1 ) {
//					System.out.println("결과 : 무승부");
//				}else if(enemy == 2) {
//					System.out.println("결과 : 패");
//				}else if(enemy == 3) {
//					System.out.println("결과 : 승");
//				}
//			}else if(in == 2) {
//				System.out.printf("컴퓨터 : %d\n", enemy);
//				if(enemy == 1 ) {
//					System.out.println("결과 : 승");
//				}else if(enemy == 2) {
//					System.out.println("결과 : 무승부");
//				}else if(enemy == 3) {
//					System.out.println("결과 : 패");
//				}
//			}else if(in == 3) {
//				System.out.printf("컴퓨터 : %d\n1", enemy);
//				if(enemy == 1 ) {
//					System.out.println("결과 : 패");
//				}else if(enemy == 2) {
//					System.out.println("결과 : 승");
//				}else if(enemy == 3) {
//					System.out.println("결과 : 무승부");
//				}
//			}
//			System.out.print("숫자를 입력하세요 : ");
//		}
		
		// 방법 2. 개선
		// in, enemy 가위 1 바위 2 보 3
		// 승				// 패
		// 가위 경우 2			// 가위 -1
		// 바위 1				// 바위 -1
		// 보 1				// 보 2
	
		System.out.print("숫자를 입력하세요 : ");
		while(sc.hasNext()) {
			in = sc.nextInt();
			enemy = (int)((Math.random()*3)+1);
			if(in == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(in < 3) {
				String result = (in - enemy) == 0 ? "무승부" : (in - enemy)  ==  -1 ? "패" : "승";
				System.out.printf("컴퓨터 : %d\n", enemy);
				System.out.printf("결과 : %s\n", result);
			}else if(in == 3) {
				String result = (in - enemy) == 2 ? "패" : "승";
				System.out.printf("컴퓨터 : %d\n", enemy);
				System.out.printf("결과 : %s\n", result);
			}
			System.out.print("숫자를 입력하세요 : ");
		}
	}
}
