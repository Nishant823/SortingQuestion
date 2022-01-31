package sortingnew;
import java.util.Scanner;

public class DutchNationalFlagAlgorithm {
	public static void dutchNationalFlagAlgo(int[] arr)
	{
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high)
		{
			if(arr[mid]>1)
			{
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
			else if(arr[mid]<1)
			{
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else
			{
				mid++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		dutchNationalFlagAlgo(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		sc.close();

	}

}
