#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
	int a[20][20],b[20][20],l=1,no=1,i,j,x,y,n;
	printf("game starts\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=no;
			no++;
		}
	}
	for(x=0;x<3;x++)
	{
		for(y=0;y<3;y++)
		{
			b[x][y]=5;
		}
	}
	printf("first player :0\n");
	printf("sec player :1\n");

	while(l<10)
	{
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				printf("%d ",b[x][y]);
			}
			printf("\n");
		}

		if(l%2==0)
		{
			printf("sec player:enter position : ");
			scanf("%d",&n);
		}
		else
		{
			printf("first player:enter position : ");
			scanf("%d",&n);
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]==n)
				{
					x=i;
					y=j;
					if(l%2==0)
						b[x][y]=1;
					else
						b[x][y]=0;
				}
			}
		}
		switch(n)
		{
		case 1:if(((b[0][0]==b[0][1])&&(b[0][1]==b[0][2]))||((b[0][0]==b[1][1])&&(b[1][1]==b[2][2]))||((b[0][0]==b[1][0])&&(b[1][0]==b[2][0])))
			   {
				   printf("you won\n");
				   
				   exit(0);
				
			   }break;
		case 2:if(((b[0][0]==b[0][1])&&(b[0][1]==b[0][2]))||((b[0][1]==b[1][1])&&(b[1][1]==b[2][1])))
			   {
				   printf("you won\n");
				   
				   exit(0);
				   
			   }break;
		case 3:if(((b[0][0]==b[0][1])&&(b[0][1]==b[0][2]))||((b[0][2]==b[1][2])&&(b[1][2]==b[2][2]))||((b[0][2]==b[1][1])&&(b[1][1]==b[2][0])))
			   {
				   printf("you won\n");
				   exit(0);
		
			   }
				break;
		case 4:if(((b[1][0]==b[1][1])&&(b[1][1]==b[1][2]))||((b[1][0]==b[0][0])&&(b[0][0]==b[2][0])))
			   {
				   printf("you won\n");
			
				   exit(0);
				 
			   }
			   break;
		case 5:if(((b[0][0]==b[1][1])&&(b[1][1]==b[2][2]))||((b[0][1]==b[1][1])&&(b[1][1]==b[2][1]))||((b[1][0]==b[1][1])&&(b[1][1]==b[1][2])))
			   {
				   printf("you won\n");
				   
				   exit(0);
				  
			   }
			   break;
		case 6:if(((b[1][0]==b[1][1])&&(b[1][1]==b[1][2]))||((b[0][2]==b[1][2])&&(b[1][2]==b[2][2])))
			   {
				   printf("you won\n");
			
				   exit(0);
				   
			   }
			   break;
		case 7:if(((b[0][0]==b[1][0])&&(b[1][0]==b[2][0]))||((b[2][0]==b[1][1])&&(b[1][1]==b[0][2]))||((b[2][0]==b[2][1])&&(b[2][1]==b[2][2])))
			   {
				   printf("you won\n");
				   
				   exit(0);
				   
			   }
			   break;
		case 8:if(((b[0][1]==b[1][1])&&(b[1][1]==b[2][1]))||((b[2][0]==b[2][1])&&(b[2][1]==b[2][2])))
			   {
				   printf("you won\n");
				  
				   exit(0);
				   
			   }
			   break;
		case 9:if(((b[2][0]==b[2][1])&&(b[2][1]==b[2][2]))||((b[0][0]==b[1][1])&&(b[1][1]==b[2][2]))||((b[0][2]==b[1][2])&&(b[1][2]==b[2][2])))
			   {
				   printf("you won\n");
				   
				   exit(0);

			   }break;


		}
		l++;
	}
	printf("draw\n");
}