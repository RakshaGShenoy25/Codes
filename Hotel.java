import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class Test{
	int slno,k=1,no,qty;
	double price=0;
	String a[]={"MasalaDosa","NeerDosa  ","PuriSagu  ","IdliSambar","Pulav     ","Uppitu    ","BhondaSoup",
			"Bajji     ","KesariBath","SetDosa    ","Coffee    ","tea       "};
	int b[]={35,30,40,30,40,25,25,20,25,35,10,10};
	int flag[]=new int[13];
	Scanner sc=new Scanner(System.in);
	int ch;
	int y[]=new int[50];
	int sum=0;
	int tot[]=new int[50];
	void display()
	{
		System.out.println("Would you like to order yes=1/no=0");
		ch=sc.nextInt();
		while(ch!=0)
		{
			
				int k=1;
				System.out.println("Slno	Name		Price");
				System.out.println("***************************");
				for(int i=0;i<12;i++)
				{
				System.out.println(k+"	"+a[i]+"		"+b[i]);
				k++;
				}
			System.out.println("Enter the respective menu no and quantity ");		
			System.out.println("no		qty");
			 no=sc.nextInt();
			 flag[no]=1;
			System.out.println("		");
			 qty=sc.nextInt();
			 y[no]=qty;
			
			System.out.println("Would you like to order yes/no");
			ch=sc.nextInt();
			total();
		}
			 
		if(ch==0){
				dis();

			}
			
}	
	
void total(){
		switch(no)
		{
		case 1:sum=(b[0]*qty);break;
		case 2:sum=(b[1]*qty);break;
		case 3:sum=(b[2]*qty);break;
		case 4:sum=(b[3]*qty);break;
		case 5:sum=(b[4]*qty);break;
		case 6:sum=(b[5]*qty);break;
		case 7:sum=(b[6]*qty);break;
		case 8:sum=(b[7]*qty);break;
		case 9:sum=(b[8]*qty);break;
		case 10:sum=(b[9]*qty);break;
		case 11:sum=(b[10]*qty);break;
		case 12:sum=(b[11]*qty);break;
		}
		tot[no]=sum;
		price=price+sum;
	}
void dis() 
	{
	try{
	BufferedWriter out1=new BufferedWriter(new FileWriter("D:/myfileHotel.txt",true));
		Date d=new Date();
		System.out.println("		Shenoy Hotel				");
		out1.append("		Shenoy Hotel				 ");
		out1.newLine();
		System.out.println("		"+d.toString()+"			");
		System.out.println("*****************************************");
		out1.append("*****************************************");
		out1.newLine();
		System.out.println("slno	Item		quantity		Total");
		out1.append("slno	Item		quantity		Total");
		out1.newLine();
		for(int i=1;i<13;i++)
		{
			if(flag[i]==1)
				
			{
				System.out.println(i+"	"+a[i-1]+"		"+y[i]+"		"+ tot[i]);
				out1.append(i+"	"+a[i-1]+"		"+y[i]+"		"+ tot[i]);
				out1.newLine();
				
			}
		}
		System.out.println("*****************************************");
		out1.append("*****************************************");
		out1.newLine();
		System.out.println(			"GRAND TOTAL   "+price);
		out1.append("GRAND TOTAL   "+price);
		out1.newLine();
		System.out.println("*****************************************");
		out1.append("*****************************************");
		out1.newLine();
		System.out.println("............THANK YOU....................");
		out1.append("............THANK YOU....................");
		out1.newLine();
		out1.close();
	}catch(IOException ioe){
		ioe.printStackTrace();}
	
	
}}
public class Hotel{
	public static void main(String args[])
	{
		System.out.println("*****Welcome*****");
		Test t=new Test();
		t.display();
	}
}
