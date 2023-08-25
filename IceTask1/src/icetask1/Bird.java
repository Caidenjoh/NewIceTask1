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
public class Bird extends Animal {
    // declarations
    private int colour;
    
    
    public void inputBird(){
        
        super.inputDetails();
        Scanner sp = new Scanner(System.in);
        System.out.println("\nPlease enter the colour of the feather (1-Grey  2-White  3-Black): ");
        colour = sp.nextInt();
    }

   
    
    
    public void outputBird(){
        
        super.outputDetails();
        switch (colour) {
            case 1:
                System.out.println("Feather colour: Grey");
                break;
            case 2:
                System.out.println("Feather colour: White");
                break;
            case 3:
                System.out.println("Feather colour: Black");
                break;
            default:
                System.out.println("Feather colour: No Input");
                break;
        }
    }
    
    
}
