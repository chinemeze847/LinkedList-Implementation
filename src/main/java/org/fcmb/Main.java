package org.fcmb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

//		System.out.println(reverseString("Charles"));
//		System.out.println(recursiveReverse("Mesopotamia"));
//		System.out.println(fibonacci(7));
//		fibLoop(9);
		int[] myArr = {1,2 ,3, 4, 5, 6};
		arrayReverser(myArr);

	}

	public static String reverseString(String s){
		String  newString = "";
		for(int i=s.length()-1; i >= 0; i--){
			newString += s.charAt(i);
		}
		return newString;
	}

	public static String recursiveReverse(String s){
		if(s.length() < 0)
			return " ";
		return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
	}

	public static int fibonacci(int num){
		if (num <= 2)
			return 1;

		return fibonacci(num-1) + fibonacci(num-2);

	}

	public static void fibLoop(int num){
//		List<Integer> series = new ArrayList();
//
//		series.add(1);
//		series.add(1);
//
//		if(num == 1)
//			return series;
//
//		for(int i=2; i<= num; i++){
//			series.add(series.get(i-1) + series.get(i-2));
//		}
//		return series;

		int[] fibonacci = new int[num];
		fibonacci[0] = 1;
		fibonacci[1] = 1;

		for(int i = 2 ; i < num; i++){
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}

		System.out.print("[");
		for (int n : fibonacci) {
			System.out.print(n + " ");
		}
		System.out.print("]");
	}

	public static void swap(){
		int a = 5;
		int b = 10;

		a = a + b ;
		b = a - b ;
		a = a - b ;
	}

	public static void arrayReverser(int[] arr){
		int first = 0;
		int last = arr.length - 1;

		while (last > first)
		{
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			first ++;
			last--;
		}

		System.out.print("[");
		for (int num : arr){
			System.out.print(" " + num);
		}
		System.out.print("]");
	}

}