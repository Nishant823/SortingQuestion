package sortingnew;
import java.util.Scanner;

public class SortingAroundGivenPivotNaiveSolution {
	public static void arraySort(int[] arr,int pivot)
	{
		int []temp=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<pivot)
			{
				temp[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==pivot)
			{
				temp[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>pivot)
			{
				temp[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the pivot around which we have to sort: ");
		int pivot=sc.nextInt();
		arraySort(arr,pivot);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
