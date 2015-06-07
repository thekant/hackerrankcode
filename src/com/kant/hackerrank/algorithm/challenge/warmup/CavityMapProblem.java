/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class CavityMapProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrSize2D = scanner.nextInt();
		int[][] array2D = new int[arrSize2D][arrSize2D];

		for (int counter = 0; counter < arrSize2D; counter++) {
			String tempStr = scanner.next();
			int indx = 0;
			while (!tempStr.isEmpty()) {
				array2D[counter][indx] = tempStr.charAt(0) - '0';
				tempStr = tempStr.substring(1);
				indx++;
			}
		}
		for (int row = 0; row < arrSize2D; row++) {
			for (int col = 0; col < arrSize2D; col++) {
				if (isCavity(array2D, row, col)) {
					System.out.print("X");
				} else
					System.out.print(array2D[row][col]);
			}
			System.out.println();
		}
	}

	// (0,+1)
	// (-1,0)(0,0) (+1,0)
	// (0,-1)
	static private int[] rowVal = { -1, 0, 1, 0 };
	static private int[] colVal = { 0, 1, 0, -1 };
	static private boolean markedArr[][];

	private static boolean isCavity(int[][] arr, int row, int col) {
		int limit = arr.length;
		for (int counter = 0; counter < rowVal.length; counter++) {
			if (!isSafe(row + rowVal[counter], col + colVal[counter], limit)
					|| (arr[row + rowVal[counter]][col + colVal[counter]] >= arr[row][col])) {
				return false;
			}
		}
		return true;
	}

	private static boolean isSafe(int x, int y, int lim) {
		return !(x < 0 || x >= lim || y < 0 || y >= lim);
	}
}
