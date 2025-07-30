package pack1;

import org.testng.annotations.Test;

public class Contact_Test {
	
	@Test
	public void createContact_Test()
	{
		System.out.println("Execute createContact_Test");
		
		String name=System.getProperty("name", "Jack_Sharma");
		String phone=System.getProperty("phone", "999999999");
		
		System.out.println("Name:- "+name);
		System.out.println("Phone number:- "+phone);
	}
	
	@Test
	public void modifyContact_Test()
	{
		System.out.println("Execute modifyContact_Test");
	}
	
	@Test
	public void deleteContact_Test()
	{
		System.out.println("Contact deleted");
	}

}
