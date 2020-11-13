import javax.swing.*;
import java.util.*;
/**
*
Authors :
Doruntina Demiraj
Nafie Sallahu
Zanita Rahimi
*
*/
public class Projekti
{

   public static void main(String[] args) 
   {
      
      // A string key of m distinct digits (or characters) is read
      String key = JOptionPane.showInputDialog("Type your key..."); 
      
      //A string s of length n is read
      String message = JOptionPane.showInputDialog("Type your Message...");
      
      // Number of rows of the matrix
      int rows = calculateNumberOfRows(key.length(), message.length());
      
   	// To set the temp as [x][y]
      char temp[][] = new char [key.length()][rows]; // key.length() = number of columns
      char msg[] = message.toCharArray(); // This method converts this string to a new character array.
   	
      
      for(int i =0; i < key.length() * rows; i++)
      {
         int column = (int) Math.floor(i/rows);
         int row = i % rows;
         
         // In case there aren't enough characters to fill the matrix , fill it with 'x'
         if(i > msg.length - 1) 
         {
            temp[column][row] = 'x';
         }
         else
         {
            temp[column][row] = msg[i];
         }
      }
      
      // Print row message 
      char[] keyArray = key.toCharArray();
      printKeyAndMessage(keyArray, temp, rows);
      
      
      // Sort the key and the matrix respectively 
      char[] sortedKey = key.toCharArray();
      Arrays.sort(sortedKey);
      
      char encrypted[][] = new char [key.length()][rows];
      
      for(int i = 0; i < key.length(); i++)
      {
         int index = indexOf(keyArray, sortedKey[i]); 
         
         for(int j = 0; j < rows; j++){
            encrypted[i][j] = temp[index][j];
         }
      }
      printKeyAndMessage(sortedKey, encrypted, rows); 
      printOutputWords(encrypted,rows);     
      System.exit(0);
   }
   
    /**
     * method to calculate the number of rows of a matrix 
     * @param keyLength the length of the key 
     * @param messageLength the length of the message
     * @return the number of rows
     */
   public static int calculateNumberOfRows(double keyLength, double messageLength)
   {
      return (int) Math.ceil(messageLength / keyLength);
   }	
   
   
   /**
     * @param heyStack 
     * @param needle
     * @return the array index of the matrix 
     */
   public static int indexOf(char[] heyStack, char needle)
   {
      for(int i =0; i< heyStack.length; i++){
         if(heyStack[i] == needle){
            return i;
         }
      }
      return -1;
   }
   
   /**
     * method that prints the matrix
     * @param key - the key (char)array
     * @param message - the message (char)array
     * @param rows - the number of rows of the matrix
     */
   public static void printKeyAndMessage(char[] key, char[][] message, int rows)
   {  
   
      // prints the key 
      for(int i =0; i< key.length; i++)
      {
         System.out.print(key[i] + " " );
      }
      System.out.println();
      
      // prints the dividing lines between the key and the matrix
      for(int i = 0; i< key.length*2 - 1; i++)
      {
         System.out.print("-");
      }
      System.out.println();
      
      // prints the matrix
      for (int j = 0; j < rows; j++)
      {
         for (int i = 0; i < key.length; i++)
         {
            System.out.print(message[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   /**
     * method that prints the "words" in the rows
     * @param matrix - the char matrix
     * @param rows1 - an integer 
     */

   public static void printOutputWords(char[][] matrix, int rows1)
   {
      System.out.print("The words are: ");
      
      for(int i = 0 ; i < rows1; i++) 
      {
         for(int j = 0 ; j < matrix.length;j++)
         {
            System.out.print(matrix[j][i]);
         }
         if(i < rows1 - 1)
         {
            System.out.print(" , ");
         }
      
      
      }
   }
   
}

