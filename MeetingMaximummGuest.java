package sortingnew;
import java.util.Arrays;
import java.util.Scanner;

public class MeetingMaximummGuest {
	public static int maximumGuest(int[] arr,int[] dep,int n)
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1,j=0;
		int res=1,curr=1;
		while(i<n&&j<n)
		{
			if(arr[i]<=dep[j])
			{
				curr++;
				i++;
			}
			else
			{
				curr--;
				j++;
			}
			res=Math.max(res, curr);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of arivals of person:");
		int n=sc.nextInt();
		System.out.println("Enter the time of arrivals of persons");
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int []dep=new int[n];
		System.out.println("Enter the time of depature of persons");
		for(int i=0;i<n;i++)
		{
			dep[i]=sc.nextInt();
		}
		int max_guest=maximumGuest(arr,dep,n);
		System.out.println(max_guest);
		
		sc.close();

	}

}
