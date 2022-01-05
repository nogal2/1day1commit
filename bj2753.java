package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2753 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		int b = a%4;
		int c = a%100;
		int d = a%400;
		if (b == 0 && (c != 0 || d == 0)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		
	}

}
