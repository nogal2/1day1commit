package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2739 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = 0;
		for(int i=1; i<10; i++) {
			b = a*i;
			System.out.println(a + " * " + i + " = " + b);
		}
		
	}

}
