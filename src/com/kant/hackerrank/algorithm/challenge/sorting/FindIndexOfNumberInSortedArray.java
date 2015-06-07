/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.sorting;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class FindIndexOfNumberInSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbrToFind = scanner.nextInt();
		int arrSize = scanner.nextInt();
		int[] arrData = new int[arrSize];
		for (int reader = 0; reader < arrSize; reader++) {
			arrData[reader] = scanner.nextInt();
		}
		System.out.println(findIndexForNbr(nbrToFind, arrData, 0, arrSize - 1));
	}

	private static int findIndexForNbr(int nbr, int[] dataArray, int low,
			int high) {
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (dataArray[mid] == nbr)
				return mid;
			if (dataArray[mid] > nbr)
				high = mid;
			else
				low = mid;
		}

		if (low == high && dataArray[low] == nbr)
			return low;
		return -1;
	}
}
