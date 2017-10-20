import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter anumber: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}}
			if(count==0)
			{
				System.out.println("prime");
			}
			else{
				System.out.println("not prime");
			
		}
		

	}

}
