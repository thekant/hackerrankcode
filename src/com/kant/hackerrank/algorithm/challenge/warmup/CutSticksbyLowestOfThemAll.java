/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class CutSticksbyLowestOfThemAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arrSize;
		Scanner scanner = new Scanner(System.in);
		arrSize = scanner.nextInt();
		int[] arrData = new int[arrSize];
		for (int read = 0; read < arrSize; read++)
			arrData[read] = scanner.nextInt();
		int minIdx = findMinValueIndex(arrData); // Zero length stick not in
													// input.
		while (minIdx != -1) {
			System.out.println(getCutSticks(arrData, arrData[minIdx]));
			minIdx = findMinValueIndex(arrData);
		}
	}

	private static int getCutSticks(int[] arrData, int min) {
		int result = 0;
		for (int cut = 0; cut < arrData.length; cut++) {
			if (arrData[cut] >= min) {
				result++;
				arrData[cut] -= min;
			}
		}
		return result;
	}

	private static int findMinValueIndex(int[] arrData) {
		int resultIdx = 0;
		while (resultIdx < arrData.length && arrData[resultIdx] == 0)
			resultIdx++;
		if (resultIdx == arrData.length)
			return -1;
		for (int counter = resultIdx + 1; counter < arrData.length; counter++) {
			if (arrData[counter] != 0
					&& (arrData[counter] < arrData[resultIdx]))
				resultIdx = counter;
		}

		return resultIdx;
	}

}
