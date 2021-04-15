Feature: Selenium Test

############################
#SIGN UP SELENIUM TEST (HAPPENS BEFORE REST OF CRUD)
############################

#CHOON-4
Scenario: Sign up 
Given I can access Choonz
When I access Login page 
And I access the Create page
Then Enter create accounts details
When I access Login page 
And Enter login account details
Then I am signed in 

###################################
#ALL THE READ AND GENERAL WEBSITE USE SELENIUM TESTS
###################################

#CHOON-2
Scenario: Navigates to Albums page
Given I can access Choonz
When I access Albums page 
Then Album Page will be displayed

#CHOON-13
Scenario: Navigates to Tracks page
Given I can access Choonz
When I access Tracks page 
Then Tracks Page will be displayed

#CHOON-
Scenario: Navigates to Artists page
Given I can access Choonz
When I access Artists page 
Then Artists Page will be displayed

############################
#CREATE SELENIUM TESTS
############################

#CHOON-29
Scenario: Creates a new Artist
Given I can access Choonz
And I am signed in as an Admin 
When I access Admin page
Then I create a new Artist
When I access Albums page
Then Artist information will be displayed

#CHOON-25
Scenario: Creates a new Album
Given I can access Choonz
And I am signed in as an Admin 
When I access Admin page
Then I create a new Album
When I access Albums page 
Then Album information will be displayed


#CHOON-25
Scenario: Creates a new Track
Given I can access Choonz
And I am signed in as an Admin 
When I access Admin page
Then I create a new Track
When I access Tracks page 
Then Tracks information will be displayed

############################
#UPDATE SELENIUM TESTS
############################

#CHOON-27
Scenario: Updates a Track
Given I can access Choonz
And I am signed in as an Admin 
When I access Tracks page
Then I update a Track
And Updated Tracks information will be displayed

#CHOON-31
Scenario: Updates an Album
Given I can access Choonz
And I am signed in as an Admin 
When I access Albums page
Then I update the Album
And Updated Album information will be displayed

#CHOON-31
Scenario: Updates an Artist
Given I can access Choonz
And I am signed in as an Admin 
When I access Artists page
Then I update the Artist
And Updated Artist information will be displayed

############################
#DELETE SELENIUM TESTS
############################

#CHOON-28
Scenario: Deletes a Track
Given I can access Choonz
And I am signed in as an Admin 
When I access Tracks page
Then I delete a Track
And Tracks information is removed 

#CHOON-36
Scenario: Delete an Album
Given I can access Choonz
And I am signed in as an Admin 
When I access Albums page 
Then I delete the Album
And Album information is removed

#CHOON-32
Scenario: Deletes an Artist
Given I can access Choonz
And I am signed in as an Admin 
When I access Artists page
Then I delete the Artist
And Artist information is removed