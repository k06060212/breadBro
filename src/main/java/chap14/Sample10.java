package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample10 {

	public static void main(String[] args) {

	}		
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Sample10AnnoAnnotationType{}

@Sample10AnnoAnnotationType
@interface Sample10Anno{}

/*
 *	ANNOTATION_TYPE은 @interface을 통해서 애너테이션을 만드는 애너테이션을 정의할 때 사용하는 요소
 *	지금 @Target의 경우도 애너테이션을 정의할 때 사용하는 애너테이션입니다. 
 **/

 