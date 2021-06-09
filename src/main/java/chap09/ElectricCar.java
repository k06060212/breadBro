package chap09;

import lombok.AllArgsConstructor;

public class ElectricCar extends Car {
	
	
	public ElectricCar(String color, String manufacturer) {
		super(color, manufacturer);
	}

	@Override
	public String fillUp() {
		return "전기를 충전합니다.";
	}

	public void setColor(String color) {
		this.color = color;
	}
}
