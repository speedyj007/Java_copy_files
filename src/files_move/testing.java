
package files_move;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testing {

public static void main(String [] args)
    
{
    try{
    
        String src = System.getProperty("user.home");
        
        
        
        System.out.println("new path : "+(src.replaceAll("\\\\", "\\\\\\\\") ));
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
}
}
