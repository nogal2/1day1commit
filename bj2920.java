package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2920 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int a[] = new int[8];
		int count = 0;
		
		for (int i = 0; i < str.length; i++) {
			a[i]= Integer.parseInt(str[i]); 
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == i+1) {
				count++;
			} 
			else if (a[i] == a.length-i) {
				count--;				
			}
		}
		if (count == 8) {
			System.out.println("ascending");
		} 
		else if(count == -8) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		} 
		
	}

}
