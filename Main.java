package com.mycompany.assignta;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Main{

   public static void main(String[] args){
      
      String file= "src//main//java//Files//students.csv";
      BufferedReader reader= null;
      String line = "";
   
      try {
         reader = new BufferedReader(new FileReader(file));
         ArrayList<Student> students = new ArrayList();
         
         /*// Get first line... or two?
         if ((line = reader.readLine()) != null)
         {
             String[] lineOne = line.split(", ");
         }*/
         
         while((line= reader.readLine())!= null)
         {
            String[] row = line.split(",");
            Student student = new Student();
            
            
            // START ADDING STUDENT ATTRIBUTES
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
            for(int i = 8; i < 40; i++)
            {
                availability[i - 8] = row[i].equalsIgnoreCase("Open");
            }
            student.setAvailability(availability);
            
            // PythonExperience (make shorter)
            if(row[41].equalsIgnoreCase("Yes"))
                student.setPythonExperience(true);
            else
                student.setPythonExperience(false);
            // VBExperience (Make shorter)
            if(row[42].equalsIgnoreCase("Yes"))
                student.setVisualBasicExperience(true);
            else
                student.setVisualBasicExperience(false);
            
            // coursesTaken loop    64 = 21 + 43
            boolean[] coursesTaken = new boolean[21]; //21 or 33?       63,64
            for(int i = 43; i < row.length; i++)
            {
                coursesTaken[i - 43] = row[i].equalsIgnoreCase("X");
            }
            student.setCoursesTaken(coursesTaken);
            // FINISH ADDING STUDENT ATTRIBUTES
            
            
            /*// PRINT CSV DATA
            for (String index: row)
            {
               System.out.printf("%-30s", index);
            }
            System.out.println();*/
            students.add(student);
            
         }
         // PRINT ARRAYLIST<Student> DATA
            for(int i = 0; i < students.size(); i++)
            {
                System.out.println(students.get(i).getFirstName() + ", " + students.get(i).getLastName() + ", " 
                        + students.get(i).getId() + ", " + students.get(i).getEmail() + ", " 
                        + students.get(i).getGraduatingQuarter() + ", " + students.get(i).getGraduatingYear() + ", " 
                        + students.get(i).getType() + ", " + students.get(i).getInEllensburg() + ", " 
                        + Arrays.toString(students.get(i).getAvailability()) + ", " + students.get(i).getPythonExperience() + ", " 
                        + students.get(i).getVisualBasicExperience() + ", " + Arrays.toString(students.get(i).getCoursesTaken()));
            }
      
      }
      catch(Exception e){
         e.printStackTrace();
      }
      finally {
         try{
            reader.close();
         } catch (IOException e){
            e.printStackTrace();
         }
      }
   }
}
