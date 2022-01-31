package sortingnew;
import java.util.Scanner;

public class Paranthesis {
	public static void subSecquence(String str,String curr,int i)
	{
		if(i==str.length())
		{
			System.out.print(curr+" ");
			return ;
		}
		subSecquence(str,curr,i+1);
		subSecquence(str,curr+str.charAt(i),i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n;i++)
		{
			str=str+"(";
		}
		String curr="";
		int i=0;
		subSecquence(str,curr,i);
		

	}

}
