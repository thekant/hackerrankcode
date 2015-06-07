/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.strings;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class AlternatingCharactersOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int textSize = scanner.nextInt();

		for (int testCount = 0; testCount < textSize; testCount++) {
			String input = scanner.next();

			if (input.isEmpty()) {
				System.out.println(0);
			} else if (input.length() == 1) {
				System.out.println(0);
			} else if (checkAnamoly(input)) {
				System.out.println(input.length() - fixAnamoly(input).length());
			} else {
				System.out.println(0);
			}
		}
	}

	private static boolean checkAnamoly(String input) {
		char prev = input.charAt(0), cur;
		int counter = 1;
		while (counter < input.length()) {
			cur = input.charAt(counter);
			if (cur == prev)
				return true;
			prev = cur;
			counter++;
		}
		return false;
	}

	private static String fixAnamoly(String input) {
		StringBuffer out = new StringBuffer();
		char prev = input.charAt(0), cur;
		out.append(prev);
		int counter = 1;
		while (counter < input.length()) {
			cur = input.charAt(counter);
			if (cur != prev) {
				out.append(cur);
			}
			prev = cur;
			counter++;
		}
		return out.toString();
	}

}
