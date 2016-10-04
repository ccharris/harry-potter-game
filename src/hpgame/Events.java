package hpgame;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Random;


public class Events {

	 static LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
     static Random RAND = new Random();
     
     boolean unSorted;
     boolean isGryff;
     boolean isHuff;
     boolean isSlyth;
     boolean isRave;
     boolean firstPotions;
     boolean secondPotions;
     boolean thirdPotions;
     boolean firstCharms;
     boolean secondCharms;
     boolean thirdCharms;
     boolean firstDefense;
     boolean secondDefense;
     boolean thirdDefense;
     boolean firstFlying;
     boolean secondFlying;
     boolean thirdFlying;
     int gryffPoints;
     int huffPoints;
     int slythPoints;
     int ravePoints;
     int gamesLeft;
     String playerHouse;
     
	
     //---------------------------------------
     // Method to convert String to Boolean
     public boolean TrueOrFalse(String x)
     {
            if(x.equals("true"))  { return true; }
            else { return false; }
     }
   //---------------------------------------
     //Pause method
     public static void PAUSE()
     {
            String CONTINUE = "";
            while(CONTINUE == "")
            {    
                 System.out.print("\n\n\tPaused. Press ENTER to continue.   ");
                 ClearScreen(5);
                 try { CONTINUE = cin.readLine(); }
                 catch (IOException e) { System.err.println("Error."); }
            }
     }
     //---------------------------------------
     public char CIN()
     {
            String input = "";
            char WhatToDo = '#';
            try { input = cin.readLine(); }               
            catch (IOException e) { System.err.println("Error."); }
            input.toLowerCase();
            if(input.equals("")) { WhatToDo = '#'; }
            else { WhatToDo = input.charAt(0); }
            return WhatToDo;
     }
     //--------------------------------------
     //to clear screen
     public static void ClearScreen(int x)   
     { 
           for(int z = 0; z < x; z++)
           {
                 System.out.println("\n");
           }
     } 
     //--------------------------------------
     //new random
     public static int GenerateRandomNumber(int x)  { return RAND.nextInt(x) + 1; }
     //---------------------------------------
     void InitializeGlobals()
     {
          System.out.print("\t~~~ Welcome to the Harry Potter Inspired Text Adventure Game! ~~~ \n");
          unSorted = true;
          isGryff = false;
          isHuff = false;
          isSlyth = false;
          isRave = false;
          firstPotions = true;
          secondPotions = false;
          thirdPotions = false;
          firstCharms = true;
          secondCharms = false;
          thirdCharms = false;
          firstDefense = true;
          secondDefense = false;
          thirdDefense = false;
          firstFlying = true;
          secondFlying = false;
          thirdFlying = false;
          gryffPoints = 0;
          huffPoints = 0;
          ravePoints = 0;
          slythPoints = 0;
          gamesLeft = 10;
     }
     //---------------------------------------
     void Introduction()
     {
          ClearScreen(5); 
          System.out.print("\n\n\t\t\t Congrats, You're on a Magical Adventure! \n\n\n");
   
          System.out.print(
          "\tYou arrive excited at Platform 9 3/4 nervous, but excited. You're not really sure what to \n"
          + "\texpect as you look around nervously, clutching packages full of stuff you bought in Diagon Alley last week.\n"
          + "\tNo one in your family is a witch or wizard so you look around and try to spot others like you,\n"
          + "\tand you spot a little family with a girl your age clutching some odd packages as well.\n"
          + "\tYou inch towards them with your trolley, hoping that they'll attempt to cross the platform before you.\n"
          + "\tYou know you're supposed to run straight at the barrier, but you're a little unsure it'll work.\n"
          + "\tAfter a few minutes, they do indeed run straight at the barrier with their belongings, and to\n"
          + "\tyour tremenouds relief, they vanish through the barrier. You line yourself up where they were\n"
          + "\tand run straight at it. Seconds later, you hear a steam engine, and open your eyes to see the\n" 
          + "\tHogwarts Express, a ton of students running around in regular clothes and wizard clothes. You\n"
          + "\tsmile broadly, and set off towards the train. The ride goes smoothly and you've met a couple\n"
          + "\tof students your age, all of whom are nervous about the sorting ceremony, just like you.\n"
          + "\tit's a bit of a relief as the train slows down, and you arrive at Hogwarts. You step off the train.");
        
          System.out.print("\n\n\n\n\t");
        
          PAUSE();
          ClearScreen(5);           
     }
     
