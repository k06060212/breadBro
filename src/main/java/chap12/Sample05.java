package chap12;
// 값을 갖는 열거형
public class Sample05 {
	public static void main(String[] args) {
		FLOWER flower = FLOWER.ROSE;
		System.out.printf("I have a %s", flower.getName());
	}
}

enum FLOWER{
	SUNFLOWER("sunflower"), ROSE("rose");
	
	private final String name;
	
	private FLOWER(String flowerName) {
		this.name = flowerName;
	}
	
	public String getName() {
		return name;
	}
}
