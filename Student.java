package com.mycompany.assignta;

/**
 *
 * @author Ramez Khalaf
 */
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private String email;
    private String graduatingQuarter;
    private int graduatingYear;
    private int type;
    private boolean inEllensburg;
    private boolean[] availability;
    private boolean pythonExperience;
    private boolean visualBasicExperience;
    private boolean[] coursesTaken;
    
    
    public Student()
    {
        
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
}
