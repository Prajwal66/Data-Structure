import java.util.Stack;
/**
 * PrefixEv
 */
public class PrefixEv {

   public static void main(String[] args) {
      PrefixEv pref = new PrefixEv();
     System.out.println(pref.prefixEvals("-+7*45+20"));

   }
   int prefixEvals(String exp)
   {
      Stack<Integer> stack = new Stack<>();
      for(int i = exp.length() - 1; i>=0;i--)
      {
         char ch = exp.charAt(i);
         if(ch == ' ')
         continue;
         if(ch == ',')
         continue;

         if(Character.isLetterOrDigit(ch))
         {
            stack.push(ch - '0');
         }
         else{
            int oprand1= stack.pop();
            int oprand2 = stack.pop();


            switch(ch)
            {
               case '+':
               stack.push(oprand1 + oprand2);
               break;

               case '-':
               stack.push(oprand1 - oprand2);
               break;

               case '*':
               stack.push(oprand1 * oprand2);
               break;

               case '/':
               stack.push(oprand1 / oprand2);
               break;

            }
         }
         
      }
      return stack.peek();
   }
   
}