package moni;



public class smallbig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={23,45,87,11,65,9,17};
		int smallest=numbers[0];
		int biggest=numbers[0];
		for(int i=1;i<7;i++)
		{
			if(numbers[i]>biggest)
			{
				biggest=numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
			}
		}
		System.out.println("smallest num is: "+smallest);
		System.out.println("biggest num is :"+biggest);

	}




	}


