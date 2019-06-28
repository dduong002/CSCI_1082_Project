package information;
import java.util.*;
public class Person 
{
	private String First;
	private String Last;
	private String Address;// mgiht break it down, Street, Address, City.....
	private String DOB;
	private int Age;
	private int IDs;
	public static int count;
	
	
	
	Person (String First, String Last, String Address, String DOB,int Age)
	{
		this.First = First;
		this.Last = Last;
		this.Address = Address;
		this.DOB = DOB;
		this.Age = Age;
		count++;
		IDs = 10000+(count-1)*2;
		
	}
	
	
	public void setFirst(String First) 
	{
		this.First = First;
	}
	
	public String getFirst() 
	{
		return First;
	}
	
	public void setLast(String Last) 
	{
		this.Last = Last;
	}
	public String getLast() 
	{
		return Last;
	}
	
	public void setAddress(String Add) 
	{
		Address = Add;
	}
	
	public String getAddress() 
	{
		return Address;
	}
	
	public void setDOB(String DOB) 
	{
		this.DOB = DOB;
		
	}
	public String getDOB() 
	{
		return DOB;
	}
	
	public void setAge(int Age) 
	{
		this.Age = Age;
	}
	public int getAge() 
	{
		return Age;
	}
	
	public String toString() 
	{
		
		return "First Name: "+ First+ "\nLast Name: "+ Last +
				"\nAddress: "+ Address+ "\nDOB: "+ DOB+ "\nAge: "+ Age+"\nID: "+IDs;
	}
	
}
	
	
