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
        String input = "Ahoj xyzz!"; //Input placeholder
        String encrypted = ""; //Initialization of encrypted string;
        int min = (int) 'a'; //Get the ASCII code for lowest number possible
        int max = (int) 'z'; ///Get the ASCII code for highest number possible
        int asdiff = max - min;
        //System.out.printf("Min: %d, Max: %d. \nRange is: %d\n", min, max, asdiff); //Deprecated, just showing numbers for ASCII codes of min and max and range
        // TODO user defined offset
        int offset = 1; //Offset of encryption
        input = input.toLowerCase();
        for (char c : input.toCharArray()) { //Start iterating the input.
            //encrypted = encrypted + (char)((int)c + offset); //deprecated - changed witch non-letter characters switching. (Saves a off  seted characer at each cycle)
            int chr = (int) c; //Get the ASCII code for actual character
            if (chr >= min && chr <= max) { //If it is a letter character, encrypt it by ASCII offset
                if ((chr + offset) > max) { //If the offseted character is outside lower letters range
                    encrypted = encrypted + (char) (chr + (offset - 26)); //Then cycle the offset to the begining of range
                } else { //otherwise
                    encrypted = encrypted + (char) (chr + offset); //Offset it in range
                } //End of offset range check
            } else {
                encrypted = encrypted + c; //Otherwise just copy it
            }//End of letter character check
        } //End of iteration
        System.out.println("Encrypted sentence is: " + encrypted); //Prints the result
    } //End of main

} //End of class
