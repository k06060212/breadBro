package chap08Ex;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author k0606
 *
 * 문제 :	이름(String name)과 나이(int age)를 멤버 필드로 갖는 Member 클래스를 작성하고 
 * 		빌더 패턴의 형태로 3명의 정보를 Member 배열에 등록하고 출력하는 프로그램을 작성하세요.
 */
public class ex04 {
	public static void main(String[] args) {
		Member[] member = new Member[3];
		int idx = 0;
		member[idx++] = Member.builder()
							  .name("빵형")
							  .age(10)
							  .build();
		member[idx++] = Member.builder()
					  		  .name("빵형2")
							  .age(11)
							  .build();
		member[idx++] = Member.builder()
							  .name("빵형3")
							  .age(12)
							  .build();
		
		System.out.println(Arrays.deepToString(member));
	}
}

@ToString
class Member{
	private String name;
	private int age;
	
	@Builder
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
