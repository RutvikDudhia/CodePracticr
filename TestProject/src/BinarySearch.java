
public interface BinarySearch {
	
	static void binarySearch(int a[], int left , int right, int value)
	{
	if(right >= left){
		int mid = left+(right-left)/2;
		if(a[mid]==value)
			System.out.println("The index is "+mid);
		else if(a[mid]>value)
			binarySearch(a, left, mid-1, value);
		else if (a[mid]<value)
			binarySearch(a, mid+1, right, value);
	}
	else
	{
		System.out.println("Element not found");
	}
	}
	public static void main(String args[])
	{
		int array[]={1,2,3,4,5,6,7};
		int value =4;
		binarySearch(array,0,array.length-1,value);
		
	}
	
}
