package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample15 {
	public static void main(String[] args) {
//		6. Arrays.asList()
//		- List 자료형에 배열을 쉽게 추가하는 메서드
//		
//		- Arrays.asList(T...a) 메서드
//			Static <T> List<T> asList<T... a>
//			- 입력한 인자를 배열로 반환하여 등록	
//		
//		- List에서 대표적으로 ArrayList 클래스를 배열로 제일 많이 사용하게 되는데
//		- ArrayList 자료형에 데이터를 삽입하는 방법은 add() 메서드를 활용해서
//		- 한 번에 한 개씩밖에 넣을 수 없는점 때문에 
//		- asList()를 활용하여 쉽게 데이터를 삽입할 수 있다. (Sample15)
		
		// 배열에서 데이터 추가하는 방법 1
		var students1 = new String[7];
		students1[0] = "스노우 화이트";
		students1[1] = "멀린";
		students1[2] = "레지나";
		students1[3] = "애버리지";
		students1[4] = "잭";
		students1[5] = "아더";
		students1[6] = "한스";
		
		// 배열에서 데이터 추가하는 방법 2
		var students2 = new String[] {"스노우 화이트", "멀린", "레지나", "애버리지", "잭", "아더", "한스"};
		
		// List에서 데이터 추가하는 방법1
		List<String> students3 = new ArrayList<>();
		students3.add("스노우 화이트");
		students3.add("멀린");
		students3.add("레지나");
		students3.add("애버리지");
		students3.add("잭");
		students3.add("아더");
		students3.add("한스");
		
		// List에서 데이터 추가하는 방법2
		List<String> students4 = Arrays.asList("스노우 화이트", "멀린", "레지나", "애버리지", "잭", "아더", "한스");
		
		System.out.println(Arrays.toString(students1) + " - Array 1");
		System.out.println(Arrays.toString(students2) + " - Array 2");
		System.out.println(students3 + " - List 1"); 
		System.out.println(students4 + " - List 2"); 
	
	}
}
