package assignment;
import java.util.Arrays;
import java.util.Stack;
 
public class reverseWordsinstring {
	

	 
	  
	    static void reverse(String k)
	    {
	 
	        Stack<String> s = new Stack<>();
	        String[] token = k.split(" ");
	 
	
	        for (int i = 0; i < token.length; i++) {
	            s.push(token[i]);
	        }
	 
	        while (!s.empty()) {
	 
	     
	            System.out.print(s.peek() + " ");
	            s.pop();
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        String k = "i love myself";
	        reverse(k);
	    }
	}
	 

