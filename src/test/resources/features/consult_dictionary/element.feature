Feature: General Steps

  Scenario: Element text in English
   Given the page "https://cucumber.io/" is visited
   Then assert that the text "css=h1[title='Cucumber']" element is "Simple, human collaboration"
   And assert that the text "css=h1[title='Cucumber']" element is not "human collaboration"
   And assert that the text "css=h1[title='Cucumber']" element has "collaboration"
   And assert that the text "css=h1[title='Cucumber']" element does not have "Simples"