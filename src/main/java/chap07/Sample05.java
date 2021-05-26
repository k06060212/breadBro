package chap07;

public class Sample05 {
	public static void main(String[] args) {
//		switch(변수 or 연산식 or enum) {
//		case 1: System.out.println("1");
//			break
//		case 2: System.out.println("2");
//		case 3: System.out.println("3");
//		default: System.out.println("끝");
//		}
		
		int in = 10;
		
		switch(in) {
		case 10: System.out.println("10");
		case 9: System.out.println("9");
		case 8: System.out.println("8");
		case 7: System.out.println("7");
		case 6: System.out.println("6");
		case 5: System.out.println("5");
		case 4: System.out.println("4");
		case 3: System.out.println("3");
		case 2: System.out.println("2");
		case 1: System.out.println("1");
		default: System.out.printf("%d부터 1까지의 숫자를 출력했습니다.\n", in);
		}
		
		switch(in) {
		case 10: System.out.println("10");
		break;
		case 9: System.out.println("9");
		break;
		case 8: System.out.println("8");
		break;
		case 7: System.out.println("7");
		break;
		case 6: System.out.println("6");
		break;
		case 5: System.out.println("5");
		break;
		case 4: System.out.println("4");
		break;
		case 3: System.out.println("3");
		break;
		case 2: System.out.println("2");
		break;
		case 1: System.out.println("1");
		break;
		default: System.out.printf("%d부터 1까지의 수가 아닙니다.\n", in);
		}
	}
}