     int MAINHALL(Character CurrentPlayer)
     {
         int location = TheGame.MAINHALL;
         char WhatToDo = '#';
   
         if(unSorted)
         {    
             System.out.print("\n\n\n"
             + "\t" + CurrentPlayer.getName() 
             + ", nervous, you step into the Great Hall, seeing\n"
             + "\ta large head table filled with professors in full wizard wear.\n"
             + "\tYou turn and stare at seas and seas of students separated into 4 tables.\n"
             + "\tA shabby hat, the Sorting Hat, sits on a stool in the middle of the hall,\n"
             + "\tjust below the head table, its brim opens and it begins to sing. You are so\n"
             + "\tnervous that you have trouble focusing on its song, you just notice that it\n"
             + "\ttalks about 4 houses: Gryffindor, Hufflepuff, Slytherin and Ravenclaw\n"
             + "\thaving read your school books a little bit, you've learned a little about each\n"
             + "\thouse. You're nervous for your turn at the sorting hat, and hope for the house\n"
             + "\tthat you've been thinking about. In what seems like no time, your name is called\n"
             + "\tand you walk nervously up to the front, towards the sorting hat.");
             System.out.print("\n\n\n\n\t");
             
             PAUSE();
             ClearScreen(5); 
             int gryfScore = 0;
             int huffScore = 0;
             int ravScore = 0;
             int slythScore = 0;
             
             System.out.println("\n\n\n"
            		 + "\tAs the sorting hat settles down on your head, you ponder some\n"
            		 + "\tgeneral questions. Would you prefer to be:\n"
            		 + "\t(a) A contributing member on a winning team\n"
            		 + "\tor (b) Honored individually for your achievements, but on a losing team\n");
            char sortQOne = CIN();
            switch(sortQOne)
            {
              case 'a' : gryfScore += 1; huffScore += 1; break;
              case 'b' : ravScore += 1; slythScore += 1; break;
              default : System.out.print("\tYou need to select a or b"); 
                        break;              
            }
           
            System.out.println("\n\n\n"
           		 + "\tWould you rather be known for which of the following?\n"
           		 + "\ta) Your immense intelligence\n"
           		 + "\tb) Your bravery\n"
           		 + "\tc) Your loyalty to a friend\n"
           		 + "\td) Your ability to always find the best outcome");
            char sortQTwo = CIN();
            switch(sortQTwo)
            {
              case 'a' : ravScore += 1; break;
              case 'b' : gryfScore += 1; break;
              case 'c' : huffScore += 1; break;
              case 'd' : slythScore += 1; break;
              default : System.out.print("\tYou need to select a, b, c or d"); 
                        break;              
            }
            System.out.println("\n\n\n"
              		 + "\tWhich would you rather have?\n"
              		 + "\ta) An enormous library\n"
              		 + "\tb) Many adventures\n"
              		 + "\tc) A bunch of good friends\n"
              		 + "\td) A very successful career");
            char sortQThree = CIN();
            switch(sortQThree)
               {
                 case 'a' : ravScore += 1; break;
                 case 'b' : gryfScore += 1; break;
                 case 'c' : huffScore += 1; break;
                 case 'd' : slythScore += 1; break;
                 default : System.out.print("\tYou need to select a, b, c or d"); 
                           break;              
               }
            System.out.println("\n\n\n"
                 		 + "\tWhich do you prefer?\n"
                 		 + "\ta) Winning\n"
                 		 + "\tb) Having fun\n"
                 		 + "\tc) Taking Risks\n"
                 		 + "\td) Learning about the process");
               char sortQFour = CIN();
               switch(sortQFour)
                  {
                    case 'a' : slythScore += 1; break;
                    case 'b' : huffScore += 1; break;
                    case 'c' : gryfScore += 1; break;
                    case 'd' : ravScore += 1; break;
                    default : System.out.print("\tYou need to select a, b, c or d"); 
                              break;              
                  }
               if((gryfScore > huffScore) && (gryfScore > slythScore) && (gryfScore > ravScore)){
            	   isGryff = true;
            	   playerHouse = "Gryffindor";
            	   System.out.println("\tCongratulations, " + CurrentPlayer.getName() + " you have been sorted into Gryffindor!!");		   
               } else if((ravScore > gryfScore) && (ravScore > slythScore) && (ravScore > huffScore)){
            	   isRave = true;
            	   playerHouse = "Ravenclaw";
            	   System.out.println("\tCongratulations, " + CurrentPlayer.getName() + " you have been sorted into Ravenclaw!!");		   
               } else if((slythScore > huffScore) && (slythScore > gryfScore) && (slythScore > ravScore)){
            	   isSlyth = true;
            	   playerHouse = "Slytherin";
            	   System.out.println("\tCongratulations " + CurrentPlayer.getName() + " you have been sorted into Slytherin!!");		   
               } else {
            	   isHuff = true;
            	   playerHouse = "Hufflepuff";
            	   System.out.println("\tCongratulations " + CurrentPlayer.getName() + " you have been sorted into Hufflepuff!!");
               }
            
             unSorted = false;    
             PAUSE();
             ClearScreen(5);
             
             System.out.println("\n\n\n"
            		 + "\tAfter a delicious feast, and some words from Headmaster McGonagall\n"
            		 + "\tyou line up to follow your Prefects to your Common Room\n");
             if(isGryff){
            	 System.out.println("\tYou follow your prefects up to a tall tower and go up a spiral staircase to a\n"
            	 		+ "\troaring fire, stuffed armchairs, and a great view of the grounds.\n"
            	 		+ "\tYou go up to your room by climbing up the\n"
            	 		+ "\twinding mahogany staircase, decorated with crimson and gold.\n"
            			+ "\twith four other students, you quickly pick a bed and pass out, excited for the next day.\n" );
             } else if(isSlyth){
            	 System.out.println("\tYou follow your prefects down into the dungeons, into a \n"
            			 + "\tlong, low underground room with rough stone walls and ceiling, from\n"
            			 + "\twhich round, greenish lamps were hanging on chains. A fire was\n"
            			 + "\tcrackling under an elaborately carved mantelpiece ahead of them,\n"
            			 + "\tand several Slytherins were silhouetted around it in carved chairs.\n"
            			 + "\tYou look around, impressed, then head up a spiral staircase to your room\n"
            			 + "\twith four other students, where you pick a bed and pass out quickly, excited for the next day.\n");
             } else if(isHuff){
            	 System.out.println("\tYou follow your prefects down to a basement right past the kitchens\n"
             	 		+ "\tto a comfortable room decorated in yellow and black, with stuffed, oversize,\n"
             	 		+ "\tbut rather plain sofas and armchairs, surrounded by warm-colored wood tables.\n"
             	 		+ "\tTo go up to your dormitory you follow your prefect up a spiral staircase,\n"
             			+ "\twith four other students, you quickly pick a bed and pass out, excited for the next day.\n" );
              } else if(isRave){
            	  System.out.println("\tYou follow your prefects up to the top of a very high tower, and they answer\n"
            			  + "\ta riddle to get into the common room, which is a light, airy room with\n"
            			  + "\tarched windows set into the walls of our circular common room look down at\n"
            			  + "\tthe school grounds: the lake, the Forbidden Forest, the Quidditch pitch\n"
            			  + "\tand the Herbology gardens. You follow your prefect up a spiral staircase with four other \n"
            			  + "\tstudents, you quickly pick a bed in your room and fall asleep, excited for the next day.\n" );
            	  
              }
             PAUSE();
             ClearScreen(5);
             System.out.println("\tYou wake up the next day, full of energy and optimism!\n");
             PAUSE();
             ClearScreen(5);
             
         }  
         else
         {
             System.out.print("\n\n\n"
             + "\tYou return again to the main hall, where events are often held\n"
             + "\tyou should probably head off to class, so you're not late!");
         }       
             System.out.print("\tYou think about what class you have next today,\n "
             + "\tyou definitely don't want to be late, do you need to go to the\n"
             + "\tdungeons for potions, up to Defense Against the Dark Arts,\n"
             + "\toutside for flying lessons, or to find your way to charms?\n");
            
         while( WhatToDo != 'p' && 
                WhatToDo != 'c' && 
                WhatToDo != 'd' && 
                WhatToDo != 'f' &&
                WhatToDo != 'r' )
         {
                System.out.print(
                "\n\n\tWhere will you go?? (p)otions, (c)harms, (d)efense against the dark arts, (f)lying lessons,\n"
                		+ "\tor back to the common (r)oom?\n");
           
                WhatToDo = CIN(); 
           
                switch(WhatToDo)
                {
                  case 'p' : location = TheGame.POTIONS; break;
                  case 'c' : location = TheGame.CHARMS; break;
                  case 'd' : location = TheGame.DEFENSEAGAINST; break;
                  case 'f' : location = TheGame.FLYING; break;
                  case 'r' : location = TheGame.COMMONROOM; break;
                  default : System.out.print("\tYou need to select a location!"); 
                            break;              
           }
        }
             
        ClearScreen(5);
        return location;     
     }
//-----------------------------------------------
     int POTIONS(Character CurrentPlayer)
     {
         int location = TheGame.POTIONS;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou find yourself in the cool dungeons, the walls decorated by jars filled with pickled things.\n\n\n");
         if(firstPotions){
	         System.out.print(
	         "\tAs you sit down, you hear someone clear their throat and you look up to see a tall thin man, he is\n "
	         + "\twearing dark robes, and holds himself with confidence, you listen closely as he launches into an \n"
	         + "\texplanation of the class for the first time. \n");
	         System.out.println(
	        	"\t On your very first day of potions, Professor Snout, as you've learned his name is, asks a question \n"
	        	+ "\tof the class. What would I get if I added powdered root of asphodel to an infusion of wormwood?\n "
	        	+ "\tWhat is your action?\n"
	        	+ "\ta) Answer bezoar \n "
	        	+ "\tb) Answer Draught of Living Death\n"
	        	+ "\tc) Answer felix felicis \n"
	        	+ "\td) Don't answer\n"
	        		 );
	         char potionsQuestionOne = CIN();
            if(potionsQuestionOne == 'b'){
            	System.out.println("Correct, " + playerHouse + " gets 10 points!");
            	if(playerHouse == "Gryffindor"){
            		gryffPoints += 10;
            	}else if(playerHouse == "Ravenclaw"){
            		ravePoints += 10;
            	}else if(playerHouse == "Slytherin"){
            		slythPoints += 10;
            	}else if(playerHouse == "Hufflepuff"){
            		huffPoints += 10;
            	}
            } else if (potionsQuestionOne == 'd'){
            	System.out.println("\tBecause you hesistated...\n");
            	int randomRoll = randomHouse();
            	if(randomRoll == 1){
            		gryffPoints += 10;
            		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
            	}else if(randomRoll == 2){
            		ravePoints += 10;
            		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
            	}else if(randomRoll == 3){
            		slythPoints += 10;
            		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
            	}else if(randomRoll == 4){
            		huffPoints += 10;
            		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
            	}
            } else {
            	int randomRoll = randomHouse();
            	if(randomRoll == 1){
            		gryffPoints += 10;
            		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
            	}else if(randomRoll == 2){
            		ravePoints += 10;
            		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
            	}else if(randomRoll == 3){
            		slythPoints += 10;
            		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
            	}else if(randomRoll == 4){
            		huffPoints += 10;
            		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
            	}
            }
	         firstPotions = false;
	         secondPotions = true;
         } else if (secondPotions){
        	 System.out.println(
     	        	"\t It's a few weeks into potions class and you're feeling pretty confident with the subject overall,\n"
     	        	+ "\tand Professor Snout, who you've come to really like, asks a pretty tough question \n"
     	        	+ "\tof the class. What is taken from the stomach of a goat and will save you from most poisons?\n "
     	        	+ "\tWhat is your action?\n"
     	        	+ "\ta) Answer bezoar \n "
     	        	+ "\tb) Answer Draught of Living Death\n"
     	        	+ "\tc) Answer felix felicis \n"
     	        	+ "\td) Don't answer\n"
     	        		 );
     	         char potionsQuestionOne = CIN();
                 if(potionsQuestionOne == 'a'){
                 	System.out.println("Correct, " + playerHouse + " gets 10 points!");
                 	if(playerHouse == "Gryffindor"){
                 		gryffPoints += 10;
                 	}else if(playerHouse == "Ravenclaw"){
                 		ravePoints += 10;
                 	}else if(playerHouse == "Slytherin"){
                 		slythPoints += 10;
                 	}else if(playerHouse == "Hufflepuff"){
                 		huffPoints += 10;
                 	}
                 } else if (potionsQuestionOne == 'd'){
                 	System.out.println("\tBecause you hesistated...\n");
                 	int randomRoll = randomHouse();
                 	if(randomRoll == 1){
                 		gryffPoints += 10;
                 		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
                 	}else if(randomRoll == 2){
                 		ravePoints += 10;
                 		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
                 	}else if(randomRoll == 3){
                 		slythPoints += 10;
                 		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
                 	}else if(randomRoll == 4){
                 		huffPoints += 10;
                 		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
                 	}
                 } else {
                 	int randomRoll = randomHouse();
                 	if(randomRoll == 1){
                 		gryffPoints += 10;
                 		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
                 	}else if(randomRoll == 2){
                 		ravePoints += 10;
                 		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
                 	}else if(randomRoll == 3){
                 		slythPoints += 10;
                 		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
                 	}else if(randomRoll == 4){
                 		huffPoints += 10;
                 		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
                 	}
                 }
        	 
        	 secondPotions = false;
        	 thirdPotions = true;
         } else if (thirdPotions){
        	 System.out.println(
     	        	"\t You've been in potions for several months now and you really love the subject, today Professor Snout,"
     	        	+ "\t an overall solid professor, who always has an interesting new topic to discuss, asks the class \n"
     	        	+ "\ta question. What is the name of the world's strongest love potion?\n "
     	        	+ "\tWhat is your action?\n"
     	        	+ "\ta) Answer felix felicis \n "
     	        	+ "\tb) Answer amortentia\n"
     	        	+ "\tc) Answer amoratius \n"
     	        	+ "\td) Don't answer\n"
     	        		 );
     	         char potionsQuestionOne = CIN();
                 if(potionsQuestionOne == 'b'){
                 	System.out.println("Correct, " + playerHouse + " gets 20 points!");
                 	if(playerHouse == "Gryffindor"){
                 		gryffPoints += 20;
                 	}else if(playerHouse == "Ravenclaw"){
                 		ravePoints += 20;
                 	}else if(playerHouse == "Slytherin"){
                 		slythPoints += 20;
                 	}else if(playerHouse == "Hufflepuff"){
                 		huffPoints += 20;
                 	}
                 } else if (potionsQuestionOne == 'd'){
                 	System.out.println("\tBecause you hesistated...\n");
                 	int randomRoll = randomHouse();
                 	if(randomRoll == 1){
                 		gryffPoints += 20;
                 		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 20 points!\n");
                 	}else if(randomRoll == 2){
                 		ravePoints += 20;
                 		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 20 points!\n");
                 	}else if(randomRoll == 3){
                 		slythPoints += 20;
                 		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 20 points!\n");
                 	}else if(randomRoll == 4){
                 		huffPoints += 20;
                 		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 20 points!\n");
                 	}
                 } else {
                 	int randomRoll = randomHouse();
                 	if(randomRoll == 1){
                 		gryffPoints += 20;
                 		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 20 points!\n");
                 	}else if(randomRoll == 2){
                 		ravePoints += 20;
                 		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 20 points!\n");
                 	}else if(randomRoll == 3){
                 		slythPoints += 20;
                 		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 20 points!\n");
                 	}else if(randomRoll == 4){
                 		huffPoints += 20;
                 		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 20 points!\n");
                 	}
                 }
        	 thirdPotions = false;
         } else {
        	 System.out.println("There are no more potions problems for you to solve for house points!");
         }
         while(WhatToDo != 'g' && WhatToDo != 'c' && WhatToDo !='d' && WhatToDo !='f' && WhatToDo !='r')
         {                
               System.out.print(
            		   "\n\n\tWhere would you like to go next?? (c)harms, (d)efense against the dark arts, (f)lying lessons,\n"
                       		+ "\tto the (g)reat hall, or back to the common (r)oom?\n");
           
               WhatToDo = CIN(); 
                        
               switch(WhatToDo)
               {  
               case 'g' : location = TheGame.MAINHALL; break;
               case 'c' : location = TheGame.CHARMS; break;
               case 'd' : location = TheGame.DEFENSEAGAINST; break;
               case 'f' : location = TheGame.FLYING; break;
               case 'r' : location = TheGame.COMMONROOM; break;
               default : System.out.print("\tYou need to select a location!"); 
                         break;  
               }
         }
   
         ClearScreen(5); 
         return location;      
     }
     //----------------------------------------------------
     int CHARMS(Character CurrentPlayer)
     {
         int location = TheGame.CHARMS;
         char WhatToDo = '#';

         System.out.print(
                 "\n\n\tYou find yourself in a large open room, with interesting items stored along all the bookshelves.\n\n\n");
                 if(firstCharms){
        	         System.out.print(
        	         "\tA very small, older wizard peers over the class from where he is standing behind his desk on a stack of books,\n"
        	         + "\the sounds very excited, as explains the basics of what you'll be covering in charms this year!\n");
        	         System.out.println(
        	        	"\t On your very first day of charms, Professor Flitwick, as you've learned his name is, asks a question \n"
        	        	+ "\tof the class. What would happen is you cast aguamenti?\n "
        	        	+ "\tWhat is your action?\n"
        	        	+ "\ta) Answer creates a jet of water from your wand\n "
        	        	+ "\tb) Answer drains water from a pond\n"
        	        	+ "\tc) Answer cleans dirty water\n"
        	        	+ "\td) Don't answer\n"
        	        		 );
        	         char potionsQuestionOne = CIN();
                    if(potionsQuestionOne == 'a'){
                    	System.out.println("Correct, " + playerHouse + " gets 10 points!");
                    	if(playerHouse == "Gryffindor"){
                    		gryffPoints += 10;
                    	}else if(playerHouse == "Ravenclaw"){
                    		ravePoints += 10;
                    	}else if(playerHouse == "Slytherin"){
                    		slythPoints += 10;
                    	}else if(playerHouse == "Hufflepuff"){
                    		huffPoints += 10;
                    	}
                    } else if (potionsQuestionOne == 'd'){
                    	System.out.println("\tBecause you hesistated...\n");
                    	int randomRoll = randomHouse();
                    	if(randomRoll == 1){
                    		gryffPoints += 10;
                    		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
                    	}else if(randomRoll == 2){
                    		ravePoints += 10;
                    		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
                    	}else if(randomRoll == 3){
                    		slythPoints += 10;
                    		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
                    	}else if(randomRoll == 4){
                    		huffPoints += 10;
                    		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
                    	}
                    } else {
                    	int randomRoll = randomHouse();
                    	if(randomRoll == 1){
                    		gryffPoints += 10;
                    		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
                    	}else if(randomRoll == 2){
                    		ravePoints += 10;
                    		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
                    	}else if(randomRoll == 3){
                    		slythPoints += 10;
                    		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
                    	}else if(randomRoll == 4){
                    		huffPoints += 10;
                    		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
                    	}
                    }
        	         firstCharms = false;
        	         secondCharms = true;
                 } else if (secondCharms){
                	 System.out.println(
             	        	"\t It's a few weeks into charms class and you're feeling pretty confident with the subject overall,\n"
             	        	+ "\tand Professor Snout, who you've come to really like, asks a pretty tough question \n"
             	        	+ "\tof the class. What is taken from the stomach of a goat and will save you from most poisons?\n "
             	        	+ "\tWhat is your action?\n"
             	        	+ "\ta) Answer bezoar \n "
             	        	+ "\tb) Answer Draught of Living Death\n"
             	        	+ "\tc) Answer felix felicis \n"
             	        	+ "\td) Don't answer\n"
             	        		 );
             	         char potionsQuestionOne = CIN();
                         if(potionsQuestionOne == 'a'){
                         	System.out.println("Correct, " + playerHouse + " gets 10 points!");
                         	if(playerHouse == "Gryffindor"){
                         		gryffPoints += 10;
                         	}else if(playerHouse == "Ravenclaw"){
                         		ravePoints += 10;
                         	}else if(playerHouse == "Slytherin"){
                         		slythPoints += 10;
                         	}else if(playerHouse == "Hufflepuff"){
                         		huffPoints += 10;
                         	}
                         } else if (potionsQuestionOne == 'd'){
                         	System.out.println("\tBecause you hesistated...\n");
                         	int randomRoll = randomHouse();
                         	if(randomRoll == 1){
                         		gryffPoints += 10;
                         		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
                         	}else if(randomRoll == 2){
                         		ravePoints += 10;
                         		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
                         	}else if(randomRoll == 3){
                         		slythPoints += 10;
                         		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
                         	}else if(randomRoll == 4){
                         		huffPoints += 10;
                         		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
                         	}
                         } else {
                         	int randomRoll = randomHouse();
                         	if(randomRoll == 1){
                         		gryffPoints += 10;
                         		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 10 points!\n");
                         	}else if(randomRoll == 2){
                         		ravePoints += 10;
                         		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 10 points!\n");
                         	}else if(randomRoll == 3){
                         		slythPoints += 10;
                         		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 10 points!\n");
                         	}else if(randomRoll == 4){
                         		huffPoints += 10;
                         		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 10 points!\n");
                         	}
                         }
                	 
                	 secondPotions = false;
                	 thirdPotions = true;
                 } else if (thirdPotions){
                	 System.out.println(
             	        	"\t You've been in potions for several months now and you really love the subject, today Professor Snout,"
             	        	+ "\t an overall solid professor, who always has an interesting new topic to discuss, asks the class \n"
             	        	+ "\ta question. What is the name of the world's strongest love potion?\n "
             	        	+ "\tWhat is your action?\n"
             	        	+ "\ta) Answer felix felicis \n "
             	        	+ "\tb) Answer amortentia\n"
             	        	+ "\tc) Answer amoratius \n"
             	        	+ "\td) Don't answer\n"
             	        		 );
             	         char potionsQuestionOne = CIN();
                         if(potionsQuestionOne == 'b'){
                         	System.out.println("Correct, " + playerHouse + " gets 20 points!");
                         	if(playerHouse == "Gryffindor"){
                         		gryffPoints += 20;
                         	}else if(playerHouse == "Ravenclaw"){
                         		ravePoints += 20;
                         	}else if(playerHouse == "Slytherin"){
                         		slythPoints += 20;
                         	}else if(playerHouse == "Hufflepuff"){
                         		huffPoints += 20;
                         	}
                         } else if (potionsQuestionOne == 'd'){
                         	System.out.println("\tBecause you hesistated...\n");
                         	int randomRoll = randomHouse();
                         	if(randomRoll == 1){
                         		gryffPoints += 20;
                         		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 20 points!\n");
                         	}else if(randomRoll == 2){
                         		ravePoints += 20;
                         		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 20 points!\n");
                         	}else if(randomRoll == 3){
                         		slythPoints += 20;
                         		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 20 points!\n");
                         	}else if(randomRoll == 4){
                         		huffPoints += 20;
                         		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 20 points!\n");
                         	}
                         } else {
                         	int randomRoll = randomHouse();
                         	if(randomRoll == 1){
                         		gryffPoints += 20;
                         		System.out.println("\tSomeone from Gryffindor answered, and got Gryffindor 20 points!\n");
                         	}else if(randomRoll == 2){
                         		ravePoints += 20;
                         		System.out.println("\tSomeone from Ravenclaw answered, and got Ravenclaw 20 points!\n");
                         	}else if(randomRoll == 3){
                         		slythPoints += 20;
                         		System.out.println("\tSomeone from Slytherin answered, and got Slytherin 20 points!\n");
                         	}else if(randomRoll == 4){
                         		huffPoints += 20;
                         		System.out.println("\tSomeone from Hufflepuff answered, and got Hufflepuff 20 points!\n");
                         	}
                         }
                	 thirdPotions = false;
                 } else {
                	 System.out.println("There are no more potions problems for you to solve for house points!");
                 }
     
         while(WhatToDo != 'g' && WhatToDo != 'p' && WhatToDo !='d' && WhatToDo !='f' && WhatToDo !='r')
         {                
               System.out.print(
            		   "\n\n\tWhere would you like to go next?? (p)otions, (d)efense against the dark arts, (f)lying lessons,\n"
                       		+ "\tto the (g)reat hall, or back to the common (r)oom?\n");
           
               WhatToDo = CIN(); 
                        
               switch(WhatToDo)
               {  
               case 'g' : location = TheGame.MAINHALL; break;
               case 'p' : location = TheGame.POTIONS; break;
               case 'd' : location = TheGame.DEFENSEAGAINST; break;
               case 'f' : location = TheGame.FLYING; break;
               case 'r' : location = TheGame.COMMONROOM; break;
               default : System.out.print("\tYou need to select a location!"); 
                         break;  
               }
         }
   
         ClearScreen(5); 
         return location;      
     }
     //------------------------------------------------------
     int COMMONROOM(Character CurrentPlayer)
     {
         int location = TheGame.COMMONROOM;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou head back to your common room to study and sleep.\n\n\n");

         System.out.print(
         "\tYou study for as long as you can by the fire, but are soon tired, and head up to your dormitory to sleep.\n");
         PAUSE();
         ClearScreen(5);
         System.out.println("\tYou wake up the next day, full of energy and optimism!\n");
         
         
 
         while(WhatToDo != 'g' && WhatToDo != 'c' && WhatToDo !='d' && WhatToDo !='f' && WhatToDo !='p')
         {                
               System.out.print(
            		   "\n\n\tWhere would you like to go next?? (c)harms, (d)efense against the dark arts, (f)lying lessons,\n"
                       		+ "\tto the (g)reat hall, or back to the common (r)oom?\n");
           
               WhatToDo = CIN(); 
                        
               switch(WhatToDo)
               {  
               case 'g' : location = TheGame.MAINHALL; break;
               case 'c' : location = TheGame.CHARMS; break;
               case 'd' : location = TheGame.DEFENSEAGAINST; break;
               case 'f' : location = TheGame.FLYING; break;
               case 'p' : location = TheGame.POTIONS; break;
               default : System.out.print("\tYou need to select a location!"); 
                         break;  
               }
         }
   
         ClearScreen(5); 
         return location;      
     }

