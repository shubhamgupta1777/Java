import java.util.Scanner;
public class solution {
	
	public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length()==0)
        {
            String output[] = {""};
            return output;
        }
        String[] smallOutput = permutationOfString(input.substring(1));
        
        String output[] = new String[input.length()*smallOutput.length];
        int k=0;
        for(int i=0;i<smallOutput.length;i++)
        {
            String currentString = smallOutput[i];
            for(int j=0;j<=currentString.length();j++)
            {
                output[k] = currentString.substring(0,j) + input.charAt(0) + currentString.substring(j);
                k++;
            }
        }
        return output;
	}
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String output[] = permutationOfString(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
