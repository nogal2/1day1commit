package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String x = String.valueOf(a*b*c);
		char bh;
		int array[] = new int[10];
		for (int i = 0; i < x.length(); i++) {
			bh = x.charAt(i);
			String str = Character.toString(bh);
			int d = Integer.parseInt(str);
			array[d]++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
