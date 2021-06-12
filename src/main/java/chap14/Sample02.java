package chap14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Sample02Anno
public class Sample02 {
	@Sample02Anno
	public void test() {
		
	}
}

@Retention(RetentionPolicy.SOURCE)
@interface Sample02Anno{
	
}
