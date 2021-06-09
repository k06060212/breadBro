package chap09;

public class Sample02 {

	public static void main(String[] args) {
		Car car1 = new ElectricCar("red", "Hyundai");
		car1.printInfo();
//		car1.setColor("Gray");	// 자손 클래스를 자료형으로 사용해서 정의된 모든 메서드를 사용할 수 있다.
		
		car1 = new GasolineCar("red", "Hyundai");
		car1.printInfo();
	}
}
