/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class AChocolateForWrappers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
	}

	private static int Solve(int wallet, int chocVal, int exchangeVal) {
		int result, numChocs = 0;
		if (wallet > chocVal) {
			numChocs = wallet / chocVal;
		}
		result = numChocs;
		while (numChocs >= exchangeVal) {
			numChocs = 1 + numChocs - exchangeVal;
			result++;
		}
		return result;
	}

}
