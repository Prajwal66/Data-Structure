import java.util.Stack;
/**
 * PostFixevaluation
 */
public class PostFixevaluation {

   public static void main(String[] args) {
      String exp = "2+3*4+5";
     System.out.println(evaluatePostFix(exp));

   }
   static Integer evaluatePostFix(String exp)
   {
      Stack<Integer> stack = new Stack<>();

      for(int i = 0; i<exp.length();i++)
      {
         char ch = exp.charAt(i);

         if(ch == ' ')
         continue;
         if(ch == ',')
         continue;

         if(Character.isLetterOrDigit(ch))
         {
            stack.push(ch -'0');
         }
         else {
            int oprand1 = stack.pop();
            int oprand2 = stack.pop();

            switch(ch)
            {
               case '+':
               stack.push(oprand2 + oprand1);
               break;

               case '-':
               stack.push(oprand2 - oprand1);
               break;

               case '/':
               stack.push(oprand2 / oprand1 );
               break;

               case '*':
               stack.push(oprand2 * oprand1);
               break;
               

            }
         }
      }
      return stack.pop();
      
   }
}