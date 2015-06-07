/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.sorting;

import java.util.Scanner;

/**
 * @author shashi
 * 
 */
public class InsertionSortOneLiner {

	/**
	 * @param args
	 */
	public static void insertionSort(int[] A) {
		int countShifts = 0;
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				countShifts++;
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = value;
		}

		// printArray(A);
		System.out.println(countShifts);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
	}
}
