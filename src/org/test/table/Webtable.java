package org.test.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Maven.Excel\\WebTable\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://toolsqa.com/automation-practice-table/");
    List<WebElement> tRows = driver.findElements(By.tagName("tr"));
    for (int i = 0; i < tRows.size(); i++) {
	List<WebElement> tData = tRows.get(i).findElements(By.tagName("td"));
	for (int j= 0; j < tData.size(); j++) {
		String name = tData.get(j).getText();
		System.out.println(name);
		if (name.equals("Mecca")) {
			tData.get(4).click();
		}
	}
	}
    }
}
