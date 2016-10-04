package hpgame;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Random;

public class Character {
	   public static String CharName;
	   public static String hogHouse;
	   
	   public static void AskName()
	   {
	      LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
	      
	      System.out.print("\n\n\n\tHello there! What is your name?\t");

	      try { CharName = cin.readLine(); }
	      catch (IOException e) { System.err.println("Error."); } 
	      
	      System.out.print("\n\tOkay, " 
	           + CharName + " let's go!!!\n\n\n\t"); 
	           
	      PAUSE();
	   }

	   public static void PAUSE()
	   {
	          String CONTINUE = "";
	          LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
	          while(CONTINUE == "")
	          {    
	                System.out.print("\n\n\tPaused. Press ENTER to continue.   ");
	                System.out.println("\n\n\n\n\n");
	                try { CONTINUE = cin.readLine(); }
	                catch (IOException e) { System.err.println("Error."); }
	          }
	    } 
	   public static String getName() { return CharName; } 
}
