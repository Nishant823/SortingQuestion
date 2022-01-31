package sortingnew;
import java.util.Scanner;

public class SortArrayWithZerosandOnes {
	public static void sortArray(int[]arr)
	{
		int i=-1;
		int j=arr.length;
		
		while(i<j)
		{
			do {
				i++;
				
			}while((i<arr.length) && (arr[i]==0));
			
			do {
				j--;
				
			}while(j>=0 && arr[j]==1);
			
			if(i>=j)
				return;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
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
		sortArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}

}
