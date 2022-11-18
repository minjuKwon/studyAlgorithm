package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_06_07_2908 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		StringBuffer sb1=new StringBuffer(st.nextToken());
		StringBuffer sb2=new StringBuffer(st.nextToken());
		
		int n1=Integer.parseInt(sb1.reverse().toString());
		int n2=Integer.parseInt(sb2.reverse().toString());
		
		if(n1>n2)
			System.out.println(n1);
		else
			System.out.println(n2);

	}

}
