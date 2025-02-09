//Guilherme Simao 3137464
package Griffith;

import java.util.Scanner;

public class Controls {

	public static void main(String[] args) {
		
		/*
		 * task one 
		 */
	 /*
	  *		here i used the scanner to get from the user what type of calculation and the values. With the conditional "if" and "else" the
	  *code can perform the calculation
	  */
		/*
		System.out.println("Commands: Add, Sub, Div");
		System.out.println("Enter Command and two numbers e.g. (Add 1 4):");
		Scanner myCommand = new Scanner(System.in);
		int command = myCommand.next().charAt(0);
		int numone = myCommand.nextInt();
		int numtwo = myCommand.nextInt();
		
		//conditionals for different calculations 
		if ( command == 115 || command == 83 )
		{
			double result3 = numone - numtwo;
			System.out.println("Result:"+ result3);
		}
		
		else if (command ==  97 || command == 65)
		{
			double result = numone + numtwo;
			System.out.println("Result:"+ result);
		 
		}
		else if (numtwo == 0)
		{
			System.out.println("Cannot dived by 0");
		}
		else if (  command == 100 || command == 68  )
		{
			double result2 = numone / numtwo;
			System.out.println("Result:"+ result2);
		}
		
		*/
		
		//task two
		/*
		 * here i used a string named encoded so i can work with it inside the loop to get the result
		 */
		/*
		System.out.println(" Enter the amount of positions");
		Scanner myNumofpositions = new Scanner(System.in);
		int numofposition = myNumofpositions.nextInt();
		
		System.out.println("Enter a word to encode");
		Scanner myText = new Scanner(System.in);
		String text = myText.next();
		String encoded = "";
		char alphabet;
		//the index here starts at position 0 (first Letter) and goes through each letter stopping in the last one
		for(int i=0 ; i < text.length() ; i++)
		{
			alphabet = text.charAt(i);
			
			if(alphabet >= 'a' && alphabet <= 'z')
			{
				alphabet = (char) (alphabet + numofposition);
				if(alphabet > 'z' )
				{
					//that's for the letter change back to a after z
					alphabet = (char) ('a' - 'z' - 1) ;
				}
				encoded = encoded + alphabet;
			}
			//same for upper case letters 
			else if(alphabet >= 'A' && alphabet <= 'Z')
			{
				alphabet = (char) (alphabet + numofposition);
				if(alphabet > 'Z' )
				{
					alphabet = (char) ('A' - 'Z' - 1) ;
				}
				encoded = encoded + alphabet;
			}
			
			else
			{
				encoded = encoded + alphabet;
			}
		
		
		}
		System.out.print(encoded);
		
		
		
		 */
		//task three
		/*
		 * i stablished a randon character which with simples "ifs" and "if elses" conditions the user can try to guess which line it is 
		 */
		
		/*
	    var letter =  Math.floor(Math.random() *(122 - 97 + 1) + 97);
		int guesses = 0;
	    
		// with this loop tha game keeps going on till it hits the break part (when the user get the right answer)
	    while (true)
	    {
		System.out.println(" Enter a guess");
		Scanner Guess = new Scanner(System.in);
		int guess = Guess.next().charAt(0);
		guesses++;
        
		//conditionals to print if the user is near from the value or not 
			if (guess > letter + 5 || guess < letter - 5)
			{
			   System.out.println("cold");
			   continue;
			}
		
			else if(guess == letter + 2 || guess == letter + 1 || guess == letter - 1 || guess == letter - 2 )
			{
				System.out.println("Hot");
				continue;
			}
		
			else if(guess == letter + 4 || guess == letter + 3 || guess == letter -3 || guess == letter - 4)
			{
				System.out.println("Warm");
				continue;
			}
		   
			else if(letter == guess)
			{
				System.out.println("Correct");
				System.out.println("You guessed the letter in " + guesses + "guesses");
				break;
			}
	    }
	    
		//task four
	    /*
	     * after getting the information from the user i needed to create 3 loops so i cold display the information
	     * right
	     */
		
		//System.out.println("Enter a pattern:");
		//Scanner Pattern = new Scanner (System.in);
		//String pattern = Pattern.nextLine();
		
		System.out.println("Enter a start amount:");
		Scanner Startamount = new Scanner (System.in);
		int startamount = Startamount.nextInt();
		
		System.out.println("Enter a end amount:");
		Scanner Endamount = new Scanner (System.in);
		int endAmount = Endamount.nextInt();
		//one the first one a said that my index would increase by one till it hits the "end amount" 
		for( int i  = startamount; i <= endAmount; i++)
		{
		  //that was to shape the empty space before the pattern
		  for(int j = endAmount; j > i; j--)
		  {
			 System.out.print("_"); 
		  }
		  for(int j = 0; j <= i ; j++)
		  {
			  System.out.print("|_|");
		  }
		  System.out.println("");
		}
			
			
		
	
		
		
			
	    }
	
		
	
	
	
	
	
	}
			
			

		
		
		
	

