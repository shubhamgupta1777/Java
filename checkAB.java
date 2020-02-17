import java.util.Scanner;
public class Solution {

    public static boolean checkAB(String input)
    {
        if(input.length()==0)
            return true;
        boolean s=false;
        
        if(input.charAt(0)=='a')
        {
            String str=input.substring(1);
                if(str.length()>1 && str.substring(0,2).equals("bb"))
                    return checkAB(str.substring(2));
                else
                    return checkAB(input.substring(1));
        }
        
        return false;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}

}