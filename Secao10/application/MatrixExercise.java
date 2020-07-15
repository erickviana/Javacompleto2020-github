package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixExercise {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(num == mat[i][j]) {
					System.out.println("Position "+i+","+j+":");
					if (j > 0) {
					System.out.println("Left: "+mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: "+mat[i-1][j]);
						}
					//if (j < m-1) {primeira forma de fazer
					if(j < mat[i].length-1) {//segunda forma de fazer
					System.out.println("Right: "+mat[i][j+1]);
					}					
					//if (i < n-1) {primeira forma
					if (i < mat.length-1) { // segunda forma
					System.out.println("Down: "+mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
