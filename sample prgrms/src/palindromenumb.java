import java.util.Scanner;

public class palindromenumb {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		System.out.println("enter a number ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int n=number;
		int b=0;
		while(number>0)
		{
			int a=number%10;
			    b=(b*10)+a;
			 number=number/10;
			}
			if(n==b){
				System.out.println("palindrome");
			}
			else{
				System.out.println("not palindrome");
			}
			
		
		
        
	

}
}