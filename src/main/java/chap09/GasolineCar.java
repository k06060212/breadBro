package chap09;

public class GasolineCar extends Car{

	public GasolineCar(String color, String manufacturer) {
		super(color, manufacturer);
	}
	
	/**
	 * @Override 어노테이션이 있으면
	 * 이 메서드는 오버라이드된 거구나 라고 직관적으로 알 수 있습니다.
	 */
	@Override
	public String fillUp() {
		return "휘발유를 주유합니다.";
	}

}
