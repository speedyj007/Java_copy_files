package files_copy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class copy_file {

    public static void main(String[] args) {

        try{
            
            Thread t1 = new Thread()
            {
                public void run() 
                {
            Path file_source = Paths.get("");
            Path file_des    = Paths.get("");
           
                    System.out.println("Started Coping...");
            
                    try {
                        Files.copy(file_source,file_des);
                    } catch (IOException ex) {
                       ex.printStackTrace();
                    }
            
            
            System.out.println("Files Copied successfully....");
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
