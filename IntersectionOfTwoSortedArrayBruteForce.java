package sortingnew;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrayBruteForce {
	public static void intersectionOfTwoSortedArray(int[]arr1,int[]arr2)
	{
		int res=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(i>0&&arr1[i]==arr1[i-1])
			{
				continue;
			}
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					res++;
					System.out.print(arr1[i]+" ");
					break;
				}
				
			}
		}
		System.out.println();
		System.out.println("There is "+res+" no of intersection in two sorted array");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in first array: ");
		int n=sc.nextInt();
		int [] arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the number of element in second array: ");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		intersectionOfTwoSortedArray(arr1,arr2);
		sc.close();
		

	}

}
