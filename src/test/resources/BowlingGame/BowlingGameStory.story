Narrative:
As a player
I want to play the bowling game
So that I can have a final score and some fun

Scenario: Roll 0
Given a game
When i roll 0 pin
Then the score should be 0

Scenario: Roll 1
Given a game
When i roll 1 pin
Then the score should be 1

Scenario: Roll spare followed by 2 pins
Given a game
When i roll spare
And i roll 2 pin
Then the score should be 14

Scenario: Roll strike followed by 5 and 2 pins
Given a game
When i roll strike
And i roll 5 pin
And i roll 2 pin
Then the score should be 24

Scenario: Roll all strikes
Given a game
When i roll all strikes
Then the score should be 300