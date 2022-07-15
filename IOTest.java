import java.util.*;
import java.io.*;

public class IOTest
{
   public static void main(String[] args) throws FileNotFoundException
   {

      System.out.println("Would you like to read a file or write a file yourself??");
      Scanner c1  = new Scanner(System.in);
      char choice = c1.nextLine().charAt(0);
      c1.close();
      if(choice == 'W' || choice == 'w')
      {
      //Write to a file      
         File f1 = new File("lolxd.txt");
      
         try
         {
            PrintWriter content = new PrintWriter(f1);
            Scanner p = new Scanner(System.in);
            
            System.out.println("Type in what you want to say: ");
            String lol = p.nextLine();
            content.println(lol);
            content.close(); //If you don't close it will not print whatever you say
            p.close();
         }
         catch(IOException e)
         {
            System.out.println("Cmon cuh");
         }
      }
      if(choice == 'r' || choice == 'R')   
      {
      //Read a file 
      
      System.out.println("Which file would you like to read?");
         Scanner rfile = new Scanner(System.in);
         String fname = rfile.nextLine();
         fname = rfile.nextLine().trim();
         File f1 = new File("");
         
         if(fname != null)
         {
            f1 = new File(fname);
         }
         else
         {
            System.out.println("LUL");
         }
      try
      {
         Scanner reader = new Scanner(f1);   //We use a new scanner and use f1 which is our old file we created writing a file.
         String inside = reader.nextLine();
         System.out.println(inside);
         reader.close();
      }
      catch(FileNotFoundException e)
      {
         System.out.println("We couldn't find the file you were looking for");
      }
      }
   }
}