package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import lombok.Getter;
import lombok.Setter;

public class Sample12 {}

@Getter
@Setter
class Person<@NullTest T>{
	private T t;
}

@Target(ElementType.TYPE_PARAMETER)
@interface NullTest{}

// JDK 1.8 이후
// TYPE_PARAMETER 제네릭 매개변수 타입 선언 시에 사용하는 요소