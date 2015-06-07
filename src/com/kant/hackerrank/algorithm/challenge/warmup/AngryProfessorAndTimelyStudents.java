/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * @author shaskant
 *
 */
public class AngryProfessorAndTimelyStudents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testSize = scanner.nextInt();

		for (int tcase = 1; tcase <= testSize; tcase++) {
			// read data
			int arrSize = scanner.nextInt();
			int minStudent = scanner.nextInt();
			int[] arrData = new int[arrSize];
			for (int read = 0; read < arrSize; read++)
				arrData[read] = scanner.nextInt();

			int numStudent = 0;
			for (int counter = 0; counter < arrData.length; counter++) {
				if (arrData[counter] <= 0)
					numStudent++;
			}

			if (numStudent >= minStudent)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
