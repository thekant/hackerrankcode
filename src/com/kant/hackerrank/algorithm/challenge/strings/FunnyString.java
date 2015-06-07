/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.strings;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class FunnyString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int textSize = scanner.nextInt();

		for (int testCount = 0; testCount < textSize; testCount++) {
			String input = scanner.next();
			String inputRev = new StringBuffer(input).reverse().toString();

			int idx = 0;
			for (; idx < input.length() - 1; idx++) {
				if (Math.abs(input.charAt(idx) - input.charAt(idx + 1)) != Math
						.abs(inputRev.charAt(idx) - inputRev.charAt(idx + 1))) {
					System.out.println("Not Funny");
					break;
				}
			}
			if (idx == input.length() - 1) {
				System.out.println("Funny");
			}
		}
	}

}
