package Iot_Java.day07;

public class Array_Demo {
	public static void main(String[] args) {
		// 배열의 값 초기화
		int [] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// 효율적인 코드 작성법 ( length 활용 )
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = i;
			System.out.print("arr[" + i + "] " + arr[i] + " ");
		}
	}
}
