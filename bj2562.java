package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2562 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[9];
		int a[] = new int[9];
		int max = -1;
		int index = -1;
		for (int i = 0; i < 9; i++) {
			
			str[i] = br.readLine();
			a[i] = Integer.parseInt(str[i]);
			if (max < a[i]) {
				max = a[i];
				index=i;
				
			}
			
		}
		
		System.out.println(max);
		System.out.println(index+1);
		
	}

}
