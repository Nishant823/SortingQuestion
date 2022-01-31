package sortingnew;
import java.util.Scanner;

public class MaximumAndMinimumLessComparionLinearSearch {
	static class pair
	{
		int min;
		int max;
	}
	static pair getMinmax(int[]arr,int n)
	{
		pair minmax=new pair();
		if(n==1)
		{
			minmax.min=arr[0];
			minmax.max=arr[0];
		}
		else
		{
			if(arr[0]>arr[1])
			{
				minmax.min=arr[1];
				minmax.max=arr[0];
			}
			else
			{
				minmax.min=arr[0];
				minmax.max=arr[1];
			}
			for(int i=2;i<n;i++)
			{
				if(minmax.min>arr[i])
				{
					minmax.min=arr[i];
				}
				else if(minmax.max<arr[i])
				{
					minmax.max=arr[i];
				}
			}
			
		}
		
		
		
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		pair minmax=getMinmax(arr,n);
		System.out.println("The maximum number is: "+minmax.max);
		System.out.println("The minimum number is: "+minmax.min);
		sc.close();

	}

}
