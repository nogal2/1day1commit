package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class bj1000 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		System.out.println("A를 입력해주세요");
		int B = Integer.parseInt(str[1]);
		System.out.println("B를 입력해주세요");
		System.out.println(A+B);
		/*입력값에 공백이 있기 때문에 공백을 없애기 위해 split를 써야함.*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println(num1 + num2);
        /**/
	}
}
