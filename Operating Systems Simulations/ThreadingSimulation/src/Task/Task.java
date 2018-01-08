/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
10/28/2017
Task.java

Description: This is the class for the Task object. This object represents one
             task for an operating system to complete. It has a priority and a 
             time represents how long it would take to execute it. These class
             variables are randomly generated.
*/

package Task;
import java.util.Random;                                                        

public class Task 
{                                                                               //CLASS VARIABLES   
    protected int echelon;                                                      //random number (1-5), determines importance of Task
    protected int priority;                                                     //random number (1-10), determines importance of Task, not as important as echelon
    protected int requestCode;                                                  //random hex number (0001h - ffffh), unique hexidecimal identifier
    protected int totalTime;                                                    //random number (1 - 10000), time in milliseconds to complete the Task
    protected int startTime;                                                    //time in milliseconds when a Task begins execution
    protected int endTime;                                                      //time in milliseconds when a Task finishes execution
                                                                                
    public Task(boolean setValues)                                              //CONSTRUCTOR
    {                                                                           //Initializes all class variables to random values
        if(setValues)                                                           //except the requestCode, startTime, and endTime
        {        
            int eMin = 1, eMax = 5;                                                 
            int pMin = 1, pMax = 10;
            int tMin = 1, tMax = 10000;

            Random rand = new Random();
            this.echelon = rand.nextInt((eMax - eMin) + 1) + eMin;
            this.priority = rand.nextInt((pMax - pMin) + 1) + pMin;
            this.totalTime = rand.nextInt((tMax - tMin) + 1) + tMin;
        }
    }
                                                                                
    public void setRequestCode(int[] existingCodes)                             //SET METHODS
    {                                                                           //requestCodes must be set one at a time to ensure uniqueness
        int rMin = 0x0001, rMax = 0xFFFF;
        Random rand = new Random();

        generateRand:
        {
            this.requestCode = rand.nextInt((rMax - rMin) + 1) + rMin;

            for(int i = 0; i < existingCodes.length; i++)
            {
                if(this.requestCode == existingCodes[i])
                {
                    break generateRand;
                }
            }
        }
    }
                                                                                
    public void setEchelon(int ech)
    {
            this.echelon = ech;
    }
    public void setStartTime(int st)
    {
            this.startTime = st;
    }	

    public void setEndTime(int et)
    {
            this.endTime = et;
    }	
                                                                                
    public int getEchelon()                                                     //GET METHODS
    {
            return this.echelon;
    }

    public int getPriority()
    {
            return this.priority;
    }

    public int getRequestCode()
    {
            return this.requestCode;
    }	

    public int getStartTime()
    {
            return this.startTime;
    }	

    public int getEndTime()
    {
            return this.endTime;
    }

    public int getTotalTime()
    {
            return this.totalTime;
    }
}

