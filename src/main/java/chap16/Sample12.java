package chap16;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Sample12 {
	public static void main(String[] args) {
		int myMoney = 100000;
		
		// 10% 세금을 납부합니다.
		Function<Integer, Integer> work = (money) -> {
			System.out.printf("* [%d] 세금을 납부합니다.\n", (int)(money * 0.1));
			return money = (int)(money * 0.9);
		};
		
		// 수익금을 더합니다.
		Function<Integer, Integer> before = (income) -> {
			System.out.printf("* [%d] 수입이 발생했습니다. \n", income);
			return income;
		};
		myMoney = work.apply(myMoney);
		printInfo(myMoney);
		myMoney += work.compose(before).apply(30000);
		printInfo(myMoney);
	}
	
	public static void printInfo(int myMoney) {
		DecimalFormat df = new DecimalFormat("##,###,###");
		System.out.println("잔액 : " + df.format(myMoney));
	}
}

// 21라인에서 apply() 메서드로 세금을 내는 work 람다식이 호출
// 다음으로 수입이 발생하여 수입금에 대한 세금을 납부하고 
// 나머지 금액을 myMoney변수에 더하는 식을 호출해야 합니다.
// 그런데 세금 납부 전에 수입금에 대한 함수인 befor 함수를 먼저 호출하는 compose() 메서드를 통해서 실행한 후에 
// work 함수가 before의 결과를 받아서 work 함수가 실행되도록 작업 순서를 조립한 후 apply()메서드로 실행되었습니다.