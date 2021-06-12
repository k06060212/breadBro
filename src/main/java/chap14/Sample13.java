package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.HashMap;

public class Sample13 {
	public static void main(String[] args) {
		var map = new HashMap<@UseTest String, @UseTest String>();
		
		// Sample12의 Person 클래스
		Person<@UseTest String> person = new Person<>();
	}
}

@Target(ElementType.TYPE_USE)
@interface UseTest{}

// TYPE_PARAMETER 와는 반대로 제네릭 타입을 사용할 때 적용하는 애너테이션입니다.
