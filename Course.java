package com.mycompany.assignta;

import java.util.ArrayList;

/**
 *
 * @author Ramez Khalaf
 */
public class Course 
{
    //private String id;
    private String sub;
    private String cat;
    private String sec;
    private String title;
    private String name;
    private ArrayList<String> days = new ArrayList();
    private String startTime;
    private String endTime;
    private String room;
    private String campus;
    private int[] assignedTAs;      // HOLDS THE ID OF ALL TAs ASSIGNED (up to two TAs max)
    private int[] assignedTATypes;  //easier than calculating if the current course has a 392 and/or a 492 student each time we want that info. Can delete.
    //THERE WILL BE COURSES WITHOUT A DAY AND WITHOUT A TIME. THOSE CAN BE ASSIGNED TO ANY STUDENT WHO HAS MET THE OTHER REQUIREMENTS FOR THAT CLASS. GIVE THESE COURSES A PRIORITY OF 2? 
    
    public Course()
    {
        this.assignedTAs = new int[2];
        this.assignedTAs[0] = 0;
        this.assignedTAs[1] = 0;
        this.assignedTATypes = new int[2];
        this.assignedTATypes[0] = 0;
        this.assignedTATypes[1] = 0;
    }
    
    
    public Course(String sub, String cat, String sec, String title, String name, 
            ArrayList<String> days, String startTime, String endTime, String room, String campus)   //maybe add assignedTAs and assignedTATypes
    {
        this.sub = sub;
        this.cat = cat;
        this.sec = sec;
        this.title = title;
        this.name = name;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.campus = campus;
        this.assignedTAs = new int[2];
        this.assignedTAs[0] = 0;
        this.assignedTAs[1] = 0;
        this.assignedTATypes = new int[2];
        this.assignedTATypes[0] = 0;
        this.assignedTATypes[1] = 0;
    }
    
    
    //GETTERS
    public String getSub()
    {
        return sub;
    }
    
    public String getCat()
    {
        return cat;
    }
    
    public String getSec()
    {
        return sec;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getName()
    {
        return name;
    }
    
    public ArrayList<String> getDays()
    {
        return days;
    }
    
    public String getDay(int index)
    {
        return days.get(index);
    }
    public String getStartTime()
    {
        return startTime;
    }
    
    public String getEndTime()
    {
        return endTime;
    }
    
    public String getRoom()
    {
        return room;
    }
    
    public String getCampus()
    {
        return campus;
    }
    
    public int[] getAssignedTAs()
    {
        return assignedTAs;
    }
    
    public int[] getAssignedTATypes()
    {
        return assignedTATypes;
    }
    
    
    // SETTERS
    public void setSub(String sub)
    {
        this.sub = sub;
    }
    
    public void setCat(String cat)
    {
        this.cat = cat;
    }
    
    public void setSec(String sec)
    {
        this.sec = sec;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDays(String[] days)
    {
        for(int i = 0; i < days.length; i++)
        {
            this.days.add(days[i]);
        }
    }
    
    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }
    
    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }
    
    public void setRoom(String room)
    {
        this.room = room;
    }
    
    public void setCampus(String campus)
    {
        this.campus = campus;
    }
    
    public void setAssignedTAs(int id)
    {
        if(this.assignedTAs[0] == 0)
            this.assignedTAs[0] = id;
        else
            this.assignedTAs[1] = id;
    }
    
    public void setAssignedTATypes(boolean student392, boolean student492)
    {
        if(student392 == true)
        {
            this.assignedTATypes[0] += 1;
        }
        if(student492 == true)
        {
            this.assignedTATypes[1] += 1;
        }
    }
}
