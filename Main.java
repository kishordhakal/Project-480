/*
 * Authors: Ramez Khalaf, Mag Dhakal, Robin Purnama, Connor Phipps
 * Group: 2
 * Description: Program to assign TAs.
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{

    
   public static void main(String[] args)
   {
      try 
      {
         ArrayList<Student> students = new ArrayList();
         ArrayList<Course> courses = new ArrayList();
         ArrayList<Student> students392 = new ArrayList();
         ArrayList<Student> students492 = new ArrayList();
         final int TYPE392 = 392;
         final int TYPE492 = 492;
            
            
            // Record student data
         setStudents(students);
            // Print ArrayList<Student> data
         System.out.println("\nSTUDENTS: ");
         printStudentData(students);
          
            // Record course data
         setCourseData(courses);
            // Print ArrayList<Course> data
         System.out.println("\nCOURSE SCHEDULE: ");
         printCourseData(courses);
            
            // Sort Students into two ArrayLists (392 and 492)
         for(Student student: students)
         {
            if(student.getType() == TYPE392)
               students392.add(student);
            else
               students492.add(student);
         }
         students.clear();
            
            // Print new ArrayLists
         System.out.println("\nSTUDENTS (CS392): ");
         printStudentData(students392);
         System.out.println("\nSTUDENTS (CS492): ");
         printStudentData(students492);
            
            
            // Sort arraylists by priority
            // students392.sort(comparator);
            //students492.sort(comparator);
            
            
            // Sort with comparator. If multiple attributes are equal, then sort by the next priority.
            //I.E., if multiple students graduate 2022, then sort by quarter. If graduation quarter is the same too, then sort by coursesTaken.
            
            /*
                PRIORITY:
                GraduationYear/GraduationQuarter > Courses Taken > VB/Python Experience > Availability > 
            
                *one of each type per course*
            */
            
            /* 
                QUESTIONS:
                How should "In Ellensburg" status influence the algorithm?
                Which classes need VB experience? Python Experience?
            
            */
          
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   
   
   
   
   // Set ArrayList<Student> data
   public static void setStudents(ArrayList<Student> students)
   {
      try {
           
         String file= "students.csv";
         BufferedReader reader = new BufferedReader(new FileReader(file));
           
            // Get first two lines
         if ((reader.readLine()) != null)
            reader.readLine();
         if ((reader.readLine()) != null)
            reader.readLine();
            
         String line = "";
            
         while((line = reader.readLine())!= null)
         {
            String[] row = line.split(",");
            Student student = new Student();
               
               
               // ADDING STUDENT ATTRIBUTES: START
            student.setFirstName(row[0]);
            student.setLastName(row[1]);
            student.setId(Integer.parseInt(row[2]));
            student.setEmail(row[3]);
            student.setGraduatingQuarter(row[4]);
            student.setGraduatingYear(Integer.parseInt(row[5]));
            student.setType(Integer.parseInt(row[6]));
            if(row[7].equalsIgnoreCase("Yes"))
               student.setInEllensburg(true);
            else
               student.setInEllensburg(false);
               
               // Availability loop
            boolean[] availability = new boolean[32];
            final int END_AVAIL_INPUT = 40;
            for(int i = 8; i < END_AVAIL_INPUT; i++)
            {
               availability[i - 8] = row[i].equalsIgnoreCase("Open");
            }
            student.setAvailability(availability);
               
               // PythonExperience
            student.setPythonExperience(row[41].equalsIgnoreCase("Yes"));
               // VBExperience (Make shorter)
            student.setVisualBasicExperience(row[42].equalsIgnoreCase("Yes"));
               
               // coursesTaken loop    53
            boolean[] coursesTaken = new boolean[21];
            for(int i = 43; i < row.length; i++)
            {
               coursesTaken[i - (43)] = row[i].equalsIgnoreCase("X");
            }
            student.setCoursesTaken(coursesTaken);
               
            students.add(student);
               // ADDING STUDENT ATTRIBUTES: COMPLETE
         }
      } catch (IOException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   
   // Set Course Data
   public static void setCourseData(ArrayList<Course> courses)
   {
      try {
           
         String file= "src//main//java//Files//schedule.csv";
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line = "";
           
            // Get first two lines
         if ((reader.readLine()) != null)
            reader.readLine();
            
         while((line = reader.readLine())!= null)
         {
            String[] row = line.split(",");
            Course course = new Course();
            int i = 0;
               
               // ADDING STUDENT ATTRIBUTES: START
            course.setSub(row[i]);
            i++;
            course.setCat(row[i]);
            i++;
            course.setSec(row[i]);
            i++;
            course.setTitle(row[i]);
            i++;
            if(row[4].contains("\""))
               course.setName(row[i].concat(row[++i]));                     //NO SPACE BETWEEN FIRST/LAST NAME. NEEDS A SPACE THERE.
            else
               course.setName("");
            i++;
            String[] days = row[i].split(" ");
            course.setDays(days);
            i++;
            course.setStartTime(row[i]);
            i++;
            course.setEndTime(row[i]);
            i++;
            course.setRoom(row[i]);
            i++;
            course.setCampus(row[i]);
               
            courses.add(course);
               // ADDING STUDENT ATTRIBUTES: COMPLETE
         }
      } catch (IOException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   
   
   
   // Print student data
   public static void printStudentData(ArrayList<Student> students)
   {
      for(int i = 0; i < students.size(); i++)
      {
         System.out.println(students.get(i).getFirstName() + ", " + students.get(i).getLastName() + ", " 
                    + students.get(i).getId() + ", " + students.get(i).getEmail() + ", " 
                    + students.get(i).getGraduatingQuarter() + ", " + students.get(i).getGraduatingYear() + ", " 
                    + students.get(i).getType() + ", " + students.get(i).getInEllensburg() + ", " 
                    + Arrays.toString(students.get(i).getAvailability()) + ", " + students.get(i).getPythonExperience() + ", " 
                    + students.get(i).getVisualBasicExperience() + ", " + Arrays.toString(students.get(i).getCoursesTaken()) + ".");
      }
   }
   
   // Print course data
   public static void printCourseData(ArrayList<Course> courses)
   {
      for(int i = 0; i < courses.size(); i++)
      {
         System.out.println(courses.get(i).getSub() + ", " + courses.get(i).getCat() + ", " + courses.get(i).getSec() 
                   + ", " + courses.get(i).getTitle() + ", " + courses.get(i).getName() + ", " + courses.get(i).getDays() 
                   + ", " + courses.get(i).getStartTime() + ", " + courses.get(i).getEndTime() + ", " + courses.get(i).getRoom() 
                   + ", " + courses.get(i).getCampus() + ".");
      }
   }
}
