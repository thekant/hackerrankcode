/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class DigitsDividingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int tcase = 1; tcase <= testSize; tcase++) {
			// read data
			long input = scanner.nextLong();
			int result = 0;
			long next = input;
			while (next != 0) {
				long dig = next % 10;
				if (dig != 0 && input % dig == 0)
					result++;
				next = next / 10;
			}
			System.out.println(result);
		}
	}

}
