package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample09 {

	private String test;
	
	public static void main(String[] args) {}
	
	public void test() {
		@Sample09AnnoLocalVariable
		String test = this.test;	
	}
}

@Target(ElementType.LOCAL_VARIABLE)
@interface Sample09AnnoLocalVariable{}


// 지역 변수에만 사용할 수 있도록 대상을 제한
// 지역 변수라고 하면 메서드나 생성자 안에서 사용하는 필드를 말함
