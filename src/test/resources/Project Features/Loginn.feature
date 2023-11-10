Feature: Login feature
@tag1
Scenario: User can login

Given Launch <"URL">
Then  Click login
Then  User can login



@tag2
Scenario: Verify user in landed in the cart page

Given Launch <"URL">
Then Click Cart link
Then Verify user in landed in the cart page

@tag3
Scenario: Verify user can click Laptop link

Given Launch <"URL">
Then Click Laptop link


