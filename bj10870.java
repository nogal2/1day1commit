package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		System.out.println(f(x));
		
	
	}
	public static int f(int x) {
			if(x==1) {
				return 1;
			}
			if(x==0) {
				return 0;
			}
			return f(x-1)+f(x-2);
	}
	
	/*
	메모
	Fn = Fn-1 + Fn-2 ( n >=2)
	
	F17 = F16+ F15
	
	
	f(3) = f(3-1) + f(3-2)
	f(4) = f(4-1) + f(4-2)
	f(5) = f(5-1) + f(5-2)
	f(6) = f(6-1) + f(6-2)
	f(7) = f(7-1) + f(7-2)
	f(17) = f(17-1) + f(17-2)
	
	f(int x) {
		if(x=1) {
		return 1;
		}
		if(x=0){
		return 0;
		}
		return f(x-1)+f(x-2);
		
	}
	
	f(5) = f(4)-f(3)
	f(4) = f(3)-f(2)
	f(3) = f(2)-f(1)
	f(2) = f(1)-f(0)
	f(1) = 1
	f(0) = 0
	
	
	fib(5) =  + fib(3) 
	fib(4) = fib(3) + fib(2)
	fib(3) = fib(2) + fib(1)
	fib(2) = fib(1) + fib(0)
	fib(1) = 1
	fib(0) = 0
	
	0 1 1 2 3 5
	
	0+1 = 1
	1+1 = 2
	1+2 = 3
	2+3 = 5
	
	0+1 =1
	1+1 =2
	1+2 =3 
	2+3 =5
	3+5 =8
	5+8 =13
	 
	
	 */

}
