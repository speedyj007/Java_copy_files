
package exists_check;

import java.io.File;


public class file_exists_check {
 
    public static void main(String[] args) {
        
        try{
          String file_path = "D:\\prabeer\\Videos\\Reddit\\videos\\Sauteli_(2020)_S01E03.mkv";
            
          File file = new File(file_path);  
          
          if(file.exists())
          {
              System.out.println("File Exists ..... ");
          }
          else{
              System.out.println("File not found on selected folder....");
          }
          
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
}
