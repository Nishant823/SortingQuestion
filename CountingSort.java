package sortingnew;
import java.util.Scanner;

public class CountingSort {
	public static void countingSort(int[] arr,int k)
	{
		int []count=new int[k+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		for(int i=1;i<count.length;i++)
		{
			
			count[i]=count[i-1]+count[i];
		}
		int [] output=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=output[i];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the maximum number in an array: ");
		int k=sc.nextInt();
		countingSort(arr,k);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
