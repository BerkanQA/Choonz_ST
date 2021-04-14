Feature: Selenium Test

Scenario: Navigates to Albums page
Given I can access Choonz
When I access Albums page 
Then Album Page will be displayed

Scenario: Navigates to Artists page
Given I can access Choonz
When I access Artists page 
Then Artists Page will be displayed

Scenario: Navigates to Playlists page
Given I can access Choonz
When I access Playlists page
Then Artists Page will be displayed

Scenario:
Given I can access Choonz 
When I access Admin page 
Then I create the track
When I access track page
Then Track page will be displayed
And Track information displayed on screen