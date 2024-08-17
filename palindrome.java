import java.util.*;

class palindrome
	{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				
				int i;
				String r="";
				System.out.println("enter the string");
				String s=sc.nextLine();
				for(i=s.length()-1;i>=0;i--)
				{r=r+s.charAt(i);
				}
				if(s.equals(r))
				{System.out.println("both equal so palindrome");
				}
				else
				System.out.println("both not equal so not palindrome");
			}
	}
				