     int DEFENSEAGAINST(Character CurrentPlayer)
     {
         int location = TheGame.DEFENSEAGAINST;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou find yourself in the cool dungeons, the walls decorated by jars filled with pickled things.\n\n\n");

         System.out.print(
         "\tAs you sit down, you hear someone clear their throat and you look up to see a tall thin man, he is wearing dark robes, and holds himself with confidence, you listen closely "
         + "\tthe east and the west.\n\n");
     
         while(WhatToDo != 'g' && WhatToDo != 'c' && WhatToDo !='p' && WhatToDo !='f' && WhatToDo !='r')
         {                
               System.out.print(
            		   "\n\n\tWhere would you like to go next?? (c)harms, (d)efense against the dark arts, (f)lying lessons,\n"
                       		+ "\tto the (g)reat hall, or back to the common (r)oom?\n");
           
               WhatToDo = CIN(); 
                        
               switch(WhatToDo)
               {  
               case 'g' : location = TheGame.MAINHALL; break;
               case 'c' : location = TheGame.CHARMS; break;
               case 'p' : location = TheGame.POTIONS; break;
               case 'f' : location = TheGame.FLYING; break;
               case 'r' : location = TheGame.COMMONROOM; break;
               default : System.out.print("\tYou need to select a location!"); 
                         break;  
               }
         }
   
         ClearScreen(5); 
         return location;      
     }
     int FLYING(Character CurrentPlayer)
     {
         int location = TheGame.FLYING;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou find yourself in the cool dungeons, the walls decorated by jars filled with pickled things.\n\n\n");

         System.out.print(
         "\tAs you sit down, you hear someone clear their throat and you look up to see a tall thin man, he is wearing dark robes, and holds himself with confidence, you listen closely "
         + "\tthe east and the west.\n\n");
     
         while(WhatToDo != 'g' && WhatToDo != 'c' && WhatToDo !='d' && WhatToDo !='p' && WhatToDo !='r')
         {                
               System.out.print(
            		   "\n\n\tWhere would you like to go next?? (c)harms, (d)efense against the dark arts, (f)lying lessons,\n"
                       		+ "\tto the (g)reat hall, or back to the common (r)oom?\n");
           
               WhatToDo = CIN(); 
                        
               switch(WhatToDo)
               {  
               case 'g' : location = TheGame.MAINHALL; break;
               case 'c' : location = TheGame.CHARMS; break;
               case 'd' : location = TheGame.DEFENSEAGAINST; break;
               case 'p' : location = TheGame.POTIONS; break;
               case 'r' : location = TheGame.COMMONROOM; break;
               default : System.out.print("\tYou need to select a location!"); 
                         break;  
               }
         }
   
         ClearScreen(5); 
         return location;      
     }
     public void calculateWinner(Character CurrentPlayer){
    	 String winner = "";
    	 if ((gryffPoints > huffPoints) && (gryffPoints > slythPoints) && (gryffPoints > ravePoints)){
    		 winner = "Gryffindor";
    	 } else if ((huffPoints > gryffPoints) && (huffPoints > slythPoints) && (huffPoints > ravePoints)){
    		 winner = "Hufflepuff";
    	 } else if ((slythPoints > huffPoints) && (slythPoints > gryffPoints) && (slythPoints > ravePoints)){
    		 winner = "Slytherin";
    	 } if ((ravePoints > huffPoints) && (ravePoints > slythPoints) && (ravePoints > gryffPoints)){
    		 winner = "Ravenclaw";
    	 }
    	 System.out.println(winner + " has won the house cup!!!");
    	 if(winner.equals(playerHouse)){
    		 System.out.println("Congratulations " + CurrentPlayer.getName() + " you have won!!");
    	 } else {
    		 System.out.println("You'll get them next year");
    	 }
    	 
     }
     int randomHouse(){
    	 int n = RAND.nextInt(4) + 1;
    	 return n;
     } 
     
     
}
