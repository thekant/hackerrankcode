/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.bitmanipulation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class BitsFlipper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int testNbr = 1; testNbr <= testSize; testNbr++) {
			String input=scanner.next();
			BigInteger mask = new BigInteger("4294967295");
			System.out.println(mask.andNot(new BigInteger(input)));
		}
	}

}
