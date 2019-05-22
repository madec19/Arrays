package com.org.arrays;

public class ZerosAtLastPosition {

	public void shiftZeros(int[] arr) {

		int len = arr.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while (count < len) {
			arr[count] = 0;
			count++;
		}

	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {

		int[] a = new int[] { 1, 0, 3, 0, 2, 5 };
		ZerosAtLastPosition z = new ZerosAtLastPosition();

		z.shiftZeros(a);
		z.print(a);
	}
}
