
import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 
	{
	    Scanner sc = new Scanner(System.in);int n; int arr[];
	    void read()
	    { 
	        System.out.println("How many numbers to be entered");
	        n = sc.nextInt();
	        arr=new int[n];
	        System.out.println("Read the numbers into array");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	    }
	    void display()
	    {
	        System.out.println("Entered numbers into array");
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(arr[i]);
	        }
	    }
	    void sortedArray()
	    {
	        Arrays.sort(arr);
	    }
	    void search()
	    {
	        System.out.println("Enter the number to be searched");
	        int number = sc.nextInt();
	        int flag=0;
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]==number)
	            {
	                flag=1;
	            }
	        }
	        if(flag==1)
	        {
	            System.out.println("Number is found");
	        }
	        else{
	            System.out.println("Number is not found");
	        }
	    }
	}