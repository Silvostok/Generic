/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.Comparator;

/**
 *
 * @author Cobra
 */
public class StudentComparatorAverage implements Comparator<Student>{
    
    public int compare(Student s1, Student s2){
        
      return (int)(s1.getAverageGrade() - s2.getAverageGrade());
    }
}
