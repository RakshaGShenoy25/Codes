import java.util.*;
class Test2{
	Scanner sc=new Scanner(System.in);
	static double total;
	int gen,ch1;
	static int k=0;
	String items[]=new String[100];
	double sum[]=new double[100];
	String ad;
	void fashion(){
		System.out.println("		Welcome to fashion		");
		System.out.println("**********************************");
		System.out.println("1)Pants          "+"2)Tshirt        "+"3)Shirts"+"4)Kurtha    ");
		System.out.println("enter your choice");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("1)Men 2)Women");
				gen=sc.nextInt();
				switch(gen)
				{
				case 1:System.out.println("1)formal- 999 2)Casual-	750");break;
				case 2:System.out.println("1)formal-  999 2)Stylish-	650");break;
				case 3:System.out.println("Do you want to go back to home press 3");break;
				}
				System.out.println("enter your choice");
				ch1=sc.nextInt();
				if(gen==1 && ch1==1){
					total=total+999;
					 items[k]="Men Formal     ";
					 sum[k]=999;
					k++;
				}
				if(gen==1 && ch1==2){
					total=total+750;
					items[k]="Men Casual     ";
					 sum[k]=750;
					k++;
				}
				if(gen==2 && ch1==1){
					total=total+999;
					items[k]="Women Formal   ";
					 sum[k]=999;
					k++;
				}
				if(gen==2 && ch1==2){
					total=total+650;
					items[k]="Women Stylish  ";
					 sum[k]=650;
					k++;
				}
				if(ch1==3)
					return;
				break;
		case 2:	System.out.println("1)Men 2)Women");
				gen=sc.nextInt();
				switch(gen)
				{
				case 1:System.out.println("1)DJ&C-  999 2)PeterEngland-	750");break;
				case 2:System.out.println("1)DJ&C-   999 2)Woodland-    850");break;
				case 3:System.out.println("Do you want to go back to home press 3");break;
				}
				System.out.println("enter your choice");
				ch1=sc.nextInt();
				if(gen==1 && ch1==1){
					total=total+999;
					 items[k]="Men DJ&C       ";
					 sum[k]=total;
					k++;
				}
				if(gen==1 && ch1==2){
					total=total+750;
					items[k]="Men PeterEnglan";
					 sum[k]=750;
					k++;
				}
				if(gen==2 && ch1==1){
					total=total+999;
					items[k]="Women Dj&C     ";
					 sum[k]=999;
					k++;
				}
				if(gen==2 && ch1==2){
					total=total+850;
					items[k]="Women Woodland     ";
					 sum[k]=850;
					k++;
				}
				if(ch1==3)
					return;
				break;
		case 3:		System.out.println("1)DJ&C-  999 2)PeterEngland-	750");
					System.out.println("Do you want to go back to home press 3");
					System.out.println("enter your choice");
					ch1=sc.nextInt();
					if(ch1==1){
					total=total+999;
					 items[k]="Shirt DJ&C     ";
					 sum[k]=999;
					k++;}
					if(ch1==2){
						total=total+999;
						 items[k]="Shirt PE       ";
						 sum[k]=999;
						k++;
					}
					if(ch1==3)
						return;
					break;
		case 4:		System.out.println("1)Formals-  999 2)Designer-	750");
					System.out.println("Do you want to go back to home press 3");
					System.out.println("enter your choice");
					ch1=sc.nextInt();
					if(ch1==1){
						total=total+999;
						items[k]="Formals        ";
						sum[k]=999;
						k++;}
						if(ch1==2){
							total=total+999;
							items[k]="Designer       ";
							sum[k]=999;
							k++;
						}
						if(ch1==3)
							return;
						break;	
				}
   }
	void elect(){
		System.out.println("		Welcome to Electronics		");
		System.out.println("************************************");
		System.out.println("1)Tv		"+"2)Laptops        "+"3)Refrigerator   "+"4)mobiles        ");
		System.out.println("enter your choice");
		int n=sc.nextInt();
		switch(n){
				case 1:System.out.println("1)Sony-	32000 "+"2)Samsung-	28000 "+" 3)LG-	25000");
						System.out.println("Do you want to go back to home press 4");
						ch1=sc.nextInt();
						if(ch1==1){
							total=total+32000;
							items[k]="Sony           ";
							sum[k]=32000;
							k++;
						}
						if(ch1==2){
							total=total+28000;
							items[k]="Samsung       ";
							sum[k]=28000;
							k++;
						}
						if(ch1==3){
							total=total+25000;
							items[k]="lg             ";
							sum[k]=25000;
							k++;
						}
						if(ch1==4)
							return;
						break;
				case 2:	System.out.println("1)Sony-	32000"+" 2)lenovo-	35000"+" 3)hp-	35500");
						System.out.println("Do you want to go back to home press 4");
						ch1=sc.nextInt();	
						if(ch1==1){
							total=total+32000;
							items[k]="Sony           ";
							sum[k]=32000;
							k++;
						}
						if(ch1==2){
							total=total+35000;
							items[k]="lenovo        ";
							sum[k]=35000;
							k++;
						}
						if(ch1==3){
							total=total+35500;
							items[k]="hp             ";
							sum[k]=35500;
							k++;
						}
						if(ch1==4)
							return;
						break;
				case 3:	System.out.println("1)lg-	32000 "+"2)whirlpool-	35000 "+"3)Godrej-	33000");
						System.out.println("Do you want to go back to home press 4");
							ch1=sc.nextInt();	
							if(ch1==1){
								total=total+32000;
								items[k]="lg             ";
								sum[k]=32000;
								k++;
							}
							if(ch1==2){
								total=total+35000;
								items[k]="whirlpool      ";
								sum[k]=35000;
								k++;
							}
							if(ch1==3){
								total=total+33000;
								items[k]="godrej         ";
								sum[k]=33000;
								k++;
							}
							if(ch1==4)
								return;
							break;
							
				case 4:	System.out.println("1)motog3-	13000 "+"2)lenovo-	11000 "+"3)Samsung-	18000 ");
							System.out.println("Do you want to go back to home press 4");
							ch1=sc.nextInt();
							if(ch1==1){
								total=total+13000;
								items[k]="motog3         ";
								sum[k]=13000;
								k++;
							}
							if(ch1==2){
								total=total+11000;
								items[k]="lenovo        ";
								sum[k]=11000;
								k++;
							}
							if(ch1==3){
								total=total+18000;
								items[k]="Samsung       ";
								sum[k]=total;
								k++;
							}
							if(ch1==4)
								return;
							break;	
		}
		
	}
	void furniture(){
		System.out.println("		Welcome to HomeTown		");
		System.out.println("************************************");
		System.out.println("1)tables		"+"2)Sofas        "+"3)doublecot   ");
		System.out.println("enter your choice");
		int n=sc.nextInt();
		switch(n){
				case 1:System.out.println("1)wooden-  32000"+" 2)Glass-	28000");
						System.out.println("Do you want to go back to home press 3");
						ch1=sc.nextInt();
						if(ch1==1){
							total=total+32000;
							items[k]="wooden         ";
							sum[k]=32000;
							k++;
						}
						if(ch1==2){
							total=total+28000;
							items[k]="Glass         ";
							sum[k]=28000;
							k++;
						}
						if(ch1==3)
							return;
						break;
				case 2:	System.out.println("1)wooden-	42000 "+" 2)Designer-	28000");
						System.out.println("Do you want to go back to home press 4");
						ch1=sc.nextInt();	
						if(ch1==1){
							total=total+42000;
							items[k]="Wooden         ";
							sum[k]=42000;
							k++;
						}
						if(ch1==2){
							total=total+28000;
							items[k]="Designer       ";
							sum[k]=28000;
							k++;
						}
						if(ch1==3)
							return;
						break;
				
				case 3:	System.out.println("kingsize-  47000"+" Queensize-  43000");
						System.out.println("Do you want to go back to home press 4");
							ch1=sc.nextInt();	
							if(ch1==1){
								total=total+47000;
								items[k]="kingsize       ";
								sum[k]=47000;
								k++;
							}
							if(ch1==2){
								total=total+43000;
								items[k]="Queensize      ";
								sum[k]=43000;
								k++;
							}
							if(ch1==4)
								return;
							break;	
		}
	}
	void address(){
		System.out.println("Enter your address");
		ad=sc.next();
	}
	void bill(){
		Date d=new Date();
		int flag=0;
		System.out.println("................YOUR ORDER.................");
		for(int l=0;l<k;l++){
			System.out.println(l+1 +"		"+items[l]+"  "+sum[l]);
		}
		int fg=k;
		System.out.println("...........................................");
		System.out.println("GRAND TOTAL                :"+total);
		System.out.println("...........................................");
		System.out.println("YOU ORDERED ON	"+d.toString()+"			");
		System.out.println("ADDRESS: "+ad);
		System.out.println("~~~~~~~~~~THANK YOU FOR ORDERING~~~~~~~~~~~~~");
		System.out.println("Do you want to cancel the order(Yes=1)/(No=0)");
		int y=sc.nextInt();
		while(y!=0)
		{
			flag=1;
			System.out.println("Specify particular orderno");
			k=sc.nextInt();
			items[k-1]=" ";
			total=total-sum[k-1];
			sum[k-1]=0;
			System.out.println("Do you want to cancel the order(Yes=1)/(No=0)");
			y=sc.nextInt();
		}
		if(flag==1)
		{
			System.out.println("................YOUR ORDER.................");
			for(int l=0;l<fg;l++){
				System.out.println(l+1 +"		"+items[l]+"  "+sum[l]);
			}
		System.out.println("GRAND TOTAL                :"+total);
		System.out.println("...........................................");
		System.out.println("YOU ORDERED ON	"+d.toString()+"			");
		System.out.println("ADDRESS: "+ad);
		System.out.println("~~~~~~~~~~THANK YOU FOR ORDERING~~~~~~~~~~~~~");}
	}
}
class Trade {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Test2 t=new Test2();
		System.out.println("would you like to order(yes=1/no=0)");
		int m=sc.nextInt();
		while(m!=0)
		{
			if(m==0)
				break;
			System.out.println("		Choose the catagory						");
			System.out.println("................................................");
			System.out.println("1)Electronics 2)Fashion 3)Hometown");
			int n=sc.nextInt();
			switch(n){
			case 1:t.elect();break;
			case 2:t.fashion();break;
			case 3:t.furniture();break;
			}	
			System.out.println("would you like to order(yes=1/no=0)");
			m=sc.nextInt();
		}
		t.address();
		t.bill();
}}
