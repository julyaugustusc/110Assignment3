/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby	
// FILENAME: Assignment3.java
// SPECIFICATION: 
// FOR: CSE 110- Assignment #3
// TIME SPENT: 
//----------------------------------------------------------
 * 
 */
import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		//Question 1 
		//a) x >= 0
		//b) x >= 10
		//c) x <= 10
		//d) x = 0 && y = 0
		//e) x%2 == 0
		
		//Question 2
		//a) month == 2 && day == 28
		//b) month <= 3 || month == 4 && day < 15
		
		//Question 3
		//a) word1.equals(word2)
		//b) word1.compareTo(word2) < 0
		//c) word1.substring(0,3).equals(word2.substring(0,3)) 
		
		//Part 2
		Scanner scan = new Scanner(System.in);
		
		//MY ATTEMPT 
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String fullName = "";
		
		System.out.println("What are your first, middle and last names?");
		fullName = scan.nextLine();
		
		String[] names = fullName.split("\\s+");//I HAVE NOT A CLUE HOW ELSE TO DO THIS
		int numberOfNames = names.length();//I AM ATTEMPTING TO COUNT THE WORDS BUT I CAN'T FIGURE OUT HOW
		//Here's what I was trying to do: I was attempting to count the number of inputs, and assign
		//to the appropriate string depending on if there was 2 names or 3. But since I can't figure that out, there's no point in 
		//writing this code because you said I would get zero points if I wasn't able to do that. That sucks. Way to encourage me to 
		//finish this and not get so annoyed at it that I am quitting. GIVE ME THAT WONDERFUL ZERO. :(
		
		
		
	}

}
