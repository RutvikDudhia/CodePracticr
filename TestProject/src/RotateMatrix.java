import java.util.Scanner;
import java.math.*;

public class RotateMatrix {
	
	public static int[][] rotateMatrix(int[][] matrix,int n)
	{
		int f = 1;
		int c= 2;
		int temp = 0;
		
		for (int x=0;x<=f-1;x++)
		{
			for(int y=0;x<=c-1;x++)
			{
					temp = matrix[x][y];
			    		matrix[x][y] = matrix[y][n-1-x];
			    		matrix[y][n-1-x] = matrix[n-1-x][n-1-y];		   
			    		matrix[n-1-x][n-1-y] = matrix[n-1-y][x];
			    	    matrix[n-1-y][x] = temp;
				
			}
		}
		
		return matrix;
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows/columns");
//		Scanner in = new Scanner(System.in);
		int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]newMatrix = rotateMatrix(matrix,3);
		for(int i=0;i<3;i++)
		{
			System.out.println('\n');
			
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		
	}
}
