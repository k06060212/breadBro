package chap07Ex;

import java.util.Random;
import java.util.Scanner;

/**
 * @author k0606
 *
 * 문제 :	[가위바위보 게임]으로 키보드로부터 값을 입력받아서 랜덤값과 비교하여 승리 여부를 출력합니다.
 * 		입력받는 값은 1자리 숫자로 가위는 1을 바위는 2를 보는 3을 입력받습니다.
 * 		0을 입력하기 전까지 무한 반복 처리하며 0을 입력할 경우 프로그램을 종료합니다.
 * 		[가위(1), 바위(2), 보(3), 종료(0)]
 * 
 * 	예)	숫자를 입력하세요 : 1
 * 		컴퓨터 : 2
 * 		결과 : 패	
 * 		숫자를 입력하세요 : 0
 * 		프로그램을 종료합니다.
 */
public class ex02_paperRockScissors {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		while(sc.hasNextInt()) {
			int you = sc.nextInt();
			if(you == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int com = random.nextInt(3) + 1; 
			
			System.out.printf("컴퓨터 : %d\n", com);
			if(you != 3) {
				String result = (you - com) == 0 ? "비김" : (you - com) == -1 ? "패" : "승";				
				System.out.printf("결과 : %s\n", result);
			}else {
				String result = (you - com) == 0 ? "비김" : (you - com) == 1 ? "승" : "패";
				System.out.printf("결과 : %s\n", result);				
			}
			System.out.printf("숫자를 입력하세요 :");
		}
	}
}
