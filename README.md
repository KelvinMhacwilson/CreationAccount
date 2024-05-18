Algorithm:
1. Initialize an array or list to hold the days of creation.
2. For each day from 1 to 7:
   a. Assign the corresponding day of creation.
   b. Display the activities/events of that day.
   c. Prompt the user if they want to know the verse for a specific event.
   - If yes, display the verse for that event.
   - If no, continue.
3. End.

Pseudocode:
CREATE array daysOfCreation
daysOfCreation[1] = "Day 1: God created light"
daysOfCreation[2] = "Day 2: God separated the waters"
daysOfCreation[3] = "Day 3: God gathered the waters, created land, and vegetation"
daysOfCreation[4] = "Day 4: God created the sun, moon, and stars"
daysOfCreation[5] = "Day 5: God created sea creatures and birds"
daysOfCreation[6] = "Day 6: God created land animals and humans"
daysOfCreation[7] = "Day 7: God rested"

FOR each day FROM 1 TO 7 DO
DISPLAY daysOfCreation[day]
PROMPT user if they want to know the verse for a specific event
IF user_input is 'yes' THEN
DISPLAY verse for the event
END IF
END FOR

