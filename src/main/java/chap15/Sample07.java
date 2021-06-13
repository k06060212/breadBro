package chap15;

public class Sample07 {
	public static void main(String[] args) {
		// 대상 문자열
		String[] str = {"ASDF12", "123456", "QWERTY", "as45aa", "567jkl"};
		String regex = "[^0-9]";
		
		for(String data : str) {
			System.out.printf("%s \t %S\n", data, data.replaceAll(regex, ""));
		}
	}
}

// 특정 문자열을 찾아서 모두 치환하는 String 클래스의 replaceAll() 메서드가 있습니다.

// 데이터에서 숫자가 아닌 값을 모두 제거하는 프로그램을 작성