package Iot_Java.day07;

public class Gugudan_Demo {
	public static void main(String[] args) {
		/* 
		 * ������ �� 3���� ����� �迭�� ������ �� ����Ͻÿ�.
		 * */
		int dan = 3;
		int [] result = new int[9];
		for ( int i = 0; i < result.length; i++) {
			result[i] = 3 * (i + 1);
		}
		for ( int i = 0; i < result.length; i++) {
			System.out.println(dan + " X " + (i+1) + " = " + (dan * i) + 
					" arr[" + i + "] " + result[i] + " ");
		}
	}
}
