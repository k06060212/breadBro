package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

public class Sample23<T> {

	// Potential heap pollution via varargs parameter toAdd
	@SafeVarargs
	public final void safe(T... toAdd) {
		
	}
	
	@SafeVarargs
	public final void safe(int... toAdd){
		
	}
	
	@SafeVarargs
	private void safe2(T... Add) {
		
	}
}

// @SafeVarargs 은 제네릭 타입의 가변 인자 사용으로 어떤 자료형이 몇 개가 어떻게 들어오는지 알 수 없을 때
// 어떠한 유해한 작업이 존재하지 않다고 알림으로써 경고 메시지를 표시하지 않는 애테이션입니다.

//@Documented
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
//public @interface SafeVarargs{}
