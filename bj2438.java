package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2438 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		int sum=0;
		for(int i=1; i<a+1; i++) {
			sum = i;
			for(int j=0; j<sum; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
