package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2908 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		String a = "";
		String b = "";
		char ch = ' ';
		for (int i = 0; i < 3; i++) {
			ch = str[0].charAt(i);
			a = ch+a;
		}
		
		for (int i = 0; i < 3; i++) {
			ch = str[1].charAt(i);
			b = ch+b;
		}
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		if (c > d) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}

	}
	

}
