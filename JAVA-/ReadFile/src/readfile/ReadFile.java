
package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadFile {

   
    public static void main(String[] args) {
       
        File f=new File("C:\\Users\\Admin\\Desktop\\read.txt");
        
        
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.print("Hello Barisal");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s =new Scanner(f);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
