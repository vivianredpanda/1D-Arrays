import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.File; 

class Main {
  public static void main(String[] args) throws 
  FileNotFoundException{

    //This 1D array has been created for you with the US state names that correspond to the values of total unauthorized immigrants.
    String [] statenames = new String[51];
    Scanner myReader = new Scanner(new File("StateNames-1DArray.txt"));  
    int index = 0;
    while (myReader.hasNextLine()) {
      statenames[index] = myReader.nextLine();
      index++;
    }
    myReader.close();

    //Create a 1D String Array named "statenumbers" with length of 51 to hold the total unauthorized immigrants by state.



    //Reads the data from the Unauthorized Immigrants File.
    myReader = new Scanner(new File("StateNumbers-1DArray.txt"));
    
    //Create a while loop to add the txt file contents to the statenumbers array.
    // myReader.nextInt gets the next line in the txt file (each line should be added into the array)
  
    while (myReader.hasNextInt()) {

    }

    //Closes myReader
    myReader.close();

    //Find and print out the average number of unauthorized immigrants. 
    

    //Find the maximum and minimum values and the corresponding states using the following for loop.

    

    //Print the state with the minumum number and include its value
    
    //Print the state with maximum number and include its value
    

    //Refer to the Student Guide - Fill out the answer for question #5 before moving on.

    //If you choose to do the extension, remember to call the method in main!
  }
   

  //Extension: Create a method 'findData' that uses the state name given in the console and finds its corresponding number of unauthorized immigrants and prints the data out ** hint: use scanner, take in the arrays with state names and data
  
    
    //if the user types in an invalid name, provide them with a new prompt to enter a correct US state.
    
      
}