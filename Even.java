package program;

public class Even 
{

	public static void main(String[] args)
	{
		int sum=0,i;
		for(i=20;i<=60;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("the sum of number between 20 and 60 is"+sum);

	}

}
