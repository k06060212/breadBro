package chap07Ex;

/**
 * @author k0606
 * 
 * 문제 :	ASCII표를 보고 'Internet of things'를 카멜 표기법(Camel Case)으로 출력하는 코드를 작성하세요.
 * 
 * 보기 :	모든 단어는 소문자이지만 공백 다음에 오는 알파벳은 공백을 제거하고 알파벳을 대문자로 변환한다.
 * 		입력값 : Internet of things
 * 		출력값 : InternetOfThings
 */
public class ex05_ASCII {
	public static void main(String[] args) {
		String word = "Internet Of Things";
		String result = "";
		
		// 1. 모두 소문자로 바꾼다.
		word = word.toLowerCase();
		
		// 2. charAt으로 공백인지 확인한다.
		boolean changeFlag = false;
		for(var c : word.toCharArray()) {
			// 3. 공백이면 제거하고 다음 문자를 대문자로 바꾼다.
			if(changeFlag) {
				changeFlag = false;
				c = (char)((int)c-32);
			}
			if(c == ' ') {
				changeFlag = true;
				continue;
			}
			result += c;
		}// 4. 반복한다.
		System.out.println("input : " + word);
		System.out.println("output : " + result);
	}
}
