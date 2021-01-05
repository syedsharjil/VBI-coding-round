import java.util.*;

class Ages
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int n=in.nextInt(); //size of array
		int arr[]=new int[n]; //initializing array
		int i;
		for(i=0;i<n;i++)
		    arr[i]=in.nextInt(); //array elements input
		int agefrequency[]=new int[10];
		Arrays.fill(agefrequency,0);
         for(i=0; i<n; i++)
         {
            if(arr[i]>=1 && arr[i]<=10) //comparing every element with the given slab they fall into
                agefrequency[0]+=1;
            
            else if(arr[i]>10 && arr[i]<=20)
                agefrequency[1]+=1;
            
            else if(arr[i]>20 && arr[i]<=30)
                agefrequency[2]+=1;
            
            else if(arr[i]>30 && arr[i]<=40)
                agefrequency[3]+=1;
            
            else if(arr[i]>40 && arr[i]<=50)
                agefrequency[4]+=1;
            
            else if(arr[i]>50 && arr[i]<=60)
                agefrequency[5]+=1;
            
            else if(arr[i]>60 && arr[i]<=70)
                agefrequency[6]+=1;
            
            else if(arr[i]>70 && arr[i]<=80)
                agefrequency[7]+=1;
            else if(arr[i]>80 && arr[i]<=90)
                agefrequency[8]+=1;
            else if(arr[i]>90 && arr[i]<=100)
                agefrequency[9]+=1;
            
        }
        int lower=1,higher=10; //initializing starting slab limits
        System.out.print("Age Group"+"\t"+"Total Number of People");
        System.out.println();
        for(i=0;i<10;i++)
        {
            System.out.print(lower+"-"+higher+"\t"+"\t"+agefrequency[i]);
            lower+=10; //incrementing the lower interval by 10
            higher+=10; //incrementing the higher interval by 10
            System.out.println();
        }
    }
}