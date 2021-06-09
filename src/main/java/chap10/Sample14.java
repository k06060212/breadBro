package chap10;
// 와일드카드 제네릭 타입(Generic Unbounded wildcard)
public class Sample14 {
	public static void main(String[] args) {
		// 내 지갑
		wallet myWallet = new wallet();
		
		// Pocket money
		Money<Integer> m1 = new Money();
		m1.getMoney(10000);
		
		// Part time job
		Money<Integer> m2 = new Money();
		m2.getMoney(20000);
		
		myWallet.insertMoney(m1);	// 용돈을 넣는다.
		myWallet.insertMoney(m2);	// 알바비를 넣는다.
		
		// 지갑을 확인한다.
		System.out.println(myWallet.checkWalletMoney());;
	}
}

class wallet{
	double totalMoney = 0;
	
	public void insertMoney(Money<?> myMoney) {
		totalMoney += myMoney.getMyMoney();
	}
	
	public double checkWalletMoney() {
		return totalMoney;
	}
}

class Money<E extends Number>{
	double myMoney;
	
	public void getMoney(E info) {
		this.myMoney += info.doubleValue();
	}
	
	public double getMyMoney() {
		return myMoney;
	}
}

