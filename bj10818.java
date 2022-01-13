package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj10818 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		int b[] = new int[a];
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(b);
		System.out.println(b[0] + " " + b[a-1]);
	}

}
