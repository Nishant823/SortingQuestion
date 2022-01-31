package sortingnew;
import java.util.Scanner;

public class HeapSort {
	public static void heapify(int [] arr,int n,int i)
	{
		int larger=i;
		int left=i*2+1;
		int right=i*2+2;
		if(left<n&& arr[left]>arr[larger])
		{
			larger=left;
		}
		if(right<n && arr[right]>arr[larger])
		{
			larger=right;
		}
		if(larger!=i)
		{
			int temp=arr[larger];
			arr[larger]=arr[i];
			arr[i]=temp;
			heapify(arr,n,larger);
		}
		
	}
	public static void buildHeap(int [] arr,int n)
	{
		for(int i=(n-2)/2;i>=0;i--)
		{
			heapify(arr,n,i);
		}
	}
	public static void heapSort(int[] arr,int n)
	{
		buildHeap(arr,n);
		for(int i=arr.length-1;i>=1;i--)
		{
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heapify(arr,i,0);
		}
		
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
		heapSort(arr,n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		

	}

}
