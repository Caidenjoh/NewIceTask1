/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetask1;

/**
 *
 * @author caide
 */
public class IceTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarations
        Bird brd = new Bird();
        Reptile rept = new Reptile();
        
        System.out.println("Please input details for Bird:");
        brd.inputBird();
        System.out.println("Please input details for Reptile:");
        rept.inputReptile();

        System.out.println("Bird details:");
        brd.outputBird();
        System.out.println("Reptile details:");
        rept.outputReptile();
        
    }
    
}
