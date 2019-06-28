package information;

import java.util.Date;

public class Driver {

	public static void main(String[] args) 
	{
		Person test1 = new Person("John", "Doe", "123 ABC AVE, SAINT PAUL, MN, 55103","1/13/2001", 18);
		System.out.println(test1.toString());
		Person test2 = new Person("Jane", "Doe", "123 ABC AVE, SAINT PAUL, MN, 55103","93/11/2000", 19);
		System.out.println(test2.toString());
		Date x = new Date();
		Student test = new Student("Jane", "Doe", "123 ABC AVE, SAINT PAUL, MN, 55103","1/16/2001", 18, "Freshmen",x,"Chess Club");
		test.setAct("FootBall", "Chess Club", "Anime Club");
		System.out.println(test.toString());

	}

}
