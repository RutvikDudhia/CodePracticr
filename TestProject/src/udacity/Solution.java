package udacity;

import java.util.ArrayList;
import java.util.List;

class Solution {
	
	int current = 0;
	
    public int solution(int p, int[] a, int distance) {
    	
    	return solutionHelper(0, 0, a, distance, p);
    	
    }
    
    
    public int solutionHelper(int i, int current, int []a, int distance, int p)
    {	
    
    if(distance - current == p)
    	return i;
     if(i>=a.length-1)
    		return 6666;
    if (current >= a[i])
    	i++;
    return minimum (solutionHelper(i+1,current,a,distance,p),solutionHelper(i+1, current + a[i], a, distance,p));
    	
    }
      
    public int minimum(int a, int b)
    {
    	return a<b ? a:b;
    }
    
    public static void main(String [] args)
    {
    	int [] a = {1,3,1,4,2,5};
    	Solution s = new Solution();
    	int ans = s.solution(3,a,7);
    	System.out.println(String.valueOf(ans));
    	
    }
}