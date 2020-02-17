import java.util.Scanner;
public class solution {

	// Return a 2D array that contains all the subsets which sum to k
    
    public static void printSubsetsSumToK(int[] arr, int start, int sum, int[] path) {
		
		if(start == arr.length) {
			if(sum == 0) {
				for(int elem: path) {
					System.out.print(elem + " ") ;
				}
				System.out.println();
			}
			return;
		}
		int[] newPath = new int[path.length+1];
		
		for(int i = 0; i < path.length; i++) {
			newPath[i] = path[i];
		}
		newPath[path.length] = arr[start];
		
		printSubsetsSumToK(arr, start+1, sum-arr[start], newPath); //inclusion
		printSubsetsSumToK(arr, start+1, sum, path);
		
		
	}
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        printSubsetsSumToK(input,0,k,new int[0]);
       return new int[0][0];
	}

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
