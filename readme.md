## Tools Needed 

- Java 
- NeatBeans
- Github
- Microsoft Excel or google sheets 

## How to Build
- Zip-file of the whole project can be obtained from github.
- Once downloaded the Zip file on the System, unzip it.
- Once unzip, open up the Neatbeans and click on the file located at the left-top corner.
- Open project option will be there, click on it and navigate to the unzipped project file.
- Once opened on netbeans, the program can be edited, or run as it using the run option. 
- .jar file can be created easily with Netbeans, but sometimes it might give an issue on some systems.  
- students.csv and schedule.csv files are needed to check the program. 
- the structure of the files must be the same as the ones in zip-file. 
## Program Structure 

The program is structured in three classes, Main.java, student.java and Courses.java and Main.form as GUI form. 

### Student.java 

Student.java stores the information about students from the students.csv file. This class has getters and setters for accessibility of the data.
This code below shows the Setter function for the first name of the student.

		public void setFirstName(String firstName)
  		{
     		 		this.firstName = firstName;
  		}

This code below shows the Getter function for the first name of the student.  
public String getFirstName()
 		{
     				return firstName;
  		}

This class also sets the priority based upon the graduation year and quarter.

### Course.java 

This class stores the information from the schedule.csv file. Same as the student class this also has Getter and Setters. This sets the Assigned TAs to a particular course.

### Main.java

This class is the main driver of the projects that binds all parts of the program together. 
This class extends javax.swing.Jframe. 

This function assigns students with high priority to courses.
	public static void assignHighPriority(ArrayList<Student> students, ArrayList<Course> courses,ArrayList<String> takenCourses) throws IOException {}

This function assigns students with low priority to courses.
public static void assignLowPriority(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<String> takenCourses) throws IOException{} 

While assigning the courses these function will look for requirements such as,
- if the course has TA spot available
- If the TA is available at the time of class 
- If the course is online or in campus 
- if the students are in Ellensburg or not.
- if the students have python and VB experience for some classes or not.
-if the students have taken the class that they are being assigned to  or not. 

There are few helper boolean function to check these requirements. 
  
This function checks if the 392 students will be able to TA on campus or not.

public static void onOffCheck_392(ArrayList<Student> students, ArrayList<Course> courses,ArrayList<String> takenCourses, int i, int j) throws IOException{}

This function checks if the 492 students will be able to TA on campus or not.
 
	public static void onOffCheck_492(ArrayList<Student> students, ArrayList<Course> courses,ArrayList<String> takenCourses, int i, int j) throws IOException{}

This function checks if the given course needs python experience and the students have it or not.

	public static boolean IsPython(ArrayList<Student> students, ArrayList<Course> courses, int i, int j){}

This function checks if the given course needs Visual Basic experience and the students have it or not.

	public static boolean IsVB(ArrayList<Student> students, ArrayList<Course> courses, int i , int j )

This function checks if the students have taken the classes that they are about to get assigned for. 

	public static boolean takenCoursesList(ArrayList<Student> students, ArrayList<Course> courses,ArrayList<String> takenCourses, int i, int j) throws FileNotFoundException, IOException{}

This function saves the name of courses that are given in the students.csv. 
These course names are used to compare the cat to determine if the students have taken the course or not.

public static ArrayList<String> fillTakenCourses(ArrayList<String> takenCourses) throws FileNotFoundException, IOException{}

This function allows two TAs for a course one 392 and another one 492 types.
 
public static void assignCourseStudent(ArrayList<Student> students, ArrayList<Course> courses, int i, int j){}

This function checks the time availability of students in a given day and time.
 
	public static boolean isAvailable(ArrayList<Student> students, ArrayList<Course> courses, int i, int j){}

This function gets the information from students.csv and sets them to the arrayList of type of students.
 
	public static void setStudents(ArrayList<Student> students){}

This function gets the information from schedule.csv and sets them to the arrayList of type of courses.

	public static void setCourseData(ArrayList<Course> courses){}

This function prints the data from students.csv file. Can be used for dubbing purposes.
 
	public static void printStudentData(ArrayList<Student> students)

This function prints the data from students.csv file. Can be used for dubbing purposes. 

	public static void printCourseData(ArrayList<Course> courses)

This function writes the AssinedTAs.csv file with the optimal schedule option from the program.

	public static void printCourseAssignments(ArrayList<Course> courses) throws FileNotFoundException{}

This function prints data about assignment, how many students have been assigned and how many left. Prints data into the console.
 
	public static void printDetails(int studentsAssigned, int studentsLeft, int coursesWithOneTA, int coursesWithNoTA){}

## Main.form
The main from desinged and built with the Nebeans.
It provides a simple interface to a user which is easy to follow along. 


## Other Importants

List of some useful tips

- Use arrayList to store the data due to uncertainty of the data size.
- Starting by dividing two types of students helps to improve performance.
- Checking simple conditions at the very first also helps to improve the performance. 
- Use a modular approach and take advantage of OPP. 
