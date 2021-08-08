# Raid Quest: Demo Tut
**`Quest giver: Snow Squirrel`**
>I have exactly what you need for figuring out this new tech.  A tutorial!  Everybody loves tutorials.  It won't be a long one so pay close attention.

## Objectives required to be completed
This tutorial is hopefully enough to get started with some basic understanding of Git/GitHub/intelliJ

### Objective 1 - The Fork
No doubt the page currently being viewed is not our own repo so we must begin by getting this into our own account.

- Click on the `Fork` button at the top right of the screen
- Select where to fork the repo

### Objective 2 - The Clone
Now that we have our own version of this repo we can clone ourselves down into IntelliJ for some work.

- Click the green `Code` button near the upper middle-ish area of the screen
- Highlight the URL shown or click the clipboard to copy it
- On IntelliJ select `Get from VCS` on the main screen 
- Paste the URL
- Double check for correct save location directory
- Hit `Clone` button at bottom right of window

Once we have this repo inside IntelliJ we have multiple different options for a workflow.  

There is a menu option for `Git`.  This allows us to make `commits` and `pushes` back to GitHub with our code.

### Objective 3 - The Problem
We want to write some code that will determine if we receive a parking ticket. The rules are as follows.

- Determine if the person has a parking permit
- With a parking permit a person may park in a lot anytime, except 1:00 a.m. to 3:00 a.m. as that is when the lot is cleaned.
- Without a parking permit a person may only park on the lot after 5:00 p.m. and before 7:00 a.m., but still not between 1:00 a.m. and 3:00 a.m.
- Get the current time from the user and permit status and tell them if they will receive a ticket or not
