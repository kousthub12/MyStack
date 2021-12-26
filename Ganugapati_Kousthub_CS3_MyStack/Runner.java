import java.util.*;
public class Runner
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        StackProbs s = new StackProbs();
        Stack<Integer> i = new Stack<>();
        i.push(3);
        i.push(5);
        i.push(6);
        i.push(-7);
        i.push(-9);
        System.out.println(s.doubleUp(i));
        System.out.println(s.posAndNeg(i));
        System.out.println(s.shiftByN(i,3));
        System.out.println(s.reverseVowels("Hello how are you"));
        System.out.println(s.bracketBalance("([()[]()])()"));
       
    }
    public static Stack<Integer> nameStack(int[] nums)
    {
        Stack<Integer> stack = new Stack<>();
        for(int num:nums)
        {
            stack.push(num);
        }
        return stack;
        

    }
    
    
    
}