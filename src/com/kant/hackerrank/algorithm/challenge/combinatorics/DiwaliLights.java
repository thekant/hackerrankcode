/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.combinatorics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class DiwaliLights {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arrays.fill(store, -1);
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();
		for (int testNbr = 1; testNbr <= testSize; testNbr++) {
			int n = scanner.nextInt();
			System.out.println((calPow(n) - 1));
		}
	}

	private static long[] store = new long[10001];
	private static int x = 2;

	public static long calPow(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		if (store[n] != -1)
			return store[n];

		long ret = calPow(n / 2);
		store[n] = (ret * ret) % 100000;
		if (n % 2 != 0) {
			store[n] = (store[n] * x) % 100000;
		}
		return store[n];
	}

}
