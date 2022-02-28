# Prototypes & Testing 
Following testing methods are used for the testing purposes. 
## Unit testing : 
		Tested each different function by themselves and  ensured that all units are working properly. 

	### Outcomes:  
		 Relatively easy and fast, regular testing helps units to be bug free. 

## Integration testing :
		 Combined all units and tested as a whole. Integration of units needs those units to be compatible with each other and produce desired output. 

	### Outcomes : 
		Units once combined might not work as desired. How we combine units is also a bigger factor to determine the effectiveness of the program. 

## System testing:
		 Combined code and GUI together and tested. File paths can be entered in the given text fields and the algorithm starts when the user presses the start button. 

	### Outcomes: 
		GUI needs to be more user friendly, and provide feedback when the scheduling has been done. 

## Performance Testing: 
		Tested the performance of the whole system. We are using System.Nanotime() to calculate how long for the system to produce the output. The outcomes is below 

	### Outcomes: 
		The system took 257000600 nanoseconds or 257.0006 milliseconds.

## Prototypes: 
We tested two different prototypes that were not able to produce the output as desired.
### Simple if-else: 
	 We use this approach to test the feasibility of this approach itself. There 	are overwhelming amounts of conditions to check such as timeslot, courses and priority and soon we figured out this prototype will not. 
### Pattern Matching: 
	In this approach we formed the some pattern using the given two files and tried to match them; however, this approach had limitations of checking the conditions such as graduation year and quarter. 
### Combination of two:  
	We combined the two of our prototypes and formed a new one which compliments the limitations of the both and worked well so far.  

## Problem Encountered:
-	JFileChooser that we tried to implemented to replace JTextField for filepath
hasn’t been working quite well yet so that will be our homework for optimization for the final version.
-	We have encountered duplication problem where students were assigned to multiple
courses.
-	We have encountered a problem where only a few students were assigned to classes.
	Majority of students weren’t assigned to classes.
-	Right now our algorithm counts duplicate as separate coures and classes and their labs also count as separate courses

	We have fixed duplication problems and the majority of unassigned students.
	We will continue to optimize it to make sure the final version will produce the optimal 
	output.


## Short Summary:

We implemented the code to load the CSV files in, and to do an initial sorting and prioritization of the students.
Developed Student and Course classes to simplify the creation of the algorithm, comes with setter and getter methods, and all the information fields required.
The Algorithm was developed in the abstract, with respect to the conditions and logic, and then implemented in code; 
it so far is able to sort and assign students in a right slot according to graduation year, time slot and online or in person.  
GUI interface simply implemented

## Current State of Project:

Working on adding in the algorithm pieces for 3rd priority students
Optimizing the Algorithm
Testing

## Next Steps:

-	Adding file picker system to GUI interface
-	Finish and Optimize Algorithm
-	Improve GUI and provide feedback to the user 
-	Polishing
-	Creating runnable program
-	Adding courses taken conditon to the algortihm.	
-	Adding Python or Visual Basic Experience condition to the algorithm.  


