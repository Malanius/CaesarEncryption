/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarencryption;

/**
 *
 * @author Malanius
 */
public class CaesarEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO user defined input
        String input = "Ahoj.";
        String encrypted = "";
        int offset = 1;
        for (char c : input.toCharArray()) { //Start iterating the input.
            encrypted = encrypted + (char)((int)c + offset); //Saves a off  seted characer at each cycle
        } //End of iteration
        System.out.println("Encrypted sentence is: " + encrypted); //Prints the result
    } //End of main

} //End of class
