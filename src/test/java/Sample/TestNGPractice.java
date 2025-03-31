package Sample;

import org.testng.annotations.Test;

public class TestNGPractice 
{
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("User created");
	}
	
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	
	@Test(priority=-1)
	public void deletedUser()
	{
		System.out.println("User deleted");
	}
	
	@Test
	public void addedUser()
	{
		System.out.println("User added");
	}
	
}
