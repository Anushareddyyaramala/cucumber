package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before(order=1)
	public void beforehook()//order is used to control the flow of execution and @before gives priority to lower first.
	{
	System.out.println("before hook");
	}
	@After(order=1)//@After gives prior to higher numbers which we given as order.,it means it will print first highest order
	public void afterhook() {
	 System.out.println("after hook");
	}
	@Before
	public void setuphook()
	{
	 System.out.println("setup hook");
	}
	@After(order=3)
	public void sethook() {
	 System.out.println("set hook");
	}
	@Before("@smoketest")
	public void smokehook()
	{
	 System.out.println("smoke hook");
	}

	@After("@smoketest")
	public void aftersmokehook() {
	 System.out.println("afterhook");
	}

}
