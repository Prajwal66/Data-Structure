import java.util.Stack;

class evaulatePostfix {
   public static void main(String[] args) {
      evaulatePostfix ep = new evaulatePostfix();
     System.out.println(ep.PostfixEvaulation("100 200 + 2 / 5 * 7 +"));

   }  
   static int PostfixEvaulation(String exp)
   {
      Stack<Integer> stack  = new Stack<>();

      for(int i = 0; i<exp.length();i++)
      {

         char ch = exp.charAt(i);
         if(ch == ' ')
         continue;
         if(ch == ',')
         continue;
         else if(Character.isDigit(ch))
         {
            int n = 0;
            while(Character.isDigit(ch))
            {
               n = n * 10 +(int)(ch - '0');
               i++;
               ch = exp.charAt(i);
            }
            i--;
            stack.push(n);
         }
         else{
            int oprand1 = stack.pop();
            int oprand2 = stack.pop();

            switch(ch)
            {
               case '+':
               stack.push(oprand1 + oprand2);
               break;

               case '-':
               stack.push(oprand2 - oprand1);
               break;

               case '*':
               stack.push(oprand1 * oprand2);
               break;

               case '/':
               stack.push(oprand2 / oprand1);
               break;
            }
            
         }
      }
      return stack.pop();
   } 
}
