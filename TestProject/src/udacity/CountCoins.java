package udacity;

public class CountCoins {

	public int countCoins(int a[],int n,int m)
	{
		if(m==0)
			return 1;
		if(m<0)
			return 0;
		if(n<=0 && m>=1)
			return 0;
				
		return countCoins(a,n,m-a[n-1])+countCoins(a,n-1,m);
	}
	
	 public int getMinimum(int a, int b)
	    {
	    	return a<b ? a:b;
	    }
	 
	public static void main(String[] args) {
		
		CountCoins c = new CountCoins();
		int a[] = {1,2,3};
		int count = c.countCoins(a,a.length, 4);
		System.out.println("The count is "+String.valueOf(count));

	}

}
