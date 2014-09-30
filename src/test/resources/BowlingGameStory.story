Meta:

Narrative:
As a player
I want to play the bowling game
So that I can have a final score and some fun

Scenario: roll 1 pin
Given a game
When i roll <pins> pin
Then the score should be <score>

Examples:
|pins|score|
|0|0|
|1|1|

