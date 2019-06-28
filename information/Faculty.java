package information;
import java.util.*;
public class Faculty extends Person 
{
	private String Subject;
	private int Room;
	private Date Employ;
	
	

	Faculty(String First, String Last, String Address, String DOB, int Age,String Subject, int Room, Date Date) 
	{
		super(First, Last, Address, DOB, Age);
		this.Subject = Subject;
		this.Room = Room;
		this.Employ= Date;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
