public class TestStackofIntegers 
{
    public static void main(String[] args) 
    {
        StackofIntegers stack = new StackofIntegers();
       
        for (int i=0;i<10;i++)
        {
            stack.push(i);
        }
        System.out.println("After push: ");
        stack.printStack();
        
        System.out.println();

        System.out.println("Stack Peek: "+stack.peek());
        
        System.out.println("After pop: ");
        while (!stack.empty())
        {
           System.out.print(stack.pop()+" ");
        }
    }
}
