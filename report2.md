
# Design


## Algorithm:

- The program will start by processing the input CSV files. 
- We will put the data into three arrays: one for CS392 students, one for CS492 students, and one for the courses that need TAs.
- We will create a class called “Student” which will contain a variable to store the name of the course that the student has been assigned to. 
- This class will also contain the rest of the information about each student that is being read from the CSV input file.
- We will also create a class called “Course” which will contain a variable to store the ID of students assigned to that course. 
- This class will also contain the rest of the information about each course that is being read from the CSV input file.
- We will start with the array containing courses that still need TAs. 
- The algorithm will then iterate through the array of courses and assign students according to: 

	> Which courses the student has taken, whether or not the student is available during that time slot,
	  whether or not there is already a CS392 or CS492 student assigned to the course.
	
- Only one 392 and one 492 student will be assigned to each course. If a 492 student is unavailable, then a second 392 student will be assigned.
- Lastly, we will output the list of students and their course assignments into a CSV file.

**This is our basic Algorithmic approach, which can be modified as required.** 

## Current State of the Project:

- We were able to read the input CSV files, store them in array and print them out in terminal. 
- Since we were able to get the input data, now we have to process it. 
- The student CSV file has has a lot of columns, we are trying to figure out the priority order of the requirements of a students. 
- Our next step is to implement the algorithm and improve it if required.

## Possible Issues:

- Optimization
- We still have to figure out how algorithm will react to the conflict in the class schedule and student's avialibility.
   
