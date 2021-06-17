Feature: create Quotes


@RegTest
Scenario: create new Quotes 
Given Navigate to create quotes Page
When Create Quotes with subject,orgName,productName,productQty
|CucumberFrame4|coforgeTech611|Bangalore|chennai|laptop19943128|10|
Then verify the Quotes "CucumberFrame4" Is created Succesfully
