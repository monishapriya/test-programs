import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		System.out.println("enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
		 rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}

	}

}
