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
    int type;
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
    
    public int[] getAvailability()
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
    
    public String[] getCoursesTaken()
    {
        return coursesTaken;
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
    
    public void setAvailability(int[] availability)
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
    
    public void setCoursesTaken(String[] coursesTaken)
    {
        this.coursesTaken = coursesTaken;
    }
}
