package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample06 {

	private String test;
	
	private Color1 color = Color1.RED;
	
	public static void main(String[] args) {
	
	}
	
	@Sample06AnnoMethod
	public void testMethod() {
		
	}
}

@Target(ElementType.METHOD)
@interface Sample06AnnoMethod{}

// 대상을 메서드명에서만 적용할 수 있또록 사용을 제한합니다.