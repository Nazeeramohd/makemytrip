package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase.TestBase;

public class Flightpage extends TestBase {

	//@FindBy(xpath ="//li[@class='selected']")
	//WebElement RoundTrip;
	
	//@FindBy(xpath= "//a[contains(@class,'SearchBtn']"));
	//WebElement Search;

	
	//public Flightpage() {
	//PageFactory.initElements(driver,this);
	//}
	
	//public String Flightselection() {
	//	return driver.getTitle();
	//}
	
	public Homepage selection() {
		//RoundTrip.click();
	driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).click();
	//	Search.click();	
		return new Homepage();
	}
	
	public void country() {
		Select drpCountry = new Select(driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open' and @value=''])")));
		drpCountry.selectByVisibleText("CCJ, Calicut International Airport India");

	}
}

	
	/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//driver.findElement(By.linkText("Flights")).click();
WebElement button1  =driver.findElement(By.xpath("//li[@class='selected']"));
button1.click();
if(button1.isSelected()) {
	System.out.println("radio button is clicked");
}
	else {
		System.out.println("not selected");
}

driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).click();
}
}
	//WebElement button1 =driver.findElement(By.xpath("//li[contains(@class,'selected')]"));
	
		// button1.click();
		// System.out.println("round trip -  "+button1.isSelected());	
 driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).submit();
	 }
}*/
