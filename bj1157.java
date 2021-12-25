package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bj1157 {

	public static void main(String[] args) throws IOException{
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Eng[] = new int[26];
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			if (64 < a && 91 > a) {
				Eng[a-65]++;
			} 
			else {
				Eng[a-97]++;
			}
		}
		
		int max = -1;
		char an = '?';
		for (int i = 0; i < Eng.length; i++) {
			if (max < Eng[i]) {
				max = Eng[i];
				an = (char)(i+65);
			}
			else if (max == Eng[i]) {
				an = '?';
			}
			
		}
		
		System.out.println(an);
		// max는 최대로 많이 나온 횟수.   

	}

}
