package fff;

import java.util.Scanner;

public class prime {
	static boolean op = true;
	static Scanner scS = new Scanner(System.in);
	public static void main(String[] args) {
		int x = scS.nextInt();
 
		for(int i = 2; i<x-1;i++) {
			if(x%i==0) {
				op = false;
			}
			
		}
		if(op==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
}}
