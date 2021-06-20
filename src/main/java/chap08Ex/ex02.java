package chap08Ex;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author k0606
 *
 * 문제 :	이름, 나이, 연락처 정보를 담는 객체를 만들어서 여러 명의 정보를 등록한 뒤에
 * 		이름을 검색하는 기능을 구현하여 검색된 정보를 출력한는 코드를 작성하세요.
 * 		(단, 이름은 키보드로부터 입력받은 값으로 검색하고 이름에 '0(영)'을 입력하면 프로그램을 종료합니다.)
 */
public class ex02 {
	public static void main(String[] args) {
		
		int idx = 0;
		Friend[] personInfo = new Friend[5];
		personInfo[idx++] = new Friend("Dobi1", 100, "010-1234-1234"); 
		personInfo[idx++] = new Friend("Dobi2", 101, "010-1234-1235"); 
		personInfo[idx++] = new Friend("Dobi3", 102, "010-1234-1236"); 
		personInfo[idx++] = new Friend("Dobi4", 103, "010-1234-1237"); 
		personInfo[idx++] = new Friend("Dobi5", 104, "010-1234-1238"); 
		
		System.out.println("== List ==");
		for(Friend friend : personInfo) {
			System.out.println(friend.getName());
		}
		System.out.println();
		
		do {
			System.out.println("신상을 알고싶은 사람의 이름을 입력해주세요 : ");
			String in = new Scanner(System.in).next();
			
			if("0".equals(in)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				for(Friend friend : personInfo) {
					if(friend.getName().equals(in)) {
						System.out.println(friend.toString() + "\n");
					}
				}
			}
		}while(true);
	}
}

@Data
@AllArgsConstructor
class Friend{
	private String name;
	private int age;
	private String phoneNum;
}
