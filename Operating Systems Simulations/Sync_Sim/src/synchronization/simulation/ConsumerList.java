/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
ConsumerList.java

Description: This is the class for the ConsumerList object. This object stores an
             array of Consumer objects.
*/

package synchronization.simulation;

import java.util.ArrayList;

public class ConsumerList 
{                                                                               
    public ArrayList<Consumer> list;                                            //CLASS VARIABLES                 
   
    public ConsumerList(int size)                                               //CONSTRUCTORS
    {         
        list = new ArrayList<Consumer>(size);
        String name = "cons_";
        for(int i = 0; i < size; i++)
        {
            String tempName = name;
            tempName += i;
            list.add(new Consumer(tempName));
        }
    }    
    
    public int getSize()
    {
        return this.list.size();
    }
}