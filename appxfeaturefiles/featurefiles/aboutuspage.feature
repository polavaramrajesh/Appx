Feature: About_US Page Validate

  @AboutUsFeature
  Scenario: :About us page validation
    Given user open the AppXcelerate website with given URL...BrowserInitialization:browserIntialization
    Then validate the header...HeaderAppx:ValidateionHeaderPage
    When user navigate to the About Us page...AboutUs:validateClickingAboutUsPage
    Then Validate the About Us page content...AboutUs:validateAboutUsPage
    Then validate the Footer...FooterXpath:validateFooterXpath
    Then close the browser...Close:CloseBrowser
