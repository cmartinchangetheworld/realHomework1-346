/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_test_practice_c311_codymartin;


/**
 *
 * @author Cody Martin
 */
public class IMP_ILinkedList<T> implements ILinkedList<T>{
    
    public T value;
    public ILinkedList<T> next;
    
    //default constructor
    public IMP_ILinkedList()
    {
        this.value = null;
        this.next = null;
    }
    
    //constructor with parameters
    public IMP_ILinkedList(T value, ILinkedList<T> next)
    {
        this.value = value;
        this.next = next;
    }
    
    /**
     * Get the next list element
     * @return the next element
     */
    @Override
    public ILinkedList<T> next()
    {
        ILinkedList<T> nextNode = next;
        return nextNode;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    @Override
    public ILinkedList<T> last()
    {
        ILinkedList<T> lastNode = next;
        while(lastNode.next() != null)
        {
            lastNode = next.next();
        }//while
        
        return lastNode;
    }//last

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    @Override
    public ILinkedList<T> after(int n)
    {
        ILinkedList<T> desiredNode = next;
        for(int i = 0; i < (n); i++)
        {
            desiredNode = next.next();
        }
        return desiredNode;
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    @Override
    public ILinkedList<T> detach()
    {
        ILinkedList<T> nodeRemoved;
        ILinkedList<T> tempNode;
        
        tempNode = next.next();
        nodeRemoved = next;
        next = tempNode;
        
        return nodeRemoved;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    @Override
    public T get()
    {
        T getValue = value;
        
        return getValue;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    @Override
    public void set(T value)
    {
        this.value = value;
    }

    /**
     * Sets the next element in the list
     * @param next the next element
     */
    @Override
    public void setNext(ILinkedList<T> next)
    {
        this.next = next;
    }

    /**
     * Sets the next element after this current element
     * @param next the next element
     */
    @Override
    public void append(ILinkedList<T> next)
    {
        ILinkedList<T> tempNode;
        
        tempNode = this.next.next();
        this.next = next;
        next = tempNode;
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     */
    @Override
    public void insert(ILinkedList<T> newFirst)
    {
        newFirst = this.next;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}