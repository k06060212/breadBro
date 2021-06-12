package chap14;

public class Sample19 {

	@Override
	public String toString() {
		return "Sample19";
	}
	
//	@Override
	public int toInteger() {
		// The method toInteger() of type Sample19 must override or implement a supertype method
		return 0;
	}
	
	// @Override은 머세드에 적용하는 애너테이션이고 소스코드 레벨에서 개발 가이드하는 용도이며
	// 메서드가 오버라이드 대상이 아니면 에어를 발생시킵니다.
	
	// 12라인엔 에러 메시지를 주석으로 붙여둠...
}
