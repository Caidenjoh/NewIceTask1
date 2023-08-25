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
public class Animal {
    // Declarations
    public int IDtag;
    public String species;
    
    public void inputDetails(){
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter an ID Tag: ");
        IDtag = kb.nextInt();
        kb.nextLine();
        System.out.println("\nPlease enter the species: ");
        species = kb.nextLine();
        
    }
    
    public void outputDetails(){
        
        System.out.println("ID Tag: " + IDtag);
        System.out.println("Species: " + species);
        
    }
}
