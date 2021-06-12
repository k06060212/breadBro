package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample07 {

	private String test;
	
	public static void main(String[] args) {}
	
	public void testMethod(@Sample07AnnoParameter int testNo) {}
}

@Target(ElementType.PARAMETER)
@interface Sample07AnnoParameter{}

// testMethod() 메서드 안에 파라미터 앞에 애너테이션을 넣었습니다.
