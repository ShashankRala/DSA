package PackDSA;
import java.util.Scanner;
public class AverageTempCal
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many days' temperature? :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		float sum=0,average;
		for(int i=0;i<size;i++)
		{
			System.out.print("Day "+(i+1)+"'s high tem :");
			arr[i]=sc.nextInt();
			sum = sum +arr[i];
		}
		average=sum/size;
		System.out.println("Average = "+average);

		int count=0;
		for(int i=0;i<size;i++)
		{
			if(average<arr[i])
			{
				count++;
				System.out.println((i+1)+" 's Day high temp is above Average temperature");	
			}	
		}
		    System.out.println(count+" days high Temperature are above average temperature");
	}

}