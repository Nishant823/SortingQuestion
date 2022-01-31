package sortingnew;
import java.util.Scanner;


public class UnionOfTwoSortedArrayOptimized {
	public static void unionOfTwoSortedArray(int[]a,int[]b,int n,int m)
	{
		int i=0;
		int j=0;
		while(i<n&&j<m)
		{
			if(i>0 && a[i]==a[i-1])
			{
				
				i++;
				continue;
			}
			if(j>0 && b[j]==b[j-1])
			{
				
				j++;
				continue;
			}
			if(a[i]<b[j])
			{
				System.out.print(a[i]+" ");
				i++;
			}
			else if(a[i]>b[j])
			{
				System.out.print(b[j]+" ");
			}
			else if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
				
			}
		}
		while(i<n)
		{
			if(i==0||a[i]!=a[i-1])
			{
				System.out.print(a[i]+" ");
				
				
			}
			i++;
			
		}
		while(j<m)
		{
			if(j==0 || b[j]!=b[j-1])
			{
				
				System.out.print(b[j]+" ");
				
			}
			j++;
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
		int[]b=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		unionOfTwoSortedArray(a,b,n,m);
		sc.close();

	}

}
