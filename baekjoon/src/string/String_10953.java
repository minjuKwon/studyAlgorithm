package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_10953 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb=new StringBuilder();

		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine(),",");
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			sb.append(A+B).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
