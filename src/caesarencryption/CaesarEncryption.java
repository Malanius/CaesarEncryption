/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarencryption;

import java.util.Scanner; //Import for scanner usable for user input

/**
 *
 * @author Malanius
 */
public class CaesarEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Start of main
        //unVariables definition
        final int min = (int) 'a'; //Get the ASCII code for lowest number possible
        final int max = (int) 'z'; ///Get the ASCII code for highest number possible
        //Variavle definition
        String input = "";
        String encrypted = ""; //Initialization of encrypted string;

        //Get the sentence input from user
        Scanner sc = new Scanner(System.in); //Seting up scanner for user input
        System.out.printf("Insert the sentence to be encrypted:\n→");
        input = sc.nextLine(); //User defined input sentence
        // TODO user defined offset
        int offset = 3; //Offset of encryption
        input = input.toLowerCase(); //encrytion only on small leters
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
