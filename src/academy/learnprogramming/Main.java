package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int res = 0;
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the number of elements: ");
	n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
	//XOR of the entire array
	int j=0;
	while(j < n)
    {
        res = res ^ arr[j];
        j++;
    }

	int right_most_set = res & ~(res -1);

	int x =0;
	int y =0;

	for(int k=0; k<n; k++)
    {
        if((arr[k] & right_most_set) > 0)  //elements not having 1 at the same right most bit
        {
            x = x ^ arr[k];
        }
        else                                //elements having 1 at the same right most bit
        {
            y = y ^ arr[k];
        }
    }

	System.out.println("Result: " + x + " " + y);
    }
}
