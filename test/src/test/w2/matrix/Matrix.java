package test.w2.matrix;

import java.util.Scanner;

public class Matrix {
	private int hang, cot;
	private int[][] a;
	
	public Matrix(int hang, int cot) {
		this.cot = cot;
		this.hang = hang;
		this.a = new int[51][51];
	}
	
	public int[][] getA() {
		return this.a;
	}
	
	public int getHang() {
		return this.hang;
	}
	
	public int getCot() {
		return this.cot;
	}

	public void nextMatrix(Scanner sc) {
//		this.a = new int[51][51];
		for(int i=0; i<hang; i++) {
			for(int j=0; j<cot; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}

	
	
	public String mul(Matrix b) {
		Matrix c = new Matrix(this.hang, b.getCot());
		
		for (int i = 0; i < this.hang; i++) {
            for (int j = 0; j < b.getCot(); j++) {
                c.getA()[i][j] = 0;
                for (int k = 0; k < this.cot; k++) {
                    c.getA()[i][j] = c.getA()[i][j] + this.a[i][k] * b.getA()[k][j];
                }
            }
        }
		
		String matran = "";
		for(int i=0; i<this.hang; i++) {
			for(int j=0; j<b.getCot(); j++) {
				matran = matran + c.getA()[i][j] + " ";
			}
			matran = matran + "\n";
		}
		return matran;
	}
}
