import java.util.Scanner;
public class solution 
{	
    public static char helper(int n)
    {
        char c;
        c=(char)('a'+n-1);
        return c;
    }
	public static  String[] getCode(String input)
    {
         if(input.length()==0)
         {
             String[] str={""};
		     return str;
         }
        
        String sub2=input.substring(0,1);
        String sub3=input.substring(1);
        char c=helper(Integer.parseInt(sub2));
        String[] s1=getCode(sub3);
        String[] ans=new String[s1.length];
        for(int i=0;i<s1.length;i++)
            ans[i]=c+""+s1[i];
        
        
        if(input.length()>=2)
        {    
            String sub=input.substring(0,2);
            String sub1=input.substring(2);
          
            if(Integer.parseInt(sub)<=26)
            {
                char c1=helper(Integer.parseInt(sub));            
                String[] s2=getCode(sub1);            
                String[] ans1=new String[s2.length];
                for(int i=0;i<s2.length;i++)
                {
                    ans1[i]=c1+""+s2[i];
                }
                
                String[] ans2=new String[ans.length + ans1.length]; 
                for(int i=0;i<ans2.length;i++)
                {
                    if(i<ans.length)
                        ans2[i]=ans[i];
                    else
                        ans2[i]=ans1[i-ans.length]; 
                }
                    
                return ans2;
            }
        }
        return ans;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String output[] = getCode(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
