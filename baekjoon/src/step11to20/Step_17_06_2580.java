package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/119
public class Step_17_06_2580 {

	static int[][] board;
	
	public static void main(String[] args) throws IOException {
		
		board=new int[9][9];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0;i<9;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		sudoku(0,0);
		
	}
	
	static void sudoku(int row, int column) {
		
		if(column==9) {
			sudoku(row+1,0);
			return;
		}
		
		if(row==9) {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(board[i][j]).append(' ');
				}sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(board[row][column]==0) {
			for(int i=1;i<10;i++) {
				if(check(row,column,i)) {
					board[row][column]=i;
					sudoku(row,column+1);
				}
			}
			board[row][column]=0;
			return;
		}
		
		sudoku(row,column+1);
		
	}
	
	static boolean check(int row, int column, int value) {
		
		for(int i=0;i<9;i++) {
			if(board[row][i]==value) {
				return false;
			}
		}
		
		for(int i=0;i<9;i++) {
			if(board[i][column]==value) {
				return false;
			}
		}
		
		int r=(row/3)*3;
		int c=(column/3)*3;
		
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(board[i][j]==value) {
					return false;
				}
			}
		}
		
		return true;
		
	}

}
