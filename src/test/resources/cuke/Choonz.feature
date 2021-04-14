Feature: Selenium Test
#CHOON-2
Scenario: Navigates to Albums page
Given I can access Choonz
When I access Albums page 
Then Album Page will be displayed
#CHOON-3
Scenario: Creates a new Playlist
Given I can access Choonz
And I am signed in as a user 
When I access Playlist page
Then I create a new playlist
And Playlist information is displayed on the screen
#CHOON-4
Scenario: Sign up 
Given I can access Choonz
When I access Login page 
And I click the link to signup  
Then I enter valid signup credentials
And I click the Submit button
#CHOON-5
Scenario: Read Playlist as a User
Given I can access Choonz
And I am signed in as a User
When I access Home page
Then Playlist information displayed on the screen
#CHOON-6
Scenario: Update Playlist as a User
Given I can access Choonz
And I am signed in as a User
When I access Playlists page
And I click Edit Playlist button
When I click on Update button
Then I access Home page
And Updated Playlist is displayed 
#CHOON-7 
Scenario: Delete Playlist as a User
Given I can access Choonz
And I am signed in as a User
When I access Playlists page
And I click Delete Playlist button
When I click on Delete button
Then I access Home page
And Playlist is removed 
#CHOON-8
Scenario: Navigates to Albums page
Given I can access Choonz
And I am signed in as an Admin
When I access Albums page 
Then Tracks will be displayed
#CHOON-9
Scenario: Navigation between pages
Given I can access Choonz
And I am signed as an Admin
When I access Album Page
And I click on Artist Name
Then Artist Page is displayed
#CHOON-10
Scenario: Navigate from Artist page to Albums page
Given I can access Choonz
And I am signed as an Admin
When I access Artist page
Then I can access back to Album page
#CHOON-11
Scenario: Navigate as a Guest
Given I can access Choonz
When I access Home page 
And I click on search
Then Results should be displayed
#CHOON-12
Scenario: Search function 
Given I can access Choonz
When I access Home page 
And I enter values in searchbar 
Then I click the search button
And values are returned 
#CHOON-13
Scenario: Navigates to Tracks page
Given I can access Choonz
And I am signed as an Admin
When I access Tracks page 
Then Tracks Page will be displayed
#CHOON-25
Scenario: Creates a new Track
Given I can access Choonz
And I am signed in as an Admin 
When I access Tracks page
Then I create a new Track
And Tracks information is displayed on the screen


#CHOON-27
Scenario: Updates a Track
Given I can access Choonz
And I am signed in as an Admin 
When I access Tracks page
Then I update a  Track
And Tracks information is displayed on the screen

#CHOON-28
Scenario: Deletes a Track
Given I can access Choonz
And I am signed in as an Admin 
When I access Tracks page
Then I delete a  Track
And Tracks information is removed 

#CHOON-29
Scenario: Creates a new Artist
Given I can access Choonz
And I am signed in as an Admin 
When I access Artist page
Then I create a new Artist
And Artist information is displayed on the screen

#CHOON-31
Scenario: Updates an Artist
Given I can access Choonz
And I am signed in as an Admin 
When I access Artist page
Then I update the Artist
And Artist information is displayed on the screen

#CHOON-32
Scenario: Deletes an Artist
Given I can access Choonz
And I am signed in as an Admin 
When I access Artist page
Then I delete the Artist
And Artist information is removed from the screen

#CHOON-35
Scenario: Update an Album
Given I can access Choonz
And I am signed in as an Admin 
When I access Album page 
Then I update the Album
And Album information is displayed on the screen

#CHOON-36
Scenario: Delete an Album
Given I can access Choonz
And I am signed in as an Admin 
When I access Album page 
Then I delete the Album
And Album information is removed

#CHOON-35
Scenario: Update an Genres
Given I can access Choonz
And I am signed in as an Admin 
When I access Genres page 
Then I update the Genres
And Genres information is displayed on the screen

#CHOON-36
Scenario: Delete an Album
Given I can access Choonz
And I am signed in as an Admin 
When I access Album page 
Then I delete the Album
And Album information is removed
Scenario: Navigates to Artists page
Given I can access Choonz
When I access Artists page 
Then Artists Page will be displayed

#CHOON-42
Scenario:
Given I can access Choonz 
When I access Admin page 
Then I create the track
When I access track page
Then Track page will be displayed
And Track information is displayed on screen