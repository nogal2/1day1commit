package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char a;
		int A[] = new int[26];
		for (int i = 0; i < A.length; i++) {
			A[i] = 97+i;
		}
		
		int num[] = new int[26];
		for (int i = 0; i < num.length; i++) {
			num[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			a = str.charAt(i);
			int b = (int)a;
			for (int j = 0; j < num.length; j++) {
				if (b == A[j] && num[j] == -1) {
					num[j] = i;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			if (i==25) {
				System.out.print(num[i]);
			}else {
				System.out.print(num[i]+" ");
			}
		}
		
		

	}

}
