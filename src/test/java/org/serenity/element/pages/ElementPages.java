package org.serenity.element.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://google.com")
public class ElementPages extends PageObject {

	public WebElement getElementText(String element) {

		return getDriver().findElement(getObject(element));
	}

	private By getObject(String element) {
		By by = null;
		try {
			if (element.startsWith("css=")) {
				element = element.substring(4);
				by = By.cssSelector(element);
			}
			return by;
		} catch (Exception e) {
			System.out.println("Canot find element: " + element);
		}
		return null;
	}

}
