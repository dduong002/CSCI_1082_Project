package information;
import java.util.*;
public class Faculty extends Person 
{
	private String Subject;
	private int Room;
	private Date Employ;
	
	

	Faculty(String First, String Last, String Address, String DOB, int Age,String Subject, int Room) 
	{
		super(First, Last, Address, DOB, Age);
		Date x = new Date();
		this.Subject = Subject;
		this.Room = Room;
		this.Employ= x;
		
	}
	
	public void setROOM(int x) 
	{
		this.Room = x;
	}
	
	public int getROOM() 
	{
		return Room;
	}
	
	public void setSub(String x) 
	{
		Subject = x ;
	}
	public String getSub() 
	{
		return Subject;
	}
	public void setdate(Date x) 
	{
		Employ = x;
	}
	
	public Date getdate() 
	{
		return Employ;
	}
	
	public String toString() 
	{
		return "*****Personnel Information******\n"+super.toString() + "\nSuject: " + Subject+
				"\nRoom Number: "+ Room + "\nEmployment Date: "+Employ;
	}

		

	public static void main(String[] args) 
	{
		

	}

}
