package information;
import java.util.*;
public class Student extends Person
{
	private String Year;
	private Date enroll;// might change to string. depends on how testing goes
	private String Act;
	
	
	
	Student(String First, String Last, String Address, String DOB, int Age, String Year, Date date, String Act) 
	{
		super(First, Last, Address, DOB, Age);
		
		this.Year = Year;
		this.enroll = date;
		this.Act = Act;
		
	}
	
	public void setAct(String Act1,String Act2, String Act3, String Act4) 
	{
		String x = " ";
		this.Act =String.format(Act1 +"%n%11s"+ Act2 +"%n%11s"+ Act3 +"%n%11s"+ Act4,x,x,x);
	}
	
	public void setAct(String Act1,String Act2,String Act3) 
	{
		
		String x = " ";
		this.Act =String.format(Act1 +"%n%11s"+ Act2 +"%n%11s"+ Act3,x,x ); 
	}
	public void setAct(String Act1,String Act2) 
	{
		String x = " ";
		this.Act = String.format(Act1+"%n%11s"+Act2, x,x) ;
	}
	public void setAct(String Act1) 
	{
		this.Act= Act1;
	}
	
	public String getAct() 
	{
		return Act;
	}
	
	public void setYear(String x) 
	{
		Year = x;
	}
	public String getYear() 
	{
		return Year;
	}
	
	public String toString() 
	{
		return "*****Student Information******\n"+super.toString() + "\nYear: "+ Year+"\nEnrollment Date: "+ enroll+ "\nActivites: "+ Act;
	}
	
		
}
