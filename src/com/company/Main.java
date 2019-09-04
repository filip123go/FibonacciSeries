package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a place holder to find the corresponding number in ");
		int inputNumber = scan.nextInt();
		System.out.println (fib(inputNumber));
	}

	public static int fib(int n){
		if (n == 1 || n ==2){
			return n-1;
		}else{
			int fibNumber  = fib(n-1)+ fib(n-2);
			return fibNumber;
		}
	}
}
