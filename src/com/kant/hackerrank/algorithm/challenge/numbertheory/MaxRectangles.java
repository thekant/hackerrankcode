/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.numbertheory;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shashi
 * 
 */
public class MaxRectangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();
		for (int testNbr = 1; testNbr <= testSize; testNbr++) {
			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();
			int gcd = findGCD(number1, number2);
			System.out.println(number1 * number2 / (gcd * gcd));
		}

	}

	private static int findGCD(int number1, int number2) {
		// base case
		if (number2 == 0) {
			return number1;
		}
		return findGCD(number2, number1 % number2);
	}
}
