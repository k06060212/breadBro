package chap02;

import java.util.HashMap;
import java.util.Map;

// var
public class Sample13 {
	
	public static void main(String[] args) {	
		var i = 365;	//int i = 365;
		System.out.println(i);
		
		var j = 55L; //long j =55l;
	
		Map<String, String> map = new HashMap<String, String>();
		var map2 = new HashMap<String, String>();
		System.out.println(map2.toString());
		
//		var name;	// Ÿ�� �߷��������� ����(���ͷ�) �־����� ������ �߷����� ���ϹǷ� ���� �߻�
		var name = "���";
		var age = 28;
		var height = 185.6f;
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
	}

}
