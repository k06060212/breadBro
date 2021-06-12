package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

public class Sample15 {

	public static void main(String[] args) {
		System.out.println("Annotations : " + Arrays.toString(TargetClass.class.getAnnotations()));
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface NotInheritClass{}

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface InheritClass{}

@InheritClass
@NotInheritClass
class SuperClass{}

class TargetClass extends SuperClass{}

// 특정 클래스를 상속받아서 구현하는 클래스를 자식 클래스 혹은 자손 클래스라 부릅니다.
// 애너테이션도 마찬가집니다.
// 조상 클래스로부터 상속받을 때 '@Inherited'이 삽입된 애너테이션이 있다면
// 상속받는 클래스 정보와 함께 조상 클래스가 갖고 있는 애너테이션도 함께 상속 받게 됩니다.
