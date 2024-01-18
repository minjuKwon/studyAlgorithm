package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backtracking_15656 {
	
	static StringBuilder sb=new StringBuilder();
	static int [] arrDepth;
	static int [] arr;
	static int N,M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arrDepth=new int[N];
		arr=new int[M];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arrDepth[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(arrDepth);
		
		dfs(0);
		
		System.out.println(sb);

	}
	
	static void dfs(int depth) {
		if(depth==M) {
			for(int num:arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=0;i<N;i++) {
			arr[depth]=arrDepth[i];
			dfs(depth+1);
		}
	}

}
