//StringTokenizer is we can get tokens from string 

import java.util.*;
import java.io.*;

public class TokenizerDemo {

    public static void main(String[] args) throws Exception
    {
        
        String data="name=Vijay address=delhi country=india dept=cse";   
        
        //here = and space are delimeters which separate each token from one another
    
        
        StringTokenizer stk=new StringTokenizer(data,"= ");
        
        String s;
        ArrayList<Integer> al=new ArrayList<>();           

        //to print the tokens
        while(stk.hasMoreTokens())              
        {
            s=stk.nextToken();               
            al.add(Integer.valueOf(s));            //storing the tokens in ArrayList and converting int into string
            
        }
        
        System.out.println(al);

    }
    
}
