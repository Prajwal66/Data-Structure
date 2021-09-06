
import java.util.Stack;
class balancechecking {
   public static void main(String[] args) {
      balancechecking bs = new balancechecking();
      System.out.println(bs.ispar("()"));      
   }  
   boolean ispar(String x)
   {
      Stack<Character> stack = new Stack<>();

      for(int i = 0; i<x.length();i++)
      {
         if(x.charAt(i) == '(')
         {
            stack.push(')'); 
         }
         
         else if(x.charAt(i) == '{')
         {
            stack.push('}');
         }
         else if(x.charAt(i) == '[')
         {
            stack.push(']');
         }
         else if(stack.isEmpty() || stack.pop() != x.charAt(i))
         {
            return false;
         }

      }
      return stack.isEmpty();      
   } 
}
