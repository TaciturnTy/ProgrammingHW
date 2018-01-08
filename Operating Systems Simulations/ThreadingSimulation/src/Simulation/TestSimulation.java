/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
10/28/2017
TestSimulation.java

Description: This program is a simulation of an operating system's task 
             manager. The user specifies how many tasks to generate. When the 
             tasks are generated they are given random prioritys and execution 
             times. They are then sorted by priority and printed in a table to 
             simulate the order that an operating system would execute them.
*/
package Simulation;
import java.util.*;
import Task.*;                                                                  //import nameofpackage.nameofclass
import java.io.*;

public class TestSimulation 
{
    public static void main(String[] args)throws FileNotFoundException 
    {
        Scanner console = new Scanner(System.in);
        System.out.println("This program simulates an operating system's scheduler."
                       + "\nTasks will be generated and their execution times will be "
                       + "\nsimulated with both single-threading and multi-threading.\n");
        
        System.out.print("Please enter the number of tasks to generate: ");
        int numberOfTasks = console.nextInt();
        System.out.print("\nHow long does it take to swap tasks during execution?"
                       + "\nEnter time in milliseconds (e.g. 50): ");
        int sleepClause = console.nextInt();

        System.out.print("\n");

        //initialize task list
        TaskList STTaskList = new TaskList(numberOfTasks);                 
        
        //copy tasks from single threaded task list
        TaskList MTTaskList1 = new TaskList(STTaskList, 0, numberOfTasks / 2);                                  
        TaskList MTTaskList2 = new TaskList(STTaskList, numberOfTasks / 2, numberOfTasks); 
        
        STTaskList.sortTaskList(0, STTaskList.list.length - 1);                 //sorts the TaskList by echelon and priority
        MTTaskList1.sortTaskList(0,  MTTaskList1.list.length - 1);              //sorts the TaskList by echelon and priority
        MTTaskList2.sortTaskList(0,  MTTaskList2.list.length - 1);              //sorts the TaskList by echelon and priority

        //print singlethreading table to console
        System.out.println("SINGLE-THREADING SIMULATION TABLE");
        STTaskList.setTimes(false, sleepClause);                                //print table for a TaskList running with a sleepClause of 100ms in a single thread
        STTaskList.print();
        
        //write singlethreading table to output file
        PrintWriter outFileSingle = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Output_Singlethreading.txt")));
        outFileSingle.println("SINGLE-THREADING SIMULATION TABLE");
        STTaskList.write(outFileSingle);
        
        //print multithreading table 1 to console
        System.out.println("MULTI-THREADING THREAD 1 SIMULATION TABLE");
        MTTaskList1.setTimes(true, sleepClause);                                //print table for a TaskList running with a sleepClause of 100ms on multiple threads
        MTTaskList1.print();   

        //write multithreading table 1 to output file
        PrintWriter outFileMulti1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Output_Multithreading_Thread_1.txt")));
        outFileMulti1.println("MULTI-THREADING THREAD 1 SIMULATION TABLE");
        MTTaskList1.write(outFileMulti1);   
        
        //print multithreading table 2 to console
        System.out.println("MULTI-THREADING THREAD 2 SIMULATION TABLE");
        MTTaskList2.setTimes(true, sleepClause);                                //print table for a TaskList running with a sleepClause of 100ms on multiple threads
        MTTaskList2.print();   

        //write multithreading table 2 to output file
        PrintWriter outFileMulti2 = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Output_Multithreading_Thread_2.txt")));
        outFileMulti2.println("MULTI-THREADING THREAD 2 SIMULATION TABLE");
        MTTaskList2.write(outFileMulti2);   
    }
}