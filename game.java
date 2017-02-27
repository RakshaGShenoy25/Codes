import java.util.*;
import java.lang.*;
class game{
	public static void main(String args[]){
	
		int i,n,j=1;
		long sum=0;
		System.out.println("enter the number of trials do you want to play");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		double no=Math.random();
		a[0]=(int)no;
		double temp=no;
		for(i=1;i<n;i++)
		{
			
			no=Math.random();
	
			if(no<temp)
			{
				a[j]=(int)no;
				j++;
				sum=sum+50;
			}
			else
			{
				sum=sum-50;
			}
			temp=no;
		}
		if(sum>=100)
			System.out.println("You Won!!");
		else
		{
			for(i=0;i<1000;i++)
			{
				sum=sum+i;
				if(sum==0)
				{
					System.out.println("You lost "+i+"Rupees");
					break;
				}
				else
					sum=sum-i;
			}
		}
		
	}
}