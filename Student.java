package com.mycompany.assignta;

/**
 *
 * @author Ramez Khalaf
 */
public class Student {
    String firstName;
    String lastName;
    int id;
    String email;
    String graduatingQuarter;
    int graduatingYear;
    int type;   //type of TA
    boolean inEllensburg;
    int[] availability;
    boolean pythonExperience;
    boolean visualBasicExperience;
    String[] coursesTaken;
    
    
    public Student()
    {
        
    }
    
    
    public Student(String firstName, String lastName, int id, String email, String graduatingQuarter, 
            int year, int type, boolean inEllensburg, int[] availability, boolean pythonExperience, 
            boolean visualBasicExperience, String[] coursesTaken)
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
    }
    
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public int getId()
    {
        return this.id;
    }
    public String getEmail()
    {
        return this.email;
    }
    
    public String getGraduatingQuarter()
    {
        return this.graduatingQuarter;
    }
    
    public int getGraduatingYear()
    {
        return this.graduatingYear;
    }
    
    public int getType()
    {
        return this.type;
    }
    
    public boolean getInEllensburg()
    {
        return this.inEllensburg;
    }
    
    public int[] getAvailability()
    {
        return this.availability;
    }
    
    public boolean getPythonExperience()
    {
        return this.pythonExperience;
    }
    
    public boolean getVisualBasicExperience()
    {
        return this.visualBasicExperience;
    }
    
    public String[] getCoursesTaken()
    {
        return this.coursesTaken;
    }
}
