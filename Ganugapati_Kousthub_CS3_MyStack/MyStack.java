import java.util.*;
public class MyStack
{
    Integer[] stack;
    int size;
    
    public MyStack()
    {
        size=0;
        stack = new Integer[1];  
    }
    public MyStack(int initCap)
    {
        this();
        stack = new Integer[initCap];
    }
    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        return false;
    }
    public Integer peek()
    {
        if(size == 0)
        {
           throw new EmptyStackException();
        }
        return stack[size-1];
    }
    public Integer pop()
    {
        if(size == 0)
        {
           throw new EmptyStackException();
        }
        
        Integer j = stack[size-1];
        size--;
        Integer[] x = new Integer[size];
        for(int i = 0;i < size;i++)
        {
            x[i] = stack[i];
        }        
        stack = x;
        
        return j;
        
    }
    public void push(Integer item)
    {      
        if (stack.length == size)
        {
            doubleCapacity();
        }
        
        Integer[] x = new Integer[size + 1];
        if (size > 0) {
            for(int i = 0;i <= size;i++)
            {
                x[i] = stack[i];
            } 
        }
        x[size] = item;
        stack = x;
        size++;
    }
    private void doubleCapacity()
    {
        Integer[] a = new Integer[size * 2];
        for(int i = 0;i < size;i++)
        {
            a[i] = stack[i];
        }
        stack = a;
        
    }
    public String toString()
    {
        String s = "";
        for(int i = size-1;i >=0;i--)
        {
            if(i == size - 1)
            {
                s = s + stack[i] + "        <----------  TOP";
            }
            else
            {
                s = s + "\n" + stack[i];
            }
            
        }
        s = s +  "\n--------";
        
        return s;
    }
    
    
}