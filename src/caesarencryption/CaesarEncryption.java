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
        // TODO user defined input and offset
        String input = "Ahoj!"; //Input placeholder
        String encrypted = ""; //Initialization of encrypted string;
        int min = (int) 'A'; //Get the ASCII code for lowest number possible
        int max = (int) 'z'; ///Get the ASCII code for highest number possible
        //System.out.printf("Min: %d, Max: %d. \n", min, max); //Deprecated, just showing numbers for ASCII codes of min and max
        // TODO user defined offset
        int offset = 1; //Offset of encryption
        for (char c : input.toCharArray()) { //Start iterating the input.
            //encrypted = encrypted + (char)((int)c + offset); //deprecated - changed witch non-letter characters switching. (Saves a off  seted characer at each cycle)
            int chr = (int) c; //Get the ASCII code for actual character
            if (chr >= min && chr <= max) { //If it is a letter character, encrypt it by ASCII offset
                encrypted = encrypted + (char)(chr + offset);
            }
            else
            {
                encrypted = encrypted + c; //Otherwise just copy it
            }//End of if/else block
        } //End of iteration
        System.out.println("Encrypted sentence is: " + encrypted); //Prints the result
    } //End of main

} //End of class
