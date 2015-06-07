/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.search;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class SherlockAndArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int testCount = 0; testCount < testSize; testCount++) {
			// read data
			int arrSize = scanner.nextInt();
			int[] data = new int[arrSize];
			if (arrSize <= 2) {
				System.out.println("NO");
				continue;
			}
			for (int reader = 0; reader < arrSize; reader++) {
				data[reader] = scanner.nextInt();
			}
			if (equilibrium(data)) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}

	}

	/**
	 * from geekforgeeks
	 * http://www.geeksforgeeks.org/equilibrium-index-of-an-array/
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean equilibrium(int arr[]) {
		int sum = 0; // initialize sum of whole array
		int leftsum = 0; // initialize leftsum
		int i;
		int n = arr.length;
		/* Find sum of the whole array */
		for (i = 0; i < n; ++i)
			sum += arr[i];

		for (i = 0; i < n; ++i) {
			sum -= arr[i]; // sum is now right sum for index i

			if (leftsum == sum)
				return true; // return i for index of equilibrium

			leftsum += arr[i];
		}
		return false;
	}

}
