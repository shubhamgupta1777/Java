import java.util.Scanner;
public class solution {

	public static int Search(int input[],int si,int li,int x)
    {
        if(si<=li)
        {
            int mid=si+(li-si)/2;
            
            if(input[mid]==x)
                return mid;
            
            if(input[mid]<x)
                return Search(input,mid+1,li,x);
            
            if(input[mid]>x)
                return Search(input,si,mid-1,x);
        }
        return -1;
    }
	public static int binarySearch(int input[], int element) 
    {
		int index=Search(input,0,input.length-1,element);
        return index;
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
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}
}

