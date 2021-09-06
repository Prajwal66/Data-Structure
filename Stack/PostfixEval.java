import java.util.Stack;  
public class PostfixEval  
{ 
 /* function which will evaluate value of a  given postfix expression */ 
   protected  static int evalPostfix(String exp) 
    { 
        Stack<Integer> st = new Stack<>(); 
          
        for(int i=0; i < exp.length(); i++) /* loop to scan all elements of the expression one by one */
        { 
            char ch = exp.charAt(i); 

            if(ch == ' ')
            {
              continue;
            }
            if(ch == ',')
            {
              continue;
            }

            else if(Character.isDigit(ch))
             /* pushing value into the stack */
             {
               int n = 0;
               while(Character.isDigit(ch))
               {
                 n = n * 10 + (int)(ch - '0');
                 i++;
                 ch = exp.charAt(i);
               }
               i--;
             
            st.push(n); 
            }
            
           
            else     /* if the operator comes it will be evaluated */
            { 
                int value1 = st.pop(); 
                int value2 = st.pop(); 
                  
                switch(ch) 
                { 
                    case '+': 
                    st.push(value2 + value1); 
                    break; 
                      
                    case '-': 
                    st.push(value2 - value1); 
                    break; 
                        
                    case '*': 
                    st.push(value2*value1); 
                    break; 
                    case '/': 
                    st.push(value2/value1); 
                    break; 
              } 
            } 
        } 
        return st.pop();   // result return  
    } 
      
    // Driver function
    public static void main(String[] args)  
    { 
      String express="2 3 1 * + 9 - "; 
      //String express1 = "32+5";
      System.out.println(evalPostfix(express));
      //System.out.println("Postfix evaluation of the given expression comes out to be :" +evalPostfix(express)); 
    } 
} 

