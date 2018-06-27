package arrays.Transpose;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Transpose {
	public static void main(String args[] ) throws Exception {
		System.setIn(new FileInputStream(
				"C:\\Users\\ramshank1\\git\\PracticeByPractice\\src\\arrays\\Transpose\\sample-input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int[] rowCol  = Arrays.stream(line.split("\\D+"))
	       .filter(word -> !word.isEmpty())
	       .mapToInt(Integer::parseInt)
	       .toArray();		
		
		int [][] nmmatrix = new int[rowCol[0]][];
		
		for (int i = 0; i < rowCol[0]; i++) {
			line = br.readLine();
			int[] row  = Arrays.stream(line.split("\\D+"))
				       .filter(word -> !word.isEmpty())
				       .mapToInt(Integer::parseInt)
				       .toArray();
			nmmatrix[i] = row;
		}
		
		nmmatrix = trans(nmmatrix, rowCol[0], rowCol[1]);
		
		for (int i = 0; i < rowCol[1]; i++) {
			for (int j = 0; j <  rowCol[0]; j++) {
				System.out.print(nmmatrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		
	}
	public static int[][]  trans(int a[][], int row, int col) {
		int b[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[j][i] = a [i][j];
			}
		}
		return b;
	}
	
}
