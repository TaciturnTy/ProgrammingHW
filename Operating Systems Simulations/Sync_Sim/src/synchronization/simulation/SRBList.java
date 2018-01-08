/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
SRBList.java

Description: This is the class for the SRBList object. This object stores an
             array of SRB objects.
*/

package synchronization.simulation;

import java.util.Random;
import java.util.ArrayList;

public class SRBList 
{                                                                               
    public ArrayList<SRB> list;                                                 //CLASS VARIABLES            
    public SRBList(int size)                                                    //CONSTRUCTOR
    {          
        String name = "srb_";
        list = new ArrayList<SRB>(size);
        for(int i = 0; i < size; i++)
        {
            String tempName = name + i;
            list.add(new SRB(tempName));
        }
    }    
    
    public void SRBToProducer(ProducerList prodList, long[] timeArray)
    {
        //randomly select an srb in the list and pop an element at the list's end
        //randomly select a producer to put the task into and push it, then set is critical if appropriate
        Random rand = new Random();
        int min1 = 0; 
        int max1 = this.list.size() - 1;
        int min2 = 0; 
        int max2 = prodList.getSize() - 1;
        int index1 = rand.nextInt((max1 - min1) + 1) + min1;
        int index2 = rand.nextInt((max2 - min2) + 1) + min2;
            System.out.println(this.list.get(index1).buffer.size());

        if(!(this.list.get(index1).buffer.isEmpty()))
        {
            if(!(prodList.list.get(index2).isCritical))
            {
                prodList.list.get(index2).pushBack(this.list.get(index1).popBack());
            
                if(prodList.list.get(index2).buffer.size() >= prodList.list.get(index2).getCriticalSection())
                {
                    prodList.list.get(index2).setIsCritical(true);
                }
                if(this.list.get(index1).buffer.isEmpty())
                {
                    timeArray[index1] = System.nanoTime() - timeArray[index1];
                }  
            }
        }
    }
    
    public boolean TestIsEmpty()
    {
        //see if all lists have size 0
        boolean listIsEmpty = true;
        for(int i = 0; i < this.list.size(); i++)
        {
            if(!(this.list.get(i).buffer.isEmpty()))
            {
                listIsEmpty = false;
            }
        }
        return listIsEmpty;
    }
}