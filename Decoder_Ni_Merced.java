import java.io.*;
import java.util.*;


 public class Decoder_Ni_Merced
  
{
public static void main (String[] args) throws IOException //another function to read the file
    {
Base64.Decoder pangdec = Base64.getDecoder(); //Returning the String
       
   //Displaying elements
   System.out.println("Enter your file name: ");
   Scanner kim = new Scanner(System.in);
   
   //to read my file name
   File filenikim = new File(kim.nextLine() +".knm");
   kim = new Scanner(filenikim); //display elements
 
 
   String a = kim.nextLine();
   
   //it convert the given Base64 encryption word to String
   String decoded = new String(pangdec.decode(a));
   
   //print the decoded word
   System.out.println(decoded);
   
   kim.close();
}
   
   
   
}