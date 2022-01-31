package sortingnew;
import java.util.Scanner;

public class CountInversion {
	public static int countInversion(int[]arr)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					res++;
				}
			}
		}
		return res;
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
		int res=countInversion(arr);
		System.out.println("The number of count inversion in an array is: "+ res);
		
		sc.close();

	}

}
