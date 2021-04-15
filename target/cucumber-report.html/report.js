$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Choonz.feature");
formatter.feature({
  "line": 1,
  "name": "Selenium Test",
  "description": "",
  "id": "selenium-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#CHOON-2"
    }
  ],
  "line": 3,
  "name": "Navigates to Albums page",
  "description": "",
  "id": "selenium-test;navigates-to-albums-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I access Albums page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Album Page will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 255383000,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Albums_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.album_Page_will_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#CHOON-3"
    }
  ],
  "line": 8,
  "name": "Creates a new Playlist",
  "description": "",
  "id": "selenium-test;creates-a-new-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I am signed in as a user",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I access Playlist page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I create a new playlist",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Playlist information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 318000,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_a_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Playlist_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_create_a_new_playlist()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.playlist_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#CHOON-4"
    }
  ],
  "line": 15,
  "name": "Sign up",
  "description": "",
  "id": "selenium-test;sign-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I access Login page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click the link to signup",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter valid signup credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 307200,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_the_link_to_signup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_enter_valid_signup_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_the_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 21,
      "value": "#CHOON-5"
    }
  ],
  "line": 22,
  "name": "Read Playlist as a User",
  "description": "",
  "id": "selenium-test;read-playlist-as-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I am signed in as a User",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I access Home page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Playlist information displayed on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 291900,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:23)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_a_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.playlist_information_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 27,
      "value": "#CHOON-6"
    }
  ],
  "line": 28,
  "name": "Update Playlist as a User",
  "description": "",
  "id": "selenium-test;update-playlist-as-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I am signed in as a User",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I access Playlists page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I click Edit Playlist button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on Update button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I access Home page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Updated Playlist is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 297800,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_a_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Playlists_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_Edit_Playlist_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_on_Update_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.updated_Playlist_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 36,
      "value": "#CHOON-7"
    }
  ],
  "line": 37,
  "name": "Delete Playlist as a User",
  "description": "",
  "id": "selenium-test;delete-playlist-as-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I am signed in as a User",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I access Playlists page",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I click Delete Playlist button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on Delete button",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I access Home page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Playlist is removed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 381500,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_a_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Playlists_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_Delete_Playlist_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_on_Delete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.playlist_is_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 45,
      "value": "#CHOON-8"
    }
  ],
  "line": 46,
  "name": "Navigates to Albums page",
  "description": "",
  "id": "selenium-test;navigates-to-albums-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I access Albums page",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Tracks will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 357400,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:47)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Albums_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.tracks_will_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 51,
      "value": "#CHOON-9"
    }
  ],
  "line": 52,
  "name": "Navigation between pages",
  "description": "",
  "id": "selenium-test;navigation-between-pages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 53,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "I am signed as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I access Album Page",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "I click on Artist Name",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Artist Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 328100,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:53)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Album_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_on_Artist_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.artist_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 58,
      "value": "#CHOON-10"
    }
  ],
  "line": 59,
  "name": "Navigate from Artist page to Albums page",
  "description": "",
  "id": "selenium-test;navigate-from-artist-page-to-albums-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 60,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "I am signed as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I access Artist page",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I can access back to Album page",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 349600,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:60)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Artist_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_back_to_Album_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 64,
      "value": "#CHOON-11"
    }
  ],
  "line": 65,
  "name": "Navigate as a Guest",
  "description": "",
  "id": "selenium-test;navigate-as-a-guest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "I access Home page",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "I click on search",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 441700,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:66)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_on_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.results_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 70,
      "value": "#CHOON-12"
    }
  ],
  "line": 71,
  "name": "Search function",
  "description": "",
  "id": "selenium-test;search-function",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 72,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "I access Home page",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "I enter values in searchbar",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "I click the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "values are returned",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 318000,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:72)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_enter_values_in_searchbar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.values_are_returned()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 77,
      "value": "#CHOON-13"
    }
  ],
  "line": 78,
  "name": "Navigates to Tracks page",
  "description": "",
  "id": "selenium-test;navigates-to-tracks-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 79,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "I am signed as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "I access Tracks page",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "Tracks Page will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 303900,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:79)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Tracks_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.tracks_Page_will_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 83,
      "value": "#CHOON-25"
    }
  ],
  "line": 84,
  "name": "Creates a new Track",
  "description": "",
  "id": "selenium-test;creates-a-new-track",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I access Tracks page",
  "keyword": "When "
});
formatter.step({
  "line": 88,
  "name": "I create a new Track",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Tracks information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 282400,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:85)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Tracks_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_create_a_new_Track()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.tracks_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 92,
      "value": "#CHOON-27"
    }
  ],
  "line": 93,
  "name": "Updates a Track",
  "description": "",
  "id": "selenium-test;updates-a-track",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 94,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 95,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "I access Tracks page",
  "keyword": "When "
});
formatter.step({
  "line": 97,
  "name": "I update a  Track",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "Tracks information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 326100,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:94)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Tracks_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_update_a_Track()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.tracks_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 100,
      "value": "#CHOON-28"
    }
  ],
  "line": 101,
  "name": "Deletes a Track",
  "description": "",
  "id": "selenium-test;deletes-a-track",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 102,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 103,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "I access Tracks page",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "I delete a  Track",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "Tracks information is removed",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 296000,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:102)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Tracks_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_delete_a_Track()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.tracks_information_is_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 108,
      "value": "#CHOON-29"
    }
  ],
  "line": 109,
  "name": "Creates a new Artist",
  "description": "",
  "id": "selenium-test;creates-a-new-artist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 110,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 111,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "I access Artist page",
  "keyword": "When "
});
formatter.step({
  "line": 113,
  "name": "I create a new Artist",
  "keyword": "Then "
});
formatter.step({
  "line": 114,
  "name": "Artist information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 1842100,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:110)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Artist_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_create_a_new_Artist()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.artist_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 116,
      "value": "#CHOON-31"
    }
  ],
  "line": 117,
  "name": "Updates an Artist",
  "description": "",
  "id": "selenium-test;updates-an-artist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 118,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 119,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I access Artist page",
  "keyword": "When "
});
formatter.step({
  "line": 121,
  "name": "I update the Artist",
  "keyword": "Then "
});
formatter.step({
  "line": 122,
  "name": "Artist information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 343100,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:118)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Artist_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_update_the_Artist()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.artist_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 124,
      "value": "#CHOON-32"
    }
  ],
  "line": 125,
  "name": "Deletes an Artist",
  "description": "",
  "id": "selenium-test;deletes-an-artist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 126,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 127,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "I access Artist page",
  "keyword": "When "
});
formatter.step({
  "line": 129,
  "name": "I delete the Artist",
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "Artist information is removed from the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 281800,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:126)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Artist_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_delete_the_Artist()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.artist_information_is_removed_from_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 132,
      "value": "#CHOON-35"
    }
  ],
  "line": 133,
  "name": "Update an Album",
  "description": "",
  "id": "selenium-test;update-an-album",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 134,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 135,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "I access Album page",
  "keyword": "When "
});
formatter.step({
  "line": 137,
  "name": "I update the Album",
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "Album information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 343000,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:134)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Album_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_update_the_Album()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.album_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 140,
      "value": "#CHOON-36"
    }
  ],
  "line": 141,
  "name": "Delete an Album",
  "description": "",
  "id": "selenium-test;delete-an-album",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 142,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 143,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 144,
  "name": "I access Album page",
  "keyword": "When "
});
formatter.step({
  "line": 145,
  "name": "I delete the Album",
  "keyword": "Then "
});
formatter.step({
  "line": 146,
  "name": "Album information is removed",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 402100,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:142)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Album_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_delete_the_Album()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.album_information_is_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 148,
      "value": "#CHOON-35"
    }
  ],
  "line": 149,
  "name": "Update an Genres",
  "description": "",
  "id": "selenium-test;update-an-genres",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 150,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 151,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 152,
  "name": "I access Genres page",
  "keyword": "When "
});
formatter.step({
  "line": 153,
  "name": "I update the Genres",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "Genres information is displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 301600,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:150)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Genres_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_update_the_Genres()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.genres_information_is_displayed_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 156,
      "value": "#CHOON-36"
    }
  ],
  "line": 157,
  "name": "Delete an Album",
  "description": "",
  "id": "selenium-test;delete-an-album",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 158,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 159,
  "name": "I am signed in as an Admin",
  "keyword": "And "
});
formatter.step({
  "line": 160,
  "name": "I access Album page",
  "keyword": "When "
});
formatter.step({
  "line": 161,
  "name": "I delete the Album",
  "keyword": "Then "
});
formatter.step({
  "line": 162,
  "name": "Album information is removed",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 412900,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:158)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_am_signed_in_as_an_Admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Album_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_delete_the_Album()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.album_information_is_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 163,
  "name": "Navigates to Artists page",
  "description": "",
  "id": "selenium-test;navigates-to-artists-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 164,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 165,
  "name": "I access Artists page",
  "keyword": "When "
});
formatter.step({
  "line": 166,
  "name": "Artists Page will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 469200,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:164)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Artists_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.artists_Page_will_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 168,
      "value": "#CHOON-42"
    }
  ],
  "line": 169,
  "name": "",
  "description": "",
  "id": "selenium-test;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 170,
  "name": "I can access Choonz",
  "keyword": "Given "
});
formatter.step({
  "line": 171,
  "name": "I access Admin page",
  "keyword": "When "
});
formatter.step({
  "line": 172,
  "name": "I create the track",
  "keyword": "Then "
});
formatter.step({
  "line": 173,
  "name": "I access track page",
  "keyword": "When "
});
formatter.step({
  "line": 174,
  "name": "Track page will be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 175,
  "name": "Track information is displayed on screen",
  "keyword": "And "
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_can_access_Choonz()"
});
formatter.result({
  "duration": 390600,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.manage()\" because \"qa.choonz.steps.ChoonzSeleniumTests.driver\" is null\r\n\tat qa.choonz.steps.ChoonzSeleniumTests.i_can_access_Choonz(ChoonzSeleniumTests.java:82)\r\n\tat ✽.Given I can access Choonz(Choonz.feature:170)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_Admin_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_create_the_track()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.i_access_track_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.track_page_will_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChoonzSeleniumTests.track_information_is_displayed_on_screen()"
});
formatter.result({
  "status": "skipped"
});
});