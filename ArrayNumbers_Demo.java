package Iot_Java.day07;

import java.util.Scanner;

public class ArrayNumbers_Demo {
	/*
	 * n���� ���ڸ� Ű����� �Է¹޾� �迭�� ������ �� 
	 * ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * */
	public static void main(String[] args) {
		//n��
		final int N = 5;
		int [] result = new int[N];
		// Ű���� �Է� �غ�
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < result.length; i++) {
			// Ű���带 ���� �ݺ��ؼ� 5���� ���ڸ� �Է� �޴´�
			System.out.println((i+1) + " ��° ���ڸ� �Է��Ͻÿ�.");
			result[i] = sc.nextInt();
		}
		for ( int i = 0; i < N; i++) {
			System.out.println(result[i] + "\t");
		}
		// ���� ū ���ڸ� �ݺ����� ���� ã�Ƴ���
		int max = Integer.MIN_VALUE;
		// ��Ƽ�� ������ �������߿� ���� �ּҰ��� ��������
		//int max = result[0];
		for ( int i = 0; i < N; i++) {
			if ( max < result[i]) {
				max = result[i];
			}
		}
		// ã�Ƴ� ���� ū ���ڸ� ����Ѵ�
		System.out.println();
		System.out.println("�ִ밪: " + max);
	}
}
