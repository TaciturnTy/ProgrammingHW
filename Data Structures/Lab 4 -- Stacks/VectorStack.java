
import java.util.Vector;

/**
A class of stacks whose entries are stored in a vector.
@author Frank M. Carrano
 * 
 * toString method overridden to give a better display by Charles Hoot
 * version 3.0
 */
public class VectorStack<T> implements StackInterface<T> {

    private Vector<T> stack; // last element is the top entry in stack
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public VectorStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor
    public VectorStack(int initialCapacity) {
        stack = new Vector<T>(initialCapacity);// size doubles as needed
    } // end constructor
    
        /** Adds a new entry to the top of this stack.
    @param newEntry an object to be added to the stack */
    public void push(T newEntry){
        stack.add(newEntry);
        
    }

    /** Removes and returns this stack’s top entry.
    @return either the object at the top of the stack or, if the
    stack is empty before the operation, null */
    public T pop(){
        return stack.remove(stack.size()-1);
        
    }

    /** Retrieves this stack’s top entry.
    @return either the object at the top of the stack or null if
    the stack is empty */
    public T peek(){
        return stack.get(stack.size()-1);
    }

    /** Detects whether this stack is empty.
    @return true if the stack is empty */
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    /** Removes all entries from this stack */
    public void clear(){
        stack.clear();
    }
    
/** Override the toString() method so that we get a more useful display of
     * the contents in the stack.
     * @return a string representation of the contents of the stack */
    public String toString() {
        
        String result = "Stack[ ";
        
        for (int index = 0; index < stack.size(); index++) {
            result += stack.get(index) + " ";
        } // end for
        
        result += "]*Top*";
        return result;
    }
    

} // end VectorStack
