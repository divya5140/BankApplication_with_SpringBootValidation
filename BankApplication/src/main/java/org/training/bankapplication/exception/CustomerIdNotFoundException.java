package org.training.bankapplication.exception;

public class CustomerIdNotFoundException extends RuntimeException{
	
public CustomerIdNotFoundException()
{
	super();
}
	
		public CustomerIdNotFoundException(String message)
		{
			super(message);
		}
	}


