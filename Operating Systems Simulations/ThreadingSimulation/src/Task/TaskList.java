/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
10/28/2017
TaskList.java

Description: This is the class for the TaskList object. This object stores an
             array of Task objects. A TaskList can have its Tasks sorted by 
             echelon and priority or printed.
*/

package Task;

import java.util.Random;
import java.io.*;
public class TaskList 
{                                                                               //CLASS VARIABLES
    public Task[] list;                                                         
    int totalTime;                                                              //total time it takes the TaskList to execute, set with setTimes methods
    
   
    //copy from one TaskList into another starting at the index 'start'
    public TaskList(TaskList sourceList, int start, int end)                    //CONSTRUCTORS
    {          
        int size = end - start;
        this.list = new Task[size];
        this.totalTime = -1;      
                
        for(int i = 0; i < size; i++)
        {
            list[i] = new Task(false);                                               
            this.list[i].echelon = sourceList.list[start].echelon;
            this.list[i].priority = sourceList.list[start].priority;
            this.list[i].requestCode = sourceList.list[start].requestCode;
            this.list[i].totalTime = sourceList.list[start].totalTime;
            start++;
        }
    }    
    
    //Creates Tasks and initializes their class variables
    public TaskList(int size)                                                   
    {                                                                           
        list = new Task[size];
        totalTime = -1;                                                         
        
        int[] existingCodes = new int[size];                                    //used to store previous values of requestCode identifier
        for(int i = 0; i < list.length; i++)                                    //make a unique requestCode for each Task in TaskList
        {                                                                       
            list[i] = new Task(true);                                           //create initialize random values for this Task
            list[i].setRequestCode(existingCodes);
            existingCodes[i] = list[i].requestCode;                             //add this requestCode to existing codes to not use again
        }
    }
    
    //Sets the start and end time of each Task in a TaskList whether or not
    //the TaskList has been sorted. 
    // isMultithreaded: simulates executing the TaskList with multithreading,
    //                  this makes each Task take 20-80% more time to execute
    // sleepClause: simulates a constant time in milliseconds it takes to swap 
    //              to executing a different Task
    public void setTimes(boolean isMultithreaded, int sleepClause)
    {
        int totalTime = 0;
        double mMin = 1.2, mMax = 1.8;
        double randVal;
        if(isMultithreaded)                                                     //increase time by 20 - 80% if isMultithreaded is true
        {            
            Random rand = new Random();
            for(int i = 0; i < this.list.length; i++)
            {
                randVal = mMin + (mMax - mMin) * rand.nextDouble();
                this.list[i].totalTime = (int)((int) this.list[i].totalTime * randVal);
                this.list[i].startTime = totalTime;
                this.list[i].endTime = totalTime + this.list[i].totalTime;
                totalTime += this.list[i].totalTime; 
                
                if(i != this.list.length - 1)
                    totalTime += sleepClause;
            } 
        }
        else
        {
            for(int i = 0; i < this.list.length; i++)
            {
                this.list[i].startTime = totalTime;
                this.list[i].endTime = totalTime + this.list[i].totalTime;
                totalTime += this.list[i].totalTime; 
                
                if(i != this.list.length - 1)
                    totalTime += sleepClause;
            }       
        }
        this.totalTime = totalTime;
    }
    
    //Perform echelon and priority sorting for Tasks from first to last
    public void sortTaskList(int first, int last)                               //SORTING METHODS
    {
        TaskList temp = new TaskList(this.list.length);
	mergeSortEchelon(temp, first, last);
        mergeSortPriority(temp, first, last);
    }
        
    //Perform merge sorting by echelon only from first to last
    //Must be used before mergeSortPriority
    private void mergeSortEchelon(TaskList temp, int first, int last)
    {
	if(first < last)
	{
            int mid = first + (last - first) / 2;
            mergeSortEchelon(temp, first, mid);                                 //recursive call if the TaskList can be divided again
            mergeSortEchelon(temp, mid + 1, last);                              //recursive call if the TaskList can be divided again
            mergeEchelon(temp, first, mid, last);                               //order echelons least to greatest
        }
    }
    
    //Orders the echelons in the TaskList from location first to location last
    private void mergeEchelon(TaskList temp, int first, int mid, int last)
    {
        for (int i = first; i <= last; i++) 
        {
            temp.list[i] = this.list[i];
        }
                
        int i = first;
	int j = mid + 1;
	int k = first;

	while(i <= mid && j <= last)
	{
            if(temp.list[i].echelon <= temp.list[j].echelon)
            {
                this.list[k] = temp.list[i];
                i++;
            }
            else
            {
                this.list[k] = temp.list[j];
                j++;
            }
            k++;
	}
	while(i <= mid)
	{
            this.list[k] = temp.list[i];
            k++;
            i++;
	}
    }
    
