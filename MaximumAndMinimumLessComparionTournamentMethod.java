package sortingnew;
import java.util.Scanner;

public class MaximumAndMinimumLessComparionTournamentMethod {
	static class pair{
		int min;
		int max;
	}
	static pair getMaxMin(int[]arr,int low,int high)
	{
		pair minmax=new pair();
		pair mml=new pair();
		pair mmr=new pair();
		if(low==high)
		{
			minmax.min=arr[low];
			minmax.max=arr[low];
			return minmax;
		}
		else if(high==low+1)
		{
			if(arr[high]>arr[low])
			{
				minmax.max=arr[high];
				minmax.min=arr[low];
			}
			else
			{
				minmax.max=arr[low];
				minmax.min=arr[high];
			}
			return minmax;
		}
	
			int mid=(low+high)/2;
			mml=getMaxMin(arr,low,mid);
			mmr=getMaxMin(arr,mid+1,high);
			if(mml.min<mmr.min) 
			{
				minmax.min=mml.min;
			}
			else
			{
				minmax.min=mmr.min;
			}
			if(mml.max>mmr.max)
			{
				minmax.max=mml.max;
			}
			else
			{
				minmax.max=mmr.max;
			}
		
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int low=0;
		int high=n-1;
		pair minmax=getMaxMin(arr,low,high);
		System.out.println("The maximum element in an array: "+ minmax.max);
		System.out.println("The minimum element in an array: "+minmax.min);
		sc.close();

	}

}
