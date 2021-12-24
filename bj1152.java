package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class bj1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
			System.out.println(st.countTokens());
	}
}


// StringTokenizer는 빈 문자열 "" 을 토큰으로 인식하지 않는다. split으로 했을때는 빈 문자열도 토큰으로 인식하니 주의!!
// 빈문자 "" 와 null은 다른 개념이니 주의하자. 빈 문자는 값이 빈문자이지만 null은 할당 자체가 되지 않은 것이라는 의미이다.