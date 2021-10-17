package com.incubyte.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {
	public int AddNumbers(String args)
    {
		
		if (args.isEmpty())
        {
            return 0;
        }
		 ArrayList<Character> delimeters = (ArrayList<Character>) Arrays.asList('\n', ',');
		 if (args.charAt(0) == '/')
         {
             char customDelimeter = args.charAt(2);
            
			delimeters.add(customDelimeter);
             args = args.substring(0,3);

         }
		char[] chararr = args.toCharArray();
		List<char[]> numbers = Stream.of(chararr).filter(x -> !delimeters.contains(x)).collect(Collectors.toList());
		 if (numbers.Any(x -> x == '-'))
         {
             StringBuilder stringBuilder= new StringBuilder();
             for (int i = 0;
                  i < numbers.Count;
                  i++)
             {
                 if (numbers[i] == '-')
                 {
                     stringBuilder.Append("-");
                     stringBuilder.Append(numbers[++i]);
                     stringBuilder.Append(", ");
                 }    
             }
             throw new Exception(string.Format("negatives {0} not allowed",stringBuilder.ToString()));
         }

         int sum = numbers.Sum(x => (int)Char.GetNumericValue(x));

         return sum;
     }
         


    
	public static void main(String[] args) {


	}

}
