package bainaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BainaryIO {

    public static void main(String[] args) {

        File file = new File("hello.dat");

        try {

            FileOutputStream output = new FileOutputStream(file);

//            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\new.txt");
            for (int i = 1; i <= 10; i++) {
                output.write(i);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            FileInputStream input = new FileInputStream(file);

//            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\new.txt");
            int value;
            while ((value = input.read()) != -1) {
                System.out.println(value + " ");

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        
//       notepad
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\new.txt");

            for (int i = 1; i <= 10; i++) {
                output.write(i);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\new.txt");

            int value;
            while ((value = input.read()) != -1) {
                System.out.println(value + " ");

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BainaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        note.....

    }

}
