package com.bridgelabz.customexceptions;
/********************************************************************************************
 * Purpose   :to reusable coustem exceptions
 * @author   :Rahul C H
 * @version  :1.0
 * @date     :14-11-2019
 * @Filename :CoustemException.java
 ***************************** ***************************************************************/
public class CoustemException {	

}
/**
 * class for coustem exception for validate age 
 * @author Rahul C H
 *
 */
@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s)
	{
		super(s);
	}
}
