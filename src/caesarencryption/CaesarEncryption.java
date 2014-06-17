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
        //Variable definition
        int offset = 0;
        String input;
        String sentence;
        String encrypted = ""; //Initialization of encrypted string;

        //Get the sentence input from user
        Scanner sc = new Scanner(System.in); //Seting up scanner for user input
        System.out.print("Insert the sentence to be encrypted:\n→");
        sentence = sc.nextLine(); //User defined input sentence
        //User defined offset
        while (true) { //Start of correct input loop
            System.out.print("Specify required offset. Valid range is -25 to +25.\n→");
            input = sc.nextLine();
            try { //Try block for nput validity
                offset = Integer.parseInt(input); //Try to parse the input
                if (offset >= -25 && offset <= 25) { //Check if the input is in range (this won't proceed if input is not integer
                    break; //If it is, break the check loop and continue
                } else //If out of range
                {
                    throw new NumberFormatException(); //Induce an error
                }
            } catch (NumberFormatException e) { //If input is invalid
                System.err.println(input + " is not a valid number!"); //Inform the user that he can't do what I need from him
            } //End of catch
        } //End of correct input loop
        sentence = sentence.toLowerCase(); //encrytion only on small leters
        for (char c : sentence.toCharArray()) { //Start iterating the input.
            //encrypted = encrypted + (char)((int)c + offset); //deprecated - changed witch non-letter characters switching. (Saves a off  seted characer at each cycle)
            int chr = (int) c; //Get the ASCII code for actual character
            if (chr >= min && chr <= max) { //If it is a letter character, encrypt it by ASCII offset
                if ((chr + offset) > max) { //If the offseted character is outside lower letters max range
                    encrypted = encrypted + (char) (chr + (offset - 26)); //Then cycle the offset to the begining of range
                } else if ((chr + offset) < min) { //If the offseted character is outside begining of range
                    encrypted = encrypted + (char) (chr + (offset + 26)); //Then cycle the offset to the end of range
                } else { //otherwise
                    encrypted = encrypted + (char) (chr + offset); //Offset it in range
                } //End of offset range check
            } else {
                encrypted = encrypted + c; //Otherwise just copy it
            }//End of letter character check
        } //End of iteration

        System.out.println(
                "Encrypted sentence is: " + encrypted); //Prints the result
    } //End of main
} //End of class
