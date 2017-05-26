/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Cobra
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<Student> student = new ArrayList<>();
        
        //Student st1 = new Student(1, "Rubio", 9);
        student.add(new Student(1, "Rubio", 9));
        student.add(new Student(2, "Bruggeling", 10));
        student.add(new Student(3, "Garcias", 7));
        student.add(new Student(4, "Zara", 6));
        
        Collections.sort(student, new StudentComparatorNr());
        
        for (Student st : student) {
            System.out.println(st.getStudentNr());
        }
        
        Collections.sort(student, new StudentComparatorNaam());
        for (Student st : student) {
            System.out.println(st.getLastName());
        }
        Collections.sort(student, new StudentComparatorAverage());
        for (Student st : student) {
            System.out.println(st.getAverageGrade());
        }
        
       
        
        
    }
    
}
