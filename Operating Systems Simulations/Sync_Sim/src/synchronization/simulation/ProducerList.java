/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
ProducerList.java

Description: This is the class for the ProducerList object. This object stores an
             array of Producer objects.
*/

package synchronization.simulation;

import java.util.Random;
import java.util.ArrayList;

public class ProducerList 
{                                                                               
    public ArrayList<Producer> list;                                            //CLASS VARIABLES                 
    
    public ProducerList(int size)                                               //CONSTRUCTORS
    {          
        list = new ArrayList<Producer>(size);
        String name = "prod_";
        for(int i = 0; i < size; i++)
        {
            String tempName = name;
            tempName += i;
            list.add(new Producer(tempName));                                               
        }
    }  
    
    public void ProducerToConsumer(ConsumerList consList)
    {
        //randomly select a producer in the list and pop the element at its end to a random consumer
        //randomly select a consumer in consList and push, then set isCritical if appropriate
        Random rand = new Random();
        int min1 = 0; 
        int max1 = this.list.size() - 1;
        int min2 = 0; 
        int max2 = consList.getSize() - 1;
        int index1 = rand.nextInt((max1 - min1) + 1) + min1;
        int index2 = rand.nextInt((max2 - min2) + 1) + min2;

        if(!(this.list.get(index1).buffer.isEmpty()))
        {    
            if(!(consList.list.get(index2).isCritical))
            {
                consList.list.get(index2).pushBack(this.list.get(index1).popBack());
                if(consList.list.get(index2).buffer.size() >= consList.list.get(index2).getCriticalSection())
                {
                    consList.list.get(index2).setIsCritical(true);
                }
            }
        }
    }
    
    public int getSize()
    {
        return this.list.size();
    }
}