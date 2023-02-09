package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number, and I will find all the prime numbers until that ");
		int number=in.nextInt();
		int[] primeArray=new int[number+1];
		int index=0;
		int multiplier=2;
		while (index<=(number))
		{
			primeArray[index]=1;
			index++;
		}
		primeArray[0]=0;
		primeArray[1]=0;
		for(index=2;index<=(number);index++)
		{
			if (primeArray[index]==1)
					{
				for(multiplier=2;index*multiplier<=(number);multiplier++)
				{
					primeArray[index*multiplier]=0;
				}
					}
		}
		index=0;
		
		for(index=0;index<=(number);index++)
		{
			if (primeArray[index]==1)
			{
			System.out.print(index + " ");
			}
		}
		
		

	}

}
