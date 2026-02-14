package trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\Desktop\\New Document.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.write("Hello Pk \n");
            pw.println("Badrul ");
            pw.println("Hasan");

            for (int i = 1; i <= 100; i++) {
                pw.println(i);

            }

            pw.close();

        } catch (FileNotFoundException e) {

        }

        try {
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                System.out.println(s.next());

            }
            s.close();
            
        }
        catch (FileNotFoundException e) {
        }

    }

}
