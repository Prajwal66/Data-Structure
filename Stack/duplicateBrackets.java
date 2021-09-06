import java.util.Stack;

class duplicateBrackets {
   public static void main(String[] args) {
      String exp = "((a*b)+(a-b))";
      Stack<Character> stack = new Stack<>();
      for(int i = 0; i<exp.length();i++)
      {
         char ch = exp.charAt(i);
         if(ch == ')')
         {
            if(stack.peek() == '(')
            {
               System.out.println("duplicates");
               return;
            }
            else{
               while(stack.peek() != '(')
               {
                  stack.pop();
               }
               stack.pop();

            }
            
         }
         else{
            stack.push(ch);
         }
      }
      
   }
}