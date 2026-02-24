package genericclass;

import genericclass.stu.Student;
import java.util.ArrayList;

public class GenericClass {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        
//1 rules
        list.add(new Student("jui", "jui@gmail.com"));
        list.add(new Student("jui", "jui@gmail.com"));
        list.add(new Student("jui", "jui@gmail.com"));

//        2rules
        Student s = new Student("emon", "jui@gmail.com");
        list.add(s);
//      3  
        Student s1 = new Student();
        s1.setName("pk");
        s1.setEmail("jui@gmail.com");
        list.add(s1);

        
        
        System.out.println(list);

    }

}
