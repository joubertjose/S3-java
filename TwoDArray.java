package array;

public class TwoDArray {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},
							{3,4,5,6,7}};
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		for ( int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]+"\t");
		}
			System.out.println();
		}

	}
		}