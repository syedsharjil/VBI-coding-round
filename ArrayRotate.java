import java.util.*;
class ArrayRotate
{
    public static void rightrotate(int arr[],int n,int k) //function to rotate array by k times
    {
        for(int i=0;i<k;i++)
            rotatebyone(arr,n); //helper function called k times
    }
    public static void rotatebyone(int arr[],int n) // rotates array by 1
    {
        int t=arr[n-1]; //storing the last element temporarily
        for(int i=n-1;i>=1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=t; //putting the last element at the end
            
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in =new Scanner(System.in);
	    int n=in.nextInt(); //size input
	    int k=in.nextInt(); //no.of rotation required
	    int arr[]=new int[n]; //initializing array
	    int i;
	    for(i=0;i<n;i++)
		    arr[i]=in.nextInt(); //input of element
		rightrotate(arr,n,k); 
		for(i = 0; i < n; i++) 
            System.out.print(arr[i]+" "); //printing the rotated array
	}
}

/*
1. One way to solve the problem can be using  the inbuilt rotate() method present in Collections class in Java
2. One of the ways is to do it by the method that I have used, that is to use a helper function which rotates the array by one. This function can be called k times to get the desired result.
3. Another way could be by slicing the array and printing it, first arr[n-k:] are printed and then arr[0:k] are printed
*/