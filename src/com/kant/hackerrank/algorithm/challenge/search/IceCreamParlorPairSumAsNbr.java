/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class IceCreamParlorPairSumAsNbr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int testCount = 0; testCount < testSize; testCount++) {
			// read data
			int M = scanner.nextInt(), N = scanner.nextInt();
			int[] data = new int[N];
			int sum = 0;
			for (int reader = 0; reader < N; reader++) {
				data[reader] = scanner.nextInt();
			}
			printPairs(data, M);
		}
	}

	/**
	 * 
	 * @param arr
	 * @param sum
	 */
	private static void printPairs(int arr[], int sum) {
		int i, finder;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (i = 0; i < arr.length; i++) {
			finder = sum - arr[i];
			if (finder >= 0 && map.containsKey(finder)) {
				System.out.println((map.get(finder)+1) + " " + (i+1));
			}
			map.put(arr[i], i);
		}
	}

}
