package org.serenity.element.steps;

import org.serenity.element.steps.serenity.ElementSteps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ElementDefinition {
	@Steps
	ElementSteps elementStep;

	@Given("^the page \"([^\"]*)\" is visited$")
	public void the_page_is_visited(String linkPage) throws Throwable {
		elementStep.openPageVisit(linkPage);
	}

	@Then("^assert that the text \"([^\"]*)\" element is \"([^\"]*)\"$")
	public void assert_that_the_text_element_is(String element,
			String elementText) throws Throwable {
		elementStep.assertTextIs(element, elementText);
	}

	@Then("^assert that the text \"([^\"]*)\" element is not \"([^\"]*)\"$")
	public void assert_that_the_text_element_is_not(String element,
			String elementText) throws Throwable {
		elementStep.assertTextNot(element, elementText);
	}

	@Then("^assert that the text \"([^\"]*)\" element has \"([^\"]*)\"$")
	public void assert_that_the_text_element_has(String element,
			String elementText) throws Throwable {
		elementStep.assertTextHas(element, elementText);
	}

	@Then("^assert that the text \"([^\"]*)\" element does not have \"([^\"]*)\"$")
	public void assert_that_the_text_element_does_not_have(String element,
			String elementText) throws Throwable {
		elementStep.assertTextNotHave(element, elementText);
	}
}
