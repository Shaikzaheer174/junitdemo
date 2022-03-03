package com.progs;

class bugException extends Exception
{
	public bugException(String message) {
		super(message);
	}
}

public class Program1 
{
	public int solution(String input) throws bugException
	{
		int sum=0;
		for (char c: input.toCharArray())
		{
			if(!(Character.isLetterOrDigit(c)))
				throw new bugException("Invalid character");
			else if(Character.isDigit(c))
				sum=sum+Character.getNumericValue(c);
		}
		return sum;
	}
}
