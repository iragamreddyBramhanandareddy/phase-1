package com.lesson2.arr;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {
						{20,4},
						{39,04},
						{20,20}
		};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1][1]);
		
		int[][]arr2=new int[3][];
			arr2[0]=new int[2];
			arr2[1]=new int[3];
			arr2[2]=new int[4];
		
	}

}
