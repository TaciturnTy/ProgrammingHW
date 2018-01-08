/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
Producer.java

Description: This is the class for the Producer object. This object represents 
             a buffer between the SRB and Consumer (core).
*/

package synchronization.simulation;
import java.util.Random;                                                        
import java.util.ArrayList;                                                        

public class Producer 
{                                                                                  
    public ArrayList<Object> buffer = new ArrayList<Object>();                  //CLASS VARIABLES
    protected int criticalSection;
    protected boolean isCritical;
    protected String id;   
    
    public Producer(String name)                                                //CONSTRUCTOR
    {             
        Random rand = new Random();
        criticalSection = rand.nextInt((88 - 67) + 1) + 67;
        isCritical = false;
        id = name;
    }
    
    public boolean getIsCritical()
    {
        return isCritical;
    }
    
    public void setIsCritical(boolean isFull)
    {
        isCritical = isFull;
    }
    
    public int getCriticalSection()
    {
        return criticalSection;
    }
    
    public Object popBack()
    {
        int size = this.buffer.size();
        Object task = this.buffer.get(size - 1);
        this.buffer.remove(size - 1);
        return task;
    }    
    
    public void pushBack(Object task)
    {
        this.buffer.add(task);
    }
}