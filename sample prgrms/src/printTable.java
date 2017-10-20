import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter anumber: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=20;i++)
		{
			System.out.println(i+"*"+num+"="+num*i);
		}
		
        
	}

}
