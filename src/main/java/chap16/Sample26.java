package chap16;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Sample26 {
	
	public static void main(String[] args) {
		var list = Arrays.asList( new Person(1, "빵형")
								, new Person(2, "상도")
								, new Person(3, "인호")
								, new Person(4, "학건"));
		
		System.out.println("== 람다식");
//		list.forEach(list.forEach(x -> x.toObjString());
		System.out.println("== 메서드 참조");
		list.forEach(Person::toObjString);
	}
}

@Getter
@Setter
@AllArgsConstructor
class Person{
	private Integer no;
	private String name;
	
	public void toObjString() {
		System.out.println("Person [no=" + no + ", name=" + name + "]");
	}
}

// 27라인에서 Person 클ㄹ래스를 정의하고 12라인에서 ArrayList에 Person 자료형으로 인스턴스를 생성하여 배열에 담습니다.
// 17라인과 19라인에서 forEach() 메서드를 통해서 해당 자료형을 하나하나 꺼내어 
// 지정된 Person 객체의 toObjString() 메서드를 호출하여 배열의 정보를 출력합니다.
// 이것이 17라인의 람다식을 19라인에서 특정 객체의 인스턴스 메서드 참조로 구현한 것입니다.
