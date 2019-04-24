package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pages.Flightpage;
import com.qa.pages.Homepage;

public class Fligtspage extends TestBase {
	public Flightpage flightpage;
	public Homepage Homepage;
	
	
	public Fligtspage() {
		super();
		
	}
	@Test
	public void init() {
		 browser_initialization();
		 flightpage = new Flightpage();
	}
	
	@Test
	public void selectcountry() {
		 flightpage.country();	
	}
     @Test
    public void searchbutton() {
    Homepage=flightpage.selection();
    	//return new Homepage;
//return Homepage;
}

}
