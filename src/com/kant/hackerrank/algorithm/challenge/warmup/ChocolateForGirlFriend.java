/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class ChocolateForGirlFriend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int tcase = 1; tcase <= testSize; tcase++) {
			// read data
			long input = scanner.nextInt();
			System.out.println((input / 2 * (input - input / 2)));
		}

	}

}
