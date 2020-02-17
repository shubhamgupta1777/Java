import java.util.Scanner;
public class solution 
{
    public static int[][] func(int arr[],int start) 
    {
		if(start==arr.length)
			return new int[1][0];
		
		int smallSub[][]=func(arr,start+1);
		int finalAns[][]=new int[smallSub.length*2][];
		
		for(int i=0;i<smallSub.length;i++)
		{
			int[] ar=smallSub[i];
			finalAns[i]=ar;
			
			int temp[]=new int[ar.length+1];
			temp[0]=arr[start];
			for(int j=1;j<temp.length;j++)
			{
				temp[j]=ar[j-1];
			}
			finalAns[i+smallSub.length]=temp;
		}
		return finalAns;
	}
	public static int[][] subsets(int input[]) 
    {
		return func(input,0);
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
