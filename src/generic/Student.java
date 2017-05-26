/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Cobra
 */
public class Student {
    
    
    private int StudentNr;
    private String lastName;
    private float averageGrade;

    public Student(int StudentNr, String lastName, float averageGrade) {
        this.StudentNr = StudentNr;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public int getStudentNr() {
        return StudentNr;
    }

    public String getLastName() {
        return lastName;
    }

    public float getAverageGrade() {
        return averageGrade;
    }
    
    
    
}
