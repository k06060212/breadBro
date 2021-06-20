package chap07Ex;

import java.util.Scanner;

/**
 * @author k0606
 *
 * 문제 :	1 ~ 5 사이에 있는 임의의 수를 키보드로부터 입력해서 몇 번 만에 맞추는지 알아보는 프로그램을 작성하세요.
 * 
 * 보기 :	컴퓨터가 생각하는 수를 입력하세요 : 1
 * 		컴퓨터가 생각하는 수를 입력하세요 : 2
 * 		컴퓨터가 생각하는 수를 입력하세요 : 3
 * 		축하합니다. 3번만에 맞췄습니다.
 */
public class ex06_whereIsNum {
	public static void main(String[] args) {
		int goal = (int)(Math.random() * 5 + 1);	// 컴퓨터가 생각하는 수
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int target = 0;
		boolean loopFlag = true;
		do {
			cnt++;
			System.out.print("컴퓨터가 생각하는 수를 입력하세요 : ");
			target = sc.nextInt();
			if(target == goal)loopFlag = false;
		}while(loopFlag);
		
		System.out.printf("축하합니다. %d번만에 맞췄습니다.", cnt);
	}
}
