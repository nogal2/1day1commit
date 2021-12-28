package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int n = Integer.parseInt(num);
		double pt[] = new double[n];
		double max = 0;
		
		String str[] = br.readLine().split(" ");
		
		for(int i=0; i < n; i++) {
			pt[i] = Double.parseDouble(str[i]);
			if(max < pt[i])  {
				max = pt[i];
			}
		} 
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum + ((pt[i]/max) * 100);
		}
		
		System.out.println(sum/n);
		
	}

}
// double을 습관적으로 int로 써서 답이 자꾸 안나와서 30분을 해맸다.. 사소한것도 잘 살펴보기!
