
public class PrimeRange2To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num=2;num<100;num++)
		{
			int count=0;
			for(int i=2;i<num;i++){
				
			
			if(num%i==0)
			{
				count++;
				break;
			}}
			if(count==0)
			{
				System.out.print(num+",");
			}

	}}}


