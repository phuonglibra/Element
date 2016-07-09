package org.serenity.element.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;
import org.serenity.element.pages.ElementPages;

public class ElementSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ElementPages elementPage;

	@Step
	public void openPageVisit(String linkPage) {
		elementPage.open();
		elementPage.openAt(linkPage);
		getDriver().manage().window().maximize();
	}

	@Step
	public void assertTextIs(String element, String elementText) {
		Assert.assertEquals(elementPage.getElementText(element).getText(),
				elementText);
	}

	@Step
	public void assertTextNot(String element, String elementText) {
		Assert.assertNotEquals(elementPage.getElementText(element).getText(),
				elementText);
	}

	@Step
	public void assertTextHas(String element, String elementText) {
		String var = elementPage.getElementText(element).getText();

		if (var.contains(elementText)) {
			System.out.println("Element has " + elementText);
		} else {
			System.out.println("Element not have ");
		}
		System.out.println(elementText);

	}

	@Step
	public void assertTextNotHave(String element, String elementText) {
		String var = elementPage.getElementText(element).getText();

		if (!var.contains(elementText)) {
			System.out.println("Element not have " + elementText);
		} else {
			System.out.println("Element has ");
		}
		System.out.println(elementText);
	}

}
