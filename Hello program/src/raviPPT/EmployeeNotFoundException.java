package raviPPT;

import javax.management.RuntimeErrorException;

public class EmployeeNotFoundException extends RuntimeException 
{
	public EmployeeNotFoundException(String message)
	{
		super(message);
	}
}
