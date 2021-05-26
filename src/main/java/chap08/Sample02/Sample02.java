package chap08.Sample02;

public class Sample02 {
	
	public static void main(String[] args) {
		VO vo = new VO();
		vo.name = "빵형";
		vo.age = 21;
		
		System.out.printf("%s은(는) %d살\n", vo.name, vo.age);
		System.out.printf("%d + %d = %d", VO.ONE, VO.TWO, VO.THREE);
	}
}
