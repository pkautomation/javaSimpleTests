# javaSimpleTests
Sample of tests in Java


# Answers for question in recruiting test
1) Program is printing "notin our neighbourhood"
2) See src/test/java/StreetsTest.java file
3) Commands:
git commit -a -m "message"
git push
4) See src/main/java/simple/RegexExtract.java file
5) Not done
6) This must be done based on the requirements which I do not have,
but just for sake of exercise:

Test ID 00001_MOUSE

Test Description: verify left mouse click

Precondition:
1) Mouse plugged in to the PC, user is on the desktop of Windows OS

Steps:

1) Left click mouse.

Expected result: mouse pointer is ticking

--------------
Test ID 00002_MOUSE

Test Description: verify right mouse click

Precondition:
1) mouse plugged in to the PC, user is on the desktop of Windows OS
Steps:

1)Right click mouse. 

Expected result: mouse pointer is ticking. Sub menu opens on the screen next to the pointer

----------------------
Test ID 00003_MOUSE

Test Description: Check if lifted mouse is moving the pointer

Precondition:
1) mouse plugged in to the PC, user is on the desktop of Windows OS. Mouse is lifted 50cm above the surface

Steps:

1)Move the mouse 50cm left while holding it 50cm above the surface.

Expected result: Nothing happens. Pointer remains in the same position

-------------------------

Test ID 00004_MOUSE

Test Description: Check if side special action mouse button is not supported out of the box

Precondition:
1) mouse plugged in to the PC, user is on the desktop of Windows OS.

Steps:

1) Click the special action button on the mouse.

2) Expected Result: no action

--------------------------

7) 
- Left click mouse every second for 10 years - endurance testing
- Hold left mouse button with increasing force until it breaks - stress testing
- Show the mouse to the user ask him to give opinion if its as good as expected (for instance - mouse for left handed people) - UAT/Usability/Accessibility testing

8) Not done
9) Re-testing is for defect fix validation, regression testing is checking if there are no issues with existing implementation
10) I am not familiar with that. But perhaps: Amount of bugs vs features delived, customer satisfaction or lead time to deliver bugfixes
11) Verification of defect is done after fix is implemented by QA. Validation is done by the business user like Product Owner on UAT.