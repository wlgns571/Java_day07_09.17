package Iot_Java.day07;

import java.util.Scanner;

public class ArrayNumbers_Demo {
	/*
	 * n개의 숫자를 키보드로 입력받아 배열에 저장한 후 
	 * 가장 큰 수를 출력하는 프로그램을 작성하시오.
	 * */
	public static void main(String[] args) {
		//n개
		final int N = 5;
		int [] result = new int[N];
		// 키보드 입력 준비
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < result.length; i++) {
			// 키보드를 통해 반복해서 5개의 숫자를 입력 받는다
			System.out.println((i+1) + " 번째 숫자를 입력하시오.");
			result[i] = sc.nextInt();
		}
		for ( int i = 0; i < N; i++) {
			System.out.println(result[i] + "\t");
		}
		// 가장 큰 숫자를 반복문을 통해 찾아낸다
		int max = Integer.MIN_VALUE;
		// 인티져 정수의 범위값중에 가장 최소값을 설정해줌
		//int max = result[0];
		for ( int i = 0; i < N; i++) {
			if ( max < result[i]) {
				max = result[i];
			}
		}
		// 찾아낸 가장 큰 숫자를 출력한다
		System.out.println();
		System.out.println("최대값: " + max);
	}
}
