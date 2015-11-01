package geeksforgeeks;

public class MaximumSubsequence {
	
	
	public int maximumSubsequence(int a[],int low,int high)
	{
		int dp[] = new int[10];
		dp[0] = 1;
		for(int i=1,j=0;i<a.length;i++,j++)
		{
			
			if(a[i]>a[j])
				dp[i] = 1;
			else
				dp[i] = -1;
			
		}
		
		int maxlength = findMax(dp);
		
		return maxlength;
		
		
	}
	
	public int findMax(int dp[])
	{
		
		for(int l : dp)
			System.out.println(String.valueOf(l));
		System.out.println("The value is");
		
		int prevMax = 0;
		int temp =0;
		for(int i = 1;i<dp.length;i++)
		{
			if(dp[i] != -1)
			{
				dp[i]=dp[i-1]+1;
				
			}
			else
			{
				dp[i] = 1;
			}
		}
		
		for(int l : dp)
			System.out.println(String.valueOf(l));
		
		int max = dp[0];
		for(int i=0;i<dp.length;i++)
		{
			if(max <= dp[i])
				max = dp[i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int a[] = {4,5,7,6,8,18,11,13,14,15};
		
		MaximumSubsequence ms = new MaximumSubsequence();
		
		int maxValue = ms.maximumSubsequence(a, 0, a.length -1);
		
		System.out.println("The maxvalue is " + maxValue);
		
		
		
		
		
		

	}

}
