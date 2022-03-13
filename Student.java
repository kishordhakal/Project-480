package com.mycompany.taasssigner;

import java.time.LocalDate;
import java.util.LinkedList;


public class Student implements Comparable<Student>
{
   private String firstName;
   private String lastName;
   private int id;
   private String email;
   private String graduatingQuarter;       //priority 1
   private int graduatingYear;             //priority 1
   private int type;                       //already split into 2 arrays based on type
   private boolean inEllensburg;
   private boolean[] availability;         //priority 2
   private boolean pythonExperience;       //if yes, then assign to a python course
   private boolean visualBasicExperience;  //if yes, then assign to a vb course
   private boolean[] coursesTaken;         //only allowed to TA for courses already taken, so check first
   private int priority;//new
   private String courseAssignment;        //sadly the only way to check which course is which is by checking all the data for it
    
   public Student()
   {
      this.courseAssignment = "";
   }
    
    
   public Student(String firstName, String lastName, int id, String email, String graduatingQuarter, 
            int year, int type, boolean inEllensburg, boolean[] availability, boolean pythonExperience, 
            boolean visualBasicExperience, boolean[] coursesTaken)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
      this.email = email;
      this.graduatingQuarter = graduatingQuarter;
      this.graduatingYear = year;
      this.type = type;
      this.inEllensburg = inEllensburg;
      this.availability = availability;
      this.pythonExperience = pythonExperience;
      this.visualBasicExperience = visualBasicExperience;
      this.coursesTaken = coursesTaken;
      this.courseAssignment = "";
      setPriority();
   }
    
    
    // GETTERS
   public String getFirstName()
   {
      return firstName;
   }
    
   public String getLastName()
   {
      return lastName;
   }
    
   public int getId()
   {
      return id;
   }
   public String getEmail()
   {
      return email;
   }
    
   public String getGraduatingQuarter()
   {
      return graduatingQuarter;
   }
    
   public int getGraduatingYear()
   {
      return graduatingYear;
   }
    
   public int getType()
   {
      return type;
   }
    
   public boolean getInEllensburg()
   {
      return inEllensburg;
   }
    
   public boolean[] getAvailability()
   {
      return availability;
   }
    
   public boolean getPythonExperience()
   {
      return pythonExperience;
   }
    
   public boolean getVisualBasicExperience()
   {
      return visualBasicExperience;
   }
    
   public boolean[] getCoursesTaken()
   {
      return coursesTaken;
   }
    
   public String getCourseAssignment()
   {
      return courseAssignment;
   }
    
   public int getPriority()
   {
      return priority;
   }
    
    
    
    // SETTERS
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
    
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
    
   public void setId(int id)
   {
      this.id = id;
   }
    
   public void setEmail(String email)
   {
      this.email = email;
   }
    
   public void setGraduatingQuarter(String graduatingQuarter)
   {
      this.graduatingQuarter = graduatingQuarter;
   }
    
   public void setGraduatingYear(int graduatingYear)
   {
      this.graduatingYear = graduatingYear;
   }
    
   public void setType(int type)
   {
      this.type = type;
   }
    
   public void setInEllensburg(boolean inEllensburg)
   {
      this.inEllensburg = inEllensburg;
   }
    
   public void setAvailability(boolean[] availability)
   {
      this.availability = availability;
   }
    
   public void setPythonExperience(boolean pythonExperience)
   {
      this.pythonExperience = pythonExperience;
   }
    
   public void setVisualBasicExperience(boolean visualBasicExperience)
   {
      this.visualBasicExperience = visualBasicExperience;
   }
    
   public void setCoursesTaken(boolean[] coursesTaken)
   {
      this.coursesTaken = coursesTaken;
   }
    
   public void setCourseAssignment(String courseAssignment)
   {
      this.courseAssignment = courseAssignment;
   }
    
   public final void setPriority()
   {
        //PUT THIS IN CONSTRUCTOR OR SOMETHING
      LocalDate date = LocalDate.now();
        
        // If graduatingYear is this year && its not the end of the year, then set priority = 1.
        // Also, if graduating year is next year and it is currently the end of a year, then still set priority = 1.
      if(((graduatingYear - date.getYear()) == 0  && (date.getMonthValue() != 9  && date.getMonthValue() != 10  && date.getMonthValue() != 11  && date.getMonthValue() != 12)) ||
        // Also, if graduating year is next year and it is currently the end of a year, then still set priority = 1.
                ((graduatingYear - date.getYear()) == 1 && (date.getMonthValue() == 9 || date.getMonthValue() == 10 || date.getMonthValue() == 11 || date.getMonthValue() == 12)))
      {
         priority = 1;
      }
      else
      {
         priority = 2;
      }
        
        // AND THEN, IF GRADQUARTER IS NEXT QUARTER, THEN +0 priority. IF THE QUARTER AFTER NEXT QUARTER, THEN +1 priority... etc.
        //if((graduatingQuarter - ))
      LinkedList<String> list = getCurrentQuarter();
      if(list != null && !list.isEmpty())
      {
         if(graduatingQuarter.equalsIgnoreCase(list.get(1)))
         {
            priority += 0;
         }
         else if(graduatingQuarter.equalsIgnoreCase(list.get(2)))
         {
            priority += 1;
         }
         else if(graduatingQuarter.equalsIgnoreCase(list.get(3)))
         {
            priority += 2;
         }
         else
         {
            priority += 3;
         }
      }
   }
    
    
    
   private LinkedList<String> getCurrentQuarter()
   {
      LocalDate date = LocalDate.now();
      LinkedList<String> quarters = new LinkedList();
        // If graduatingQuarter is one quarter away, then priority +0. If its two quarters away, then priority +1
         // && date.getDayOfMonth() < 4)  //WINTER QUARTER STARTS JANUARY 4. //IF IT IS BEFORE THE START OF WINTER QUARTER, THEN CURRENT QUARTER IS FALL
         
      if(date.getMonthValue() >= 1 && date.getMonthValue() < 4)
      {
         quarters.add("Winter");
         quarters.add("Spring");
         quarters.add("Summer");
         quarters.add("Fall");
      }
      else if(date.getMonthValue() >= 4 && date.getMonthValue() < 7)
      {
         quarters.add("Spring");
         quarters.add("Summer");
         quarters.add("Fall");
         quarters.add("Winter");
      }
      else if(date.getMonthValue() == 7 || date.getMonthValue() == 8)
      {
         quarters.add("Summer");
         quarters.add("Fall");
         quarters.add("Winter");
         quarters.add("Spring");
      }
      else
      {
         quarters.add("Fall");
         quarters.add("Winter");
         quarters.add("Spring");
         quarters.add("Summer");
      }
        
      return quarters;
   }
    
    

    // Used to sort students by priority.
   @Override
    public int compareTo(Student other)
   {
        //first, go through courses taken. Those are the only classes that student is eligible to TA
      return this.priority - other.priority;
   }
    
    
    
}
