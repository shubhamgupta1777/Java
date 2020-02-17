import java.util.Scanner;
public class solution 
{
    public static void merge(int[] a,int[] b,int[] input)
    {
        int l1=a.length,l2=b.length;
        int i=0,j=0,k=0;
        while(i<l1 && j<l2)
        {
            if(a[i]>b[j])
            {
                input[k]=b[j];
                j++;
                k++;
            }
            else
            {
                input[k]=a[i];
                i++;
                k++;
            }
        }
        while(i<l1)
        {
            input[k]=a[i];
            i++;
            k++;
        }
        while(j<l2)
        {
            input[k]=b[j];
            k++;
            j++;
        }
    }

	public static void mergeSort(int[] input)
    {
        if(input.length==1)
            return;
		
		int n=input.length/2;
        int m=input.length-n;
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<input.length;i++)
        {
            if(i<n)
                a[i]=input[i];
            else
                b[i-n]=input[i];
        }
        mergeSort(a);
        mergeSort(b);
        
        merge(a,b,input);
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
    
    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] input = takeInput();
        mergeSort(input);
        printArray(input);
    }
}
