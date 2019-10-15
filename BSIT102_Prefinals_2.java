import java.util.ArrayList;
import java.util.Scanner;
import java.util.Base64;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

 public class BSIT102_Prefinals_2
  {

   public static void main(String[] args) throws IOException //Handle the conversion and input a text
   {
 
   //Create an ArrayList that holds references to String
   ArrayList<String> words = new ArrayList<String>();
   
    //Scanner object to get input
   Scanner kim = new Scanner(System.in);
   
   //These first 2 lines do and why is it equal to false
   Boolean x = false;
       while(!x)
   {
 
   String arrayIN = kim.nextLine();
   if(!arrayIN.equals(":q"))
   {
   
 //Used to transfer content based
  Base64.Encoder tagaEncode = Base64.getEncoder();

 //Given String
  String paencode;
  
  //Convert the given String to Base64
  paencode = tagaEncode.encodeToString(arrayIN.getBytes());
 
 //to add the word in ArrayList
  words.add(paencode);
  System.out.println(paencode);
   }
   else
   {
   x = true; //this function is to stop the condition
   }
      }
     
      //Displaying elements
      System.out.println("Do you want to save your file? ");
        System.out.println("Yes or No? ");
        String pasave = kim.nextLine();
       
       if(pasave.equals("yes"))
        {
       
       	//Any change in array element will change the ArrayList elements also
        System.out.println("Enter your file name: ");
   String Input_Filename = kim.nextLine();
   Writer fw = new FileWriter(Input_Filename+".knm");
  
   //Printing list of  String arrays in the ArrayList
   for(String a: words)
   {
   fw.write(a); //to get the encrypted word and to transfer the file
        }
       
        fw.close();
        }
        else
        {
        System.out.println("yes"); //Displaying elements
        }
   
  }
  }
