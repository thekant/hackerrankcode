/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.strings;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class GameOfThrones1AnagramPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		if (input.isEmpty() || input.length() == 1) {
			System.out.println("YES");
		} else {
			int countEven = 0, countOdd = 0;
			int[] charCount = new int[26];
			for (int reader = 0; reader < input.length(); reader++) {
				charCount[input.charAt(reader) - 'a']++;
			}
			for (int indx = 0; indx < 26; indx++) {
				if (charCount[indx] % 2 == 0)
					countEven++;
				else
					countOdd++;
			}

			if (countOdd == 0 || (countOdd == 1 && countEven > 0))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
