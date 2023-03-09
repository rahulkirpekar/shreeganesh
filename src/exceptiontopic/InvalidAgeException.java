package exceptiontopic;

// User Defined Exception---Unchecked -- Custom Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String errorMsg) 
	{
		super(errorMsg);
	}
}
