/**
 * 
 */
package com.kant.hackerrank.algorithm.challenge.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shaskant
 *
 */
public class PanCardValidator {

	private static boolean isValidPAN(String s) {
		if(s.length()!=10)return false;
		int state = 0; // 0 => first 5 chars , 1=> next 4 numbers , 2=> last char , 3=> perfect PAN
		for (int reader = 0; reader < s.length(); reader++) {
			int item = s.charAt(reader);
			switch (state) {
			case 0:
				if (item < 'A' || item > 'Z')
					return false;
				if (reader == 4)
					state = 1;
				break;
			case 1:
				if (item < '0' || item > '9')
					return false;
				if (reader == 8)
					state = 2;
				break;
			case 2:
				if (item < 'A' || item > 'Z')
					return false;
				state=3;
				break;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int i = Integer.parseInt(br.readLine());
			for (int j = 0; j < i; j++) {
				String s = br.readLine();
				System.out.println(isValidPAN(s) ? "YES" : "NO");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
