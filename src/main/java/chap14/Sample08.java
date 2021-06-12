package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample08 {
	
	private String test;
	
	public static void main(String[] args) {}
	
	@Sample08AnnoConstructor
	public Sample08(String test) {
		this.test = test;
	}
}

@Target(ElementType.CONSTRUCTOR)
@interface Sample08AnnoConstructor{}

// 생성사 전용 애너테이션, 생성자에만 애너테이션을 적용하도록 제한하는 요소
