
public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=0;
		int number=153;
		int n=number;

while(n>0){
	int rem=n%10;
	 mul=mul+rem*rem*rem;
	 n=n/10;
}
if(mul==number)
{
	System.out.println("amstrong");
}
else{
	System.out.println("not amstrong");
}
	}

}
