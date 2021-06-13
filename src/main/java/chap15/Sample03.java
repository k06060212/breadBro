package chap15;

public class Sample03 {

	public static void main(String[] args) {
		// 대상 문자열
		String[] str = {"ASDF12", "123456", "QWERTY", "as45aa", "567jkl"};
		String regex = "^[0-9A-Z]*{6}$";
		for(String data : str) {
			System.out.printf("%s \t %b\n", data, data.matches(regex));
		}
	}
}

// 정규표현식 대상의 글자수
// 한 개의 문자만 확인하는 게 아니라면 {}를 활용해서 개수 제한하는 것을 잊지 말아야 합니다.
// 아니면 *를 해서 연속 문자임을 알려줘야 합니다. 
// 그렇지 않으면 1개의 문자만 확인하고 true나 false값을 반환합니다.