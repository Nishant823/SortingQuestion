package sortingnew;
import java.util.Scanner;

public class RadixSort {
	public static void radixSort(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int ex=1;(max/ex)>0;ex=ex*10)
		{
			countSort(arr,arr.length,ex);
		}
	}
	public static void countSort(int[] arr,int n,int ex)
	{
		int[] count=new int[10];
		int[] output=new int[n];
		for(int i=0;i<n;i++)
		{
			count[(arr[i]/ex)%10]++;
		}
		for(int i=1;i<10;i++)
		{
			count[i]=count[i-1]+count[i];
		}
		for(int i=n-1;i>=0;i--)
		{
			output[count[(arr[i]/ex)%10]-1]=arr[i];
			count[(arr[i]/ex)%10]--;
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		radixSort(arr);
		System.out.println("After radix sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		sc.close();

	}

}
