public class StackofIntegers 
{
    private int[] elements;
    private int size;

    public StackofIntegers()
    {
        this.elements = new int[10];
        this.size = 0;
    }

    public StackofIntegers(int size)
    {
        this.elements = new int[size]; 
    }

    public boolean empty()
    {
        if (this.size == 0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public int peek()
    {
        //largest index of array is length-1
        return this.elements[this.size-1];
    }

    public void push(int value)
    {
        this.elements[this.size] = value;
        this.size +=1;
    }

    public int pop()
    {
       int topValue = this.elements[this.size-1];
       this.size -=1;
       return topValue;
    }

    public int getSize() 
    {
        return this.size;
    }

    public void printStack()
    {
        for (int i=0;i<this.size;i++) 
        {
            System.out.print(this.elements[i]+" ");
        }
    }
}
