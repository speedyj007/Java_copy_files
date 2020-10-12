

package files_move;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class file_move {
    
    private final static String file_src = "D:\\prabeer\\Videos\\Reddit\\Gifs\\Poonam Panday Bikini Bod.mp4";
    private final static String file_dst = "D:\\prabeer\\Videos\\youtube project\\Project_76\\Poonam Panday Bikini Bod.mp4";
    
    public static void main(String[] args) {
        
        
        try{
            
            Thread t1 = new Thread()
            {
                public void run()
                {
            try{        
            Path src = Paths.get(file_src);
            Path dst = Paths.get(file_dst);
            
            System.out.println("Moving File................");
            
            Files.move(src,dst);
            
            System.out.println("File moved successfully....");
            }
            catch(IOException e)
            {
                System.out.println("File Not Found....");
            }
                    
                }
                
            };
            t1.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
  
}
