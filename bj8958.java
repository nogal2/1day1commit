package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj8958 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String q[] = new String[num];	// 80으로 해서 String index out of range: 10 나옴.
		char a;
		
		for (int i = 0; i < num; i++) {
			int count = 0;
			int pt = 0;
			q[i] = br.readLine();
			for (int j = 0; j < q[i].length(); j++) {
				a = q[i].charAt(j);
				if(a == 'O') {
					count++;
					pt = pt + count;
				}
				else {
					count = 0;
				} 
			}
			System.out.println(pt);
		}
		

	}

}
