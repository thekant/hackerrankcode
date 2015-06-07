/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shashi
 * 
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int testNbr = 1; testNbr <= testSize; testNbr++) {
			int[] data = new int[scanner.nextInt()];
			for (int reader = 0; reader < data.length; reader++) {
				data[reader] = scanner.nextInt();
			}
			System.out.println(findMaxContiguousSum(data) + " "
					+ findMaxNonContiguousSum(data));
		}

	}

	private static int findMaxContiguousSum(int[] data) {
		int maxEndingHere = 0;
		int maxSoFar = 0;

		for (int index = 0; index < data.length; index++) {
			maxEndingHere = Math.max(0, maxEndingHere + data[index]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	private static int findMaxNonContiguousSum(int[] data) {
		int sum = 0;
		for (int indx = 0; indx < data.length; indx++) {
			if (data[indx] > 0)
				sum = sum + data[indx];
		}
		return sum;
	}
}
