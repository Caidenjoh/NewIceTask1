/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetask1;

import java.util.Scanner;

/**
 *
 * @author caide
 */
public class Reptile extends Animal {
    // Declarations
    private double bloodTemp;
    
    
    public void inputReptile(){
        
        super.inputDetails();
        Scanner tr = new Scanner(System.in);
        System.out.println("Please enter the Blood Temperature: ");
        bloodTemp = tr.nextInt();
        
    }
    
    
    public void outputReptile(){
        
        super.outputDetails();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}
