package information;

public class Depository 
{
	private Student [] student = new Student [10];
	private Faculty [] faculty = new Faculty [10];
	
	Depository() 
	{
		
	}
	
	public void addPerson(Student x) 
	{
		for(int i = 0; i<student.length;i++) 
		{
			if(student[i] == null) 
			{
				student[i]=x;
				break;
			}
		}
	}
	
	public void addPerson(Faculty x) 
	{
		for (int i = 0; i<faculty.length;i++)
			if(faculty[i]==null) 
			{
				faculty[i]=x;
				break;
			}
	}
	
	

}
