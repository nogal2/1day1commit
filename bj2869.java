package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2869 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);
		
		int count = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0)
			count++;
 
		System.out.println(count);
		/*나는 문제를 풀때 먼저 반복문만 있으면 다 풀수 있게 될걸라는 생각을 한다. 그래서 문제 안에서 어떤 규칙을 찾기 보다는 
		반복문을 어떻게 집어 넣을지부터 생각을 하게 된다. 그래서 계속 풀수 있었던 문제도 못푸는것같다. 반복문을 쓰는것도 중요하지만
		문제의 핵심이 뭔지를 파악하고(사실 문제의 핵심이 반복문 사용이라고 생각한거지만) 규칙성을 찾는데에 우선순위를 둬보자)
		*/
	}

}
