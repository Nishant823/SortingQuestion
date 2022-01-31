package sortingnew;
import java.util.Scanner;

public class CountInversionEfficientLongValues {
	public static long mergeSort(long[] arr,long low,long mid,long high)
	{ 
		long res=0;
		long n1=mid-low+1;
		long n2=high-mid;
		long[] left=new long[(int)n1];
		long[] right=new long[(int)n2];
		for(long i=0;i<n1;i++)
		{
			long a=i+low;
			left[(int)i]=arr[(int)a];
		}
		for(long i=0;i<n2;i++)
		{
			long a=mid+i+1;
			right[(int)i]=arr[(int)a];
		}
		long i=0,j=0;
		long index=low;
		while(i<n1&&j<n2)
		{
			if(left[(int)i]<=right[(int)j])
			{
				arr[(int)index++]=left[(int)i++];
			}
			else
			{
				arr[(int)index++]=right[(int)j++];
				res=res+(n1-i);
			}
		}
		while(i<n1)
		{
			arr[(int)index++]=left[(int)i++];
			
		}
		while(j<n2)
		{
			arr[(int)index++]=right[(int)j++];
		}
		
		return res;
	}
   
    public static long countInversion(long[]arr,long low,long high)
    {
    	long res=0;
    	if(low<high)
    	{
    		long  mid=low+(high-low)/2;
    		System.out.println(mid);
    		res=res+countInversion(arr,low,mid);
    		res=res+countInversion(arr,mid+1,high);
    		res=res+mergeSort(arr,low,mid,high);
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		long n=sc.nextLong();
		long[] arr=new long[(int)n];
		for(long i=0;i<n;i++)
		{
			arr[(int)i]=sc.nextLong();
		}
		long res=countInversion(arr,0,n-1);
		System.out.println("the inversion of array is "+res);
		sc.close();

	}

}
