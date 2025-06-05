package Basics;

public class RemoveDuplicates {
	
	public static void dup(int[] arr,int n)
	{
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
			
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,1,2,3,3,4,4,5};
		int n=arr.length;
		dup(arr,n);
		
		
	}

}
