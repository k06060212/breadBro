package chap08.vo;

import chap08.Sample09_1.Data;

public class Sample09 {
	public static void main(String[] args) {
		Data data1 = new Data();
		System.out.println(data1.toString());

		Data data2 = new Data("빵형", 22);
		System.out.println(data2.toString());
	}
}