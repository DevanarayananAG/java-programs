import java.util.*;
class matrix
	{
	public static void main(String[] args)
		{
			int i,j,k;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter r1 : \n");
			int r1=sc.nextInt();
			System.out.println("enter c1 : \n");
			int c1=sc.nextInt();
			int [][]a=new Int[r1][c1];
			System.out.println("enter the elements\n");
			for(i=0;i<r1;i++)
			{
			for (j=0;j<c1;j++)
			{a[i][j]=sc.nextInt();
			}System.out.println(" ");
			}
			
			
			System.out.println("enter r2 : \n");
			int r2=sc.nextInt();
			System.out.println("enter c2 : \n");
			int c2=sc.nextInt();
			int [][]b=new Int();
			System.out.println("enter the elements\n");
			for(i=0;i<r2;i++)
			{
			for (j=0;j<c2;j++)
			{b[i][j]=sc.new Int[r2][c2];
			}System.out.println(" ");
			}
			if(c1!=r2)
			{
			System.out.println("not possible");
			}
			
			int [][]result=new int[r1][c2];
			
			for(i=0;i<r1;i++)
			{
			for (j=0;j<c2;j++)
			{
			result[i][j]=0;
			for(k=0;k<c1;k++)
			{result[i][j]+=a[i][k]*b[k][j];
			}}}
			
			for(i=0;i<r1;i++)
			{
			for (j=0;j<c2;j++)
			{
			result[i][j]=0;
			for(k=0;k<c1;k++)
			{System.out.println(result[i][j]+" ");
			}System.out.println("  ");
			}}}
			}
			
			
			
