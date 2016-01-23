//1.1: Implement an algorithm to determine if a string has all unique characters. 

import java.util.Scanner;

public class Chap01Q01
{
    public static void main(String[] args) 
    {
		String input_string; 
		Scanner scanner = new Scanner (System.in);
		char char_one;
		
		System.out.println("1.1: Implement an algorithm to determine if a string has all unique characters. ");
		System.out.print("Enter a string to check: ");  
		input_string = scanner.next(); 
		
		int string_length = 0;
		string_length = input_string.length();
		char[] character_array = new char[string_length];
		int char_array_length = 0;
		
		//Storing characters from the string into an array
		for (int i = 0; i <= (string_length-1); i++)
		{
			character_array[i] = input_string.charAt(i);
		}
		
		char_array_length = character_array.length;
		Boolean isRepeat = false;
		int count = 0;
		
		for (int j = 0; j <= (string_length-1); j++)
		{
			count = 0;
			for (int k = 0; k<= (char_array_length-1); k++)
			{
				if (input_string.charAt(j) == character_array[k])
				{
					count++;
					if (count > 1)
					{
						isRepeat = true;
					}
					
				}
			}
		}
		
		if (isRepeat == true)
		{
			System.out.println(input_string + " IS NOT a string with all unique characters.");
		}
		
		else
		{
			System.out.println(input_string + " IS a string with all unique characters.");
		}
		
		
		/*for(int j = 0; j<= (char_array_length-1); j++)
		{
			System.out.print(character_array[j]);
		}
			*/
		
		
		
		//char_one = input_string.charAt(1);
		//System.out.print("Char 1 = " + char_one);
		
		
		
	
	}
}
