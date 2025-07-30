package pack2;

import org.testng.annotations.Test;

public class Org_Test {

	@Test
	public void createOrg_Test()
	{
		String orgName=System.getProperty("orgName");
		String orgId=System.getProperty("orgId");
		
		System.out.println("Execute createOrg_Test");
		System.out.println("Org Name:- "+orgName);
		System.out.println("Org ID:- "+orgId);
	}
	
	@Test
	public void modifyOrg_Test()
	{
		System.out.println("Execute modifyOrg_Test");
	}
}
