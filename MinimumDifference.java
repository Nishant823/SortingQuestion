package sortingnew;
import java.util.Scanner;

public class MinimumDifference {
	public static int minimmumDifference(int[] arr)
	{
		
		int res=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				 res=Math.min(res, (Math.abs(arr[i]-arr[j])));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=minimmumDifference(arr);
		System.out.println("The minimmum difference in an array: "+res);
		
		sc.close();
		

	}

}
