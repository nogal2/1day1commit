package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj3052 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//boolean 과 배열 사용
		/*
		 * boolean a[] = new boolean[42];
		 * 
		 * for (int i = 0; i < 10; i++) { a[Integer.parseInt(br.readLine()) % 42] =
		 * true; }
		 * 
		 * int count = 0; for (int i = 0; i < a.length; i++) { if(a[i] == true) { count
		 * ++; } } System.out.println(count);
		 */
		
		HashSet<Integer> a = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			a.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(a.size());
		
	}

}
