/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class SolutionUtopianChallenge3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		for (int tCase = 1; tCase <= testCases; tCase++) {
			int output = 1;
			int input = scanner.nextInt();
			if (input == 0)
				System.out.println(output);
			else {
				for (int cycle = 1; cycle <= input; cycle++) {
					if(cycle%2!=0)output *= 2;
					if(cycle%2==0)output += 1;
				}
				System.out.println(output);
			}
		}
	}

}
