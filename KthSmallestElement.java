package sortingnew;
import java.util.Scanner;


public class KthSmallestElement {
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int partition(int[] arr,int low,int high)
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
	public static int kthPosition(int[] arr,int low,int high,int k)
	{
		while(low<=high)
		{
			int p=partition(arr,low,high);
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
				low=p-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the kth position: ");
		int kth=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int res=kthPosition(arr,low,high,kth);
		System.out.println("The "+kth+" smallest element is "+res);
		sc.close();

	}

}
