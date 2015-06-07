package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * 
 * @author shaskant
 *
 */
public class ServiceLaneMaxWidthVehicle {

	public static void main(String[] args) {
		int arrSize,testSize;
		Scanner scanner=new Scanner(System.in);
		arrSize= scanner.nextInt();
		testSize=scanner.nextInt();
		int[] arrData=new int[arrSize];
		for(int read=0;read<arrSize;read++)arrData[read]=scanner.nextInt();
		
		for(int tcase=1;tcase<=testSize;tcase++){
			int output=0;
			int leftIndex=scanner.nextInt();
			int rightIndex=scanner.nextInt();
			if(leftIndex<rightIndex){
				output=getLeastWidth(arrData,leftIndex,rightIndex);
			}
			System.out.println(output);
		}
	}

	private static int getLeastWidth(int[] arrData, int leftIndex,
			int rightIndex) {
		int result=4;
		for(int index=leftIndex;index<=rightIndex;index++){
			if(result>arrData[index])result=arrData[index];
		}
		return result;
	}

}
