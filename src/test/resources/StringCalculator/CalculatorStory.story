Narrative:
Another Kata for BDD with TDD

Scenario: calculator starts with number 0
Given a calculator
Then it displays 0


Scenario: calculator receives number
Given a calculator
When introduce <number>
Then it displays <result>

Examples:
|number|result|
|0|0|
|1|1|
|5|5|


Scenario: calculator receives number after another overwriting the old one
Given a calculator
When introduce <number>
When overwrite with <number2>
Then it displays <result>

Examples:
|number|number2|result
|0|0|0|
|1|2|2|
|2|1|1|


Scenario: calculator adds 2 numbers
Given a calculator
When introduce <number>
And add <sum>
Then it displays <result>

Examples:
|number|sum|result|
|0|0|0|
|1|2|3|
|5|5|10|
|1000|-1|999|


Scenario: calculator substract 2 numbers
Given a calculator
When introduce <number>
And sustract <sustraction>
Then it displays <result>

Examples:
|number|sustraction|result|
|0|0|0|
|1|2|-1|
|5|5|0|
|1000|-1|1001|


Scenario: combine sums and substractions
Given a calculator
When introduce <number>
And add <sum>
And sustract <sustraction>
Then it displays <result>

Examples:
|number|sum|sustraction|result|
|0|0|0|0|
|1|2|3|0|
|5|5|3|7|
|1000|1000|500|1500|