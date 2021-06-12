package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample11 {
	
}

@Target(ElementType.PACKAGE)
@interface DontUseIt{}

// PACKAGE는 package-info.java 파일의 상단에 위치한 패키지에 적용할 떄 사용합니다.

// package.info.java 파일에 package 상단에 '@DontUseIt'을 붙였습니다.

// 파일마다 위치한 package에 적용하는 것이 아니라 package-info.java 파일에만 적용한다는 점을 유의해야 합니다.
