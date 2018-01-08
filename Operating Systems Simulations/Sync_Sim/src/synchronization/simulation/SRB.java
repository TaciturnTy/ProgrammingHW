/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
SRB.java

Description: This is the class for the SRB object. This object represents one
             buffer (SRB) holding tasks for the cpu to complete. Tasks are random
             ints or strings.
*/

package synchronization.simulation;
import java.time.Instant;
import java.util.Random;                                                        
import java.util.ArrayList;                                                        

public class SRB 
{             
    Random rand;                                                                //CLASS VARIABLES   
    protected ArrayList<Object> buffer = new ArrayList<Object>();
    String id;   
                                                                  
    public SRB(String name)                                                     //CONSTRUCTOR
    {         
        rand = new Random();
        rand.setSeed(Instant.now().toEpochMilli());
        id = name;

        for(int i = 0; i < 100; i++)
        {
            int num = rand.nextInt((1 - 0) + 1) + 0;
            switch(num)
            {
                case 0:
                        this.buffer.add(addRandString());
                        break;
                case 1:
                        this.buffer.add(addRandInt());
                        break;        
                default: 
                        System.out.println("ERROR: Invalid Case in SRB");
            }
        }
    }
    
    public String addRandString()
    {           
        int min = 1; 
        int max = 10;
        int length = rand.nextInt((max - min) + 1) + min;
        String output = "";
        for(int i = 0; i < length; i++)
        {
            char c = (char)(rand.nextInt(26) + 'a');
            output += c;
        }
        return output;
    }
    public int addRandInt()
    {
        int min = 0; 
        int max = 1000;
        int output = rand.nextInt((max - min) + 1) + min;
        return output;      
    }
    
    public Object popBack()
    {
        int size = this.buffer.size();
        Object task = this.buffer.get(size - 1);
        this.buffer.remove(size - 1);
        return task;
    }
}