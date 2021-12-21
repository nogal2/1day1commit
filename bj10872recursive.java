package study;

import java.util.Scanner;

public class bj10872recursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(f(x));
		
	}
	public static int f(int x) {
		if (x==0) {
			return 1;
		}
		return x * f(x-1);
	}
	
	/*
	x=5
	f(5) = 5 * f(4)
	f(4) = 4 * f(3)
	f(3) = 3 * f(2)
	f(2) = 2 * f(1)
	f(1) = 1 * f(0)
	f(0) = 1
	
	1 = f(1)
	2 * 1 = f(2)
	3 * 2 * 1 = f(3)
	4 * 3 * 2 * 1 = f(4)
	5 * 4 * 3 * 2 * 1 = f(5)
		 
	 
	*/
}

