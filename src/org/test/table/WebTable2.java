package org.test.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Maven.Excel\\WebTable\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://toolsqa.com/automation-practice-table/");
	    List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	    for (WebElement rows : tRows) 
	    {
		List<WebElement> tData = rows.findElements(By.tagName("td"));
		for (WebElement data : tData) 
		{
			String name = data.getText();
			if (name.equals("Mecca")) {
				data.get(5).click();
				System.out.println(name);
	}
	}
	}
	}
	}
