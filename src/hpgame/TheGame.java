package hpgame;

import java.util.*;
import javax.swing.*;
import java.io.*;

public class TheGame {

	public static final int QUIT = 0; 
    public static final int COMMONROOM = 1; 
    public static final int POTIONS = 2; 
    public static final int CHARMS = 3; 
    public static final int DEFENSEAGAINST = 4; 
    public static final int FLYING = 5;
    public static final int MAINHALL = 6;
    
    public static int location;    
    public static boolean Continue;
    public static boolean successful;

	public static void main(String[] args) {
		// globals for various game events
		 
	   
	     Events Game = new Events();
	     Continue = true; 
         Game.InitializeGlobals();
         Character CurrentPlayer = new Character();
         CurrentPlayer.AskName();
         
         Game.Introduction();
         location = Game.MAINHALL(CurrentPlayer);
         while(Continue && (Game.gamesLeft > 0))
         {          
              switch(location)
              {
                   case POTIONS : location = Game.POTIONS(CurrentPlayer); 
                             break;
                   case COMMONROOM : location = Game.COMMONROOM(CurrentPlayer); 
                             break;
                   case CHARMS : location = Game.CHARMS(CurrentPlayer); 
                   			 break;
                   case DEFENSEAGAINST : location = Game.DEFENSEAGAINST(CurrentPlayer); 
                             break;
                   case FLYING : location = Game.FLYING(CurrentPlayer); 
                             break;
                   case MAINHALL : location = Game.MAINHALL(CurrentPlayer);
                   			 break;
                   case QUIT : Continue = false; break;
                   
                   default : System.out.print("Not an option."); 
                             location = QUIT; 
                             break;  
             }//close switch   
        }//close while loop  
         Game.calculateWinner(CurrentPlayer);
         System.out.print("\n\tExiting a Magical Adventure!\n\n\n");    
         System.exit(0);
         
	}

}