    //Perform merge sorting by priority only from first to last
    //Must be given a TaskList already sorted by echelon
    //Divides the sorting into smaller priority sorts with the same echelon
    private void mergeSortPriority(TaskList temp, int first, int last)
    {
        int currentEch = this.list[first].echelon;
            
        for (int i = first; i <= last; i++) 
        {
            if(this.list[i].echelon != currentEch)
            {
                this.mergeSubsortPriorty(temp, first, i - 1);                   //for this echelon, sort the priorities
                currentEch = this.list[i].echelon;                              
                first = i;
            }
            else if(i == last)                                                  //if this is the last element to sort, sort the current echelon's priorities
            {
                this.mergeSubsortPriorty(temp, first, last);
            }
        }
    }
        
    //Assumes echelons are already sorted lowest to highest, assumes all
    //echelons are the same from first to last
    private void mergeSubsortPriorty(TaskList temp, int first, int last)
    {
        if(first < last)
	{
            int mid = first + (last - first) / 2;
            mergeSubsortPriorty(temp, first, mid);                              //recursive call if the TaskList can be divided again
            mergeSubsortPriorty(temp, mid + 1, last);                           //recursive call if the TaskList can be divided again
            mergePriority(temp, first, mid, last);                              //order priorities least to greatest
	}
    }
        
    //Orders the priorities in the TaskList from location first to location last
    private void mergePriority(TaskList temp, int first, int mid, int last)
    {
        for (int i = first; i <= last; i++) 
        {
            temp.list[i] = this.list[i];
        }
                
	int i = first;
	int j = mid + 1;
	int k = first;

	while(i <= mid && j <= last)
	{
            if(temp.list[i].priority <= temp.list[j].priority)
            {
                this.list[k] = temp.list[i];
                i++;
            }
            else
            {
                this.list[k] = temp.list[j];
                j++;
            }
            k++;
	}
	while(i <= mid)
	{
            this.list[k] = temp.list[i];
            k++;
            i++;
	}
    }
    
    //Print the values of every Task in the TaskList in a table
    public void print()
    {
        System.out.printf("Task #      Echelon      Priority      Request Code      Total Time      Start Time      End Time\n");

        for(int i = 0; i < this.list.length; i++)
        {
            System.out.printf("%5d) %6d %13d %16d %16dms %17dms %13dms\n", i+1, this.list[i].echelon, this.list[i].priority, 
                              this.list[i].requestCode, this.list[i].totalTime, this.list[i].startTime, this.list[i].endTime);
        }
        if(this.totalTime == -1)                                                //if totalTime is -1 when print is called, we know the times have not been set yet
            System.out.println("Total Execution Time: UNKNOWN\n");                  
        else
            //print total time to execute TaskList, includes extra time by multithreading and sleepClause 
            System.out.println("Total Execution Time: " + this.totalTime + "ms\n");                       
    }	
    
    //Writes the values of every Task in the TaskList in a table in an output file
    public void write(PrintWriter outFile)
    {
        outFile.printf("Task #      Echelon      Priority      Request Code      Total Time      Start Time      End Time\r\n");

        for(int i = 0; i < this.list.length; i++)
        {
            outFile.printf("%5d) %6d %13d %16d %16dms %17dms %13dms\r\n", i+1, this.list[i].echelon, this.list[i].priority, 
                              this.list[i].requestCode, this.list[i].totalTime, this.list[i].startTime, this.list[i].endTime);
        }
        if(this.totalTime == -1)                                                //if totalTime is -1 when print is called, we know the times have not been set yet
            outFile.println("Total Execution Time: UNKNOWN\r\n");                  
        else
            //print total time to execute TaskList, includes extra time by multithreading and sleepClause 
            outFile.println("Total Execution Time: " + this.totalTime + "ms\r\n"); 
        outFile.close();
    }	
}      
//OBSOLETE SEQUENTIAL SORTING METHODS
//        public void sortTaskListEchelon(int start, int stop)
//        {
//            int i, j, minIndex, tmp;
//            int n = stop;
//
//            for (i = start; i < n - 1; i++) 
//            {
//                minIndex = i;
//                for (j = i + 1; j < n; j++)
//                    if (this.list[j].echelon < this.list[minIndex].echelon)
//                        minIndex = j;
//                if (minIndex != i) 
//                {
//                    tmp = this.list[i].echelon;
//                    this.list[i].echelon = this.list[minIndex].echelon;
//                    this.list[minIndex].echelon = tmp;
//                }
//            }
//        }
        
//        private void sortPriority(int start, int stop)
//        {
//            int i, j, minIndex, tmp;
//            int n = stop;
//
//            for (i = start; i < n - 1; i++) 
//            {
//                minIndex = i;
//                for (j = i + 1; j < n; j++)
//                    if (this.list[j].priority < this.list[minIndex].priority)
//                        minIndex = j;
//                if (minIndex != i) 
//                {
//                    tmp = this.list[i].priority;
//                    this.list[i].priority = this.list[minIndex].priority;
//                    this.list[minIndex].priority = tmp;
//                }
//            }
//        }    



 