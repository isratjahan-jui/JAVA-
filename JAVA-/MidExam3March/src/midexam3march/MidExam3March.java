package midexam3march;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class MidExam3March {

    public static void main(String[] args){

        File f=new File("C:\\Users\\HP\\Desktop\\read.txt");
        
        try {
            PrintWriter pw=new PrintWriter(f);
            pw.print("Hello");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MidExam3March.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s=new Scanner(f);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MidExam3March.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
}
}
