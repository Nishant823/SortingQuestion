package sortingnew;
import java.util.Scanner;

public class HeapSortOnceMore {
	public static void heapify(int[] arr,int n,int i)
	{
		int max=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && arr[left]>arr[max])
		{
			max=left;
		}
		if(right<n&&arr[right]>arr[max])
		{
			max=right;
		}
		if(i!=max)
		{
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			heapify(arr,n,max);
		}
		
		
		
		
	}
	public static void buildHeap(int[]arr,int n)
	{
		for(int i=(n-2)/2;i>=0;i--)
		{
			heapify(arr,n,i);//n is size and i is place where greater element has to be placed
		}
	}
	public static void heapSort(int []arr,int n)
	{
		buildHeap(arr,n);
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
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
