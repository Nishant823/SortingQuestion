package sortingnew;
import java.util.Scanner;

public class IntersectionOfTwoSortedArraysOptimized {
	public static void intersectionOfTwoSortedArraysOptimized(int[] arr1,int[]arr2)
	{
		int res=0;
		int i=0,j=0;
		while(i<arr1.length&&j<arr2.length) 
		{
			if(i>0&&arr1[i]==arr1[i-1]) {
				i++;
			}
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				res++;
			}
			
		}
		System.out.println();
		System.out.println("There is "+res+" number of elements in two sorted array");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the number of element in array: ");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		intersectionOfTwoSortedArraysOptimized(arr1,arr2);
		sc.close();
		

	}

}
