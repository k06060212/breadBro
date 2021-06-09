package chap09.Sample04;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Pet {
	private boolean wing;
	private int legCount;
	
	public String isWing() {
		String str;
		if(this.wing) {
			str = "날 수 있다.";
		}else {
			str = "날 수 없다.";
		}
		return str;
	}

//	public Pet(boolean wing, int legCount) {
//		this.wing = wing;
//		this.legCount = legCount;
//	}

//	public int getLegCount() {
//		return legCount;
//	}
	
	// 추상클래스
	public abstract void run(String name);

	

	
}
