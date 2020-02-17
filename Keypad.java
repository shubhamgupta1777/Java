import java.util.*;
public class solution 
{

    public static String[] help(int n)
    {
        if(n==1 || n==0)
        {
            String s[]=new String[1];
            s[0]="";
            return s;
        }
        else if(n==2)
        {
            String s[]={"a","b","c"};
            return s;
        }
        else if(n==3)
        {
            String s[]={"d","e","f"};
            return s;
        }
        else if(n==4)
        {
            String s[]={"g","h","i"};
            return s;
        }
        else if(n==5)
        {
            String s[]={"j","k","l"};
            return s;
        }
        else if(n==6)
        {
            String s[]={"m","n","o"};
            return s;
        }
        else if(n==7)
        {
            String s[]={"p","q","r","s"};
            return s;
        }
        else if(n==8)
        {
            String s[]={"t","u","v"};
            return s;
        }
        else
        {
            String s[]={"w","x","y","z"};
            return s;
        }
    }
	public static String[] keypad(int n)
    {
		if(n==0 || n==1)
        {
            String s[]=new String[1];
            s[0]="";
            return s;
        }
        
        int b=0;
        b=n%10;
        
        String s1[]=keypad(n/10);
        
        String s[]=help(b);
        
        String sa[]=new String[s.length*s1.length];
        int k=0;
        for(int i=0;i<s.length;i++)
        {
        	for(int j=0;j<s1.length;j++)
        	{
        		sa[k]=s1[j]+s[i];
        		k++;
        	}
        }
         return sa;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

