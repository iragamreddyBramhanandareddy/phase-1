package com.lesson2.arr;

public class ArrayDEmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1[]= {1,2,3,4,6};
		int[] a1,a2;
		int arr[],X;
		System.out.println(ar1.length);
		System.out.println(ar1);
		System.out.println(ar1[0]);
		for (int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
	
	
			int ar2[]=new int[4];
			System.out.println(ar2.length);
			System.out.println(ar2);
			ar2[0]=701;
			ar2[1]=702;
			ar2[2]=703;
			for (int i1 = 0; i1<ar2.length;i1++) {
				System.out.println(ar2[i1]);
		
			}
			System.out.println("for each loop");
				for (int element :ar2) {
					System.out.println(element);
			}
	
	}
}
}
