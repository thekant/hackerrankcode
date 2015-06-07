package com.kant.hackerrank.algorithm.challenge.sorting;

import java.util.Scanner;

/**
 * 
 * @author shashi
 * 
 */
public class QuickSortRoutine {

	static void partition(int[] arr) {
		int pivot = arr[0], i = 1, j = arr.length - 1;
		while (true) {
			while (i < arr.length && arr[i] < pivot)
				i++;
			while (j > 0 && arr[j] > pivot)
				j--;
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} else {
				int temp = arr[0];
				arr[0] = arr[j];
				arr[j] = temp;
				break;
			}
		}

		printArray(arr);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
}
