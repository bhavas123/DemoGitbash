package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test1
{
	@Test(priority=4, invocationCount=2)
	public void createUser()
	{
		System.out.println("User created");
	}
	
	@Test(priority=1, dependsOnMethods= {"deleteUser","addUser"})
	public void createUser1()
	{
		System.out.println("User1 created");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
	
	@Test(priority=-1)
	public void addUser()
	{
		System.out.println("User added");
	}
	
	@Test(priority=3, enabled=false)
	public void removeUser()
	{
		System.out.println("User removed");
	}
	
	@Test(invocationCount=0)
	public void removeUser1()
	{
		System.out.println("User1 removed");
	}
	
	@Ignore
	@Test
	public void removeUser2()
	{
		System.out.println("User2 removed");
	}
}
