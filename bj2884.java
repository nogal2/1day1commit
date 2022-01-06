package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		// 45분 미만
		if (a > 0 && b < 45) {
			System.out.print((a-1) + (" ") + (b+15));
		}
		else if (a == 0 && b < 45) {
			System.out.print((a+23) + (" ") + (b+15));
		}
		else if(b >= 45) {
			System.out.print((a) + (" ") + (b-45));
		} 
	}

}
