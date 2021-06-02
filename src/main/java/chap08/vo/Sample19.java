package chap08.vo;

public class Sample19 {

	public static void main(String[] args) {
		// 1. 내 지갑에 10,000원 있음
		Wallet myWallet = new Wallet(10000);
		
		// 2. 2,000원짜리 물품을 구했으며 세금 10% 더해서 2,200원 지불함
//		myWallet.myMoney -= 2200;
		myWallet.pay(2000);
		
		// 3. 내 지갑의 남은 돈을 확인
		myWallet.checkMyMoney();
	}
}

class Wallet{
	private int myMoney;
	
	public Wallet(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void checkMyMoney() {
		System.out.println("남은 돈 : " + myMoney);
	}
	
	public void pay(int payMoney) {
		myMoney -= (int)(payMoney * 1.1);
	}
}
