package sortingnew;
import java.util.Scanner;

public class MergeSortInDecendingOrder {
	public static void mergeFunction(int[]arr,int low,int mid,int high)
	{
		
		int n1=mid-low+1;
		int n2=high-mid;
		int [] left=new int[n1];
		int [] right=new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++)
		{
			right[i]=arr[mid+i+1];
		}
		int i=0,j=0;
		int index=low;
		while(i<n1 && j<n2)
		{
			if(left[i]>=right[j])
			{
				arr[index++]=left[i++];
				
			}
			else {
				arr[index++]=right[j++];
			}
					
		}
		while(i<n1)
		{
			arr[index++]=left[i++];
		}
		while(j<n2)
		{
			arr[index++]=right[j++];
		}
		
	}
	public static void mergeSort(int[] arr,int low,int high)
	{
		if(low<high)
			
		{
			int mid=low+(high-low)/2;
			
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			mergeFunction(arr,low,mid,high);
			
		}
		
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
		int low=0;
		int high=arr.length-1;
		mergeSort(arr,low,high);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		

	}

}
