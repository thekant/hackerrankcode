package com.kant.hackerrank.algorithm.challenge.warmup;

import java.util.Scanner;

/**
 * 
 * @author shaskant
 *
 */
public class MaximizingXor {
	static int maxXor(int l, int r) {
		int output=0;
		for(int leftOp=l;leftOp<=r;leftOp++){
			for(int rightOp=leftOp;rightOp<=r;rightOp++){
				if(output < (leftOp^rightOp)){
					output=leftOp^rightOp;
				}
			}
		}
		return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
