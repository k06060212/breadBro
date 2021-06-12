package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Sample04AnnoClass
public class Sample04 {
	private String test;
	
	public static void main(String[] args) {
		
	}
	
	public void testMethod() {
		
	}
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)		// Class, interface, @interface, enum
@interface Sample04AnnoClass{}

// 22라인에서 TYPE으로 적용했으니 클래스명에서는 오류가 발생하지 않지만
// 메서드나 변수명 위에 작성하면 오류가 발생합니다.