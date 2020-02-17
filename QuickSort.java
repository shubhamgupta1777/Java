import java.util.Scanner;
public class Solution 
{
    public static int partition(int[] input,int si,int li)
    {
        int pivot=input[li];
        int i=si-1;
        
        for(int j=si;j<li;j++)
        {
            if(input[j]<pivot)
            {
                i++;
                
                int tmp=input[i];
                input[i]=input[j];
                input[j]=tmp;
            }
        }
        int tmp=input[i+1];
        input[i+1]=input[li];
        input[li]=tmp;
        
        return i+1;
    }
	public static void quickSort(int[] input,int si,int li)
    {
        if(si<li)
        {
            int pi=partition(input,si,li);
            
            quickSort(input,si,pi-1);
            quickSort(input,pi+1,li);
        }  
        
    }
	public static void quickSort(int[] input) 
    {
        quickSort(input,0,input.length-1);
	}   
    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int[] input = takeInput();
        quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}