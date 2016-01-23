//1.6: Implement an algorithm to perform basic string compression using the counts of repeated characters.
//For example, the string aabcccccaaa would become a2b1c5a3

import java.util.Scanner;

public class Chap01Q06
{
    public static void main(String[] args) 
    {
		String input_string; 
		//String test_string = "aabcccccaaa";
		int string_length = 0;
		int string_index = 0;
		Scanner scanner = new Scanner (System.in);
		char[] character_array = new char[50];
		int[] total_counts = new int[50];
		int total_counts_index = 0;
		char[] total_char = new char[50];
		int total_char_index = 0;
		
		//System.out.print(string_length);
		System.out.println("1.6: This algorithm will complete basic string compression.");
		System.out.print("Enter a string to compress: ");
		input_string = scanner.next(); 
		int count = 1;
		
		string_length = input_string.length();
		string_index = (string_length - 1);
			
		for (int i = 0; i <= (string_length-1); i++)
		{
			character_array[i] = input_string.charAt(i);
		}
		
		for (int placement = 0; placement < string_length; placement++)
		{
			if (character_array[placement] == character_array[placement+1])
			{
				count++;
			}
			
			else
			{
				total_counts[total_counts_index] = count;
				total_char[total_char_index] = character_array[placement];
				total_counts_index++;
				total_char_index++;
				count = 1;
			}
		}
		
		for(int j = 0; j < (total_char_index); j++)
		{
			System.out.print(total_char[j]);
			System.out.print(total_counts[j]);
		}
		System.out.println();

		
	}
}
