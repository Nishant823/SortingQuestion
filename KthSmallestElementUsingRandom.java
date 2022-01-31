package sortingnew;
import java.util.Random;
import java.util.Scanner;

public class KthSmallestElementUsingRandom {
	public static int partition(int []arr,int low,int high)
	{
		int i=low-1;
		int pivot=arr[high];
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int randomPartiton(int[] arr,int low,int high)
	{
		int n=high-low+1;
		Random sb=new Random();
		int pivot=sb.nextInt(n);
		
		swap(arr,(low+pivot),high);
		return partition(arr,low,high);
	}
	public static int kthSmallestElement(int[]arr,int low,int high,int k)
	{
		while(low<=high)
		{
			int p=randomPartiton(arr,low,high);
		
			if(p==k-1)
			{
				return arr[p];
			}
			else if(p>k-1)
			{
				high=p-1;
			}
			else
			{
				low=p+1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the kth position: ");
		int kth=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int res=kthSmallestElement(arr,low,high,kth);
		System.out.println("The element present at "+kth+" is "+res);
		sc.close();

	}

}
