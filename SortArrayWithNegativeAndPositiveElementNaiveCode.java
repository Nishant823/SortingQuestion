package sortingnew;
import java.util.Scanner;

public class SortArrayWithNegativeAndPositiveElementNaiveCode {
	public static void SortArray(int[]arr)
	{
		int[]temp=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				temp[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
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
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		SortArray(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
