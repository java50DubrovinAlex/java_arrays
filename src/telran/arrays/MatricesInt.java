package telran.arrays;

public class MatricesInt {
	public static int [] [] multiplayConstant(int [] [] matrix, int constant){
		for (int i = 0; i < matrix.length;i++ ) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= constant;
			}
		}
		return matrix;
	}
	public static int []getColumn(int [][] matrix, int column){
		int [] res = new int [matrix.length];
		int i = 0;
		while(i <= matrix.length - 1) {
			res[i] = matrix[i][column];
			i++;
		}
		return res;
		
	}
	public static int [][] transpMatrix(int [][] matrix){
		int[][] res = new int[matrix[0].length] [matrix.length];
	
		for (int i = 0; i < matrix.length;i++ ) {
			for(int j = 0; j < matrix[i].length; j++) {
				res[j][i] = matrix[i][j];
			}
		
	}
		return res;
}
}