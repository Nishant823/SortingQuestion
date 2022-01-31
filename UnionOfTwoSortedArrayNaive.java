package sortingnew;
import java.util.Scanner;
import java.util.Arrays;

public class UnionOfTwoSortedArrayNaive {
	public static void unionOfTwoSortedArray(int[]a,int[]b,int n,int m)
	{
		int[] c=new int[m+n];
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];
		}
		for(int i=n;i<m+n;i++)
		{
			c[i]=b[i-n];
		}
		Arrays.sort(c);
		for(int i=0;i<(m+n);i++)
		{
			if(i==0||(c[i]!=c[i-1]))
			{
				System.out.print(c[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the number of element in second array: ");
		int m=sc.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		unionOfTwoSortedArray(a,b,n,m);
		sc.close();

	}

}
