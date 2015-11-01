
public class MatrixZero {
	
 public static void main(String [][] args)
	{
		int [][]matrix ={{1,2,3},{4,0,6},{7,9,0}};
		int []zeromatrix ={0,0,0};
		int []columns = {0,0,0};
		int []rows = {0,0,0};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(matrix[i][j]==0)
				{
					columns[j]=1;
					rows [i] = 1;	
					
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(rows[i]==1||columns[j]==1)
					matrix[i][j]=0;
			}
		}
	}
}
