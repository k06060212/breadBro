package chap08.Sample03;

public class Data {
	int value;
	
	void setValue(int value) {
		// this는 이 class 자신을 가리킨다.
		this.value = value;
	}
	
	int getValue() {
		return value;
	}
	
	// 또는 아래와 같이 사용한다.
	
//	void setValue(int val) {
//		// this는 이 class 자신을 가리킨다.
//		value = val;
//	}
//	
//	int getValue() {
//		return value;
//	}
}
