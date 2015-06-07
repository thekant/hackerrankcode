/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.numbertheory;

import java.util.Scanner;

/**
 * The crucial observation is that gcd(u,v)=gcd(v,u)=gcd(u,u±v).
 * 
 * From this follows Euclid's algorithm for computing gcd.
 * 
 * The significance of the gcd in your problem is that the crucial observation
 * implies that all points visited by allowed moves have the same gcd. So, you
 * can divide their coordinates by that gcd and reduce the problem to a grid
 * with unit spacing and whose allowed moves are to immediate neighbors.
 * 
 * The crucial observation proves that if (x,y) is reachable from (a,b),then
 * gcd(x,y)=gcd(a,b).
 * 
 * For the converse, note that the set of all points that are reachable from
 * (a,b) have coordinates of the form am+bn, with m,n∈Z. The set of all such
 * linear combinations is the set of all multiples of gcd(a,b).
 * 
 * @author shashi
 * 
 */
public class PossiblePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();
		for (int testNbr = 1; testNbr <= testSize; testNbr++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			String result = (findGCD(a, b) == findGCD(x, y)) ? "YES" : "NO";
			System.out.println(result);
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
