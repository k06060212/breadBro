package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Friend(name = "구미호")
public class Sample16 {
	public static void main(String[] args) {
		Sample16 sample = new Sample16();
		Friend friend = sample.getClass().getAnnotation(Friend.class);
		System.out.printf("내 친구는 %s", friend.name());
	}
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Friend{
	String name();
}

// Friend 애너테이션은 클래스 파일이 실행 중에 사용하기 위해서
// RUNTIME으로 설정했으며
// 클래스에 적용하기 위해서
// TYPE으로 설정했습니다.
// Friend의 멤버 필드로 name을 추가했으며 이는 name = "구미호" 처럼 값을 넣을 수 있습니다.
// name 필드를 value로 바꾸게 되면 다음과 같이 사용할 수도 있습니다.
// @Friend(value = "구미호") 혹은 @Friend ("구미호")

// 애너테이션 필드는 생략할 수 있습니다.
// 1개의 값을 출력했지만, 배열로 처리하고자 한다면 Sample17을 참고