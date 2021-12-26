import java.util.*;
public class StackProbs
{
    public Stack<Integer> doubleUp(Stack<Integer> nums)
    {
        Stack<Integer> s = new Stack<>();
        for(int i:nums)
        {
            s.push(i);
            s.push(i);
        }
        return s;
    }
    Stack<Integer> posAndNeg(Stack<Integer> nums)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i:nums)
        {
            if(i >= 0)
            {
                stack.push(i);
            }
        }
        for(int i:nums)
        {
            if(i < 0)
            {
                stack.push(i);
            }
        }
        return stack;
        
    }
    public Stack<Integer> shiftByN(Stack<Integer> nums, int n)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = nums.size() - n;i < nums.size();i++)
        {
            s.push(nums.get(i));
        }
        for(int i = 0;i < nums.size() - n;i++)
        {
            s.push(nums.get(i));
        }
        return s;
        
    }
    public boolean isVowel(String s)
    {
        boolean isVowel = false;
        for(int i = 0;i < s.length();i++)
        {
            if(s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("o")||s.substring(i,i+1).equals("u"))
            {
                isVowel = true;
            }
            
        }
        return isVowel;
    }
    public String reverseVowels(String str)
    {
        String[] letters = new String[str.length()];
        for(int i = 0;i < str.length() - 1;i++)
        {
            letters[i] = str.substring(i,i+1);
        }
        letters[letters.length - 1] = str.substring(str.length() - 1,str.length());
        Stack<String> vowels = new Stack<>();
        for(int i = 0;i < letters.length;i++)
        {
            if(letters[i].equals("a") || letters[i].equals("e") || letters[i].equals("i") || letters[i].equals("o") || letters[i].equals("u"))
            {
                vowels.push(letters[i]);
                letters[i] = "#";
            }
            
        }
        
        
        int x = vowels.size() - 1;
        for(int i = 0;i < letters.length;i++)
        {
            if(letters[i] == "#")
            {
                letters[i] = vowels.get(x);
                x--;
            }
            
        }
        String c = "";
        for(int i = 0;i < letters.length;i++)
        {
            c = c + letters[i] + " ";
        }
        return c;
        
        
        
        
    }
    public static boolean bracketBalance(String s)
    {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) 
            {     
                stack.push(c);
            } 
            else if(c == ']') 
            {
                if(stack.isEmpty() || stack.pop() != '[') 
                {
                    return false;
                }
            } 
            else if(c == ')') 
            {
                if(stack.isEmpty() || stack.pop() != '(') 
                {
                    return false;
                }           
            } 
            else if(c == '}') 
            {
                if(stack.isEmpty() || stack.pop() != '{') 
                {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    } 
}
