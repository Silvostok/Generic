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
public class Paar<U, V> {
    
    public boolean gelijkLengte(U eerste, V tweede) {
        return eerste.toString().length() == tweede.toString().length();
    }
    
}
