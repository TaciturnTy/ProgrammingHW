/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
Consumer.java

Description: This is the class for the Consumerobject. This object represents 
             one cpu core.
*/

package synchronization.simulation;
import java.util.Random;                                                        
import java.util.ArrayList;                                                        

public class Consumer 
{                                                                                 
    protected ArrayList<Object> buffer = new ArrayList<Object>();               //CLASS VARIABLES 
    int criticalSection; 
    boolean isCritical;
    String id;   
    
    public Consumer(String name)                                                //CONSTRUCTOR
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
    
    public void pushBack(Object task)
    {
        this.buffer.add(task);
    }
}