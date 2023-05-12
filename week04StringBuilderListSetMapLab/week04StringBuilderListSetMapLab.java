package week04StringBuilderListSetMapLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;



public class week04StringBuilderListSetMapLab {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
				StringBuilder character = new StringBuilder();
				for(int i=0; i<10;i++) {
					character.append(i);
					if(i!=9) {
						character.append("-");
						
				
					
				
				System.out.println(character.toString());
	 
	

				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
				List<String> strings = new ArrayList<String>(); {
				strings.add("I have a donut");
				strings.add("I will have another donut tomorrow");
				strings.add("I will have another donut the next day after thqt");
				strings.add("I may have a donut the next day for the rest of my life");
				strings.add("Donuts everday");
				

				


				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
				System.out.println(getShortString(strings));
				
				
	
				

				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
				List<String> swapped = switchString(strings);
				for (String string:swapped) {
				System.out.println(strings);
				}
				}
					}
				}
	}
				
				
				
	
				
			//	5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				//			separated by a comma
			//	System.out.println(concatenateString(swapped));

				
				
				
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
				//	List<String> append = search(strings, "z"); {
				//	for(String result:append) {
					//	System.out.println(result);}
						
					
					
					
					
					
			
					
				
				
					
				
				
	
			
					
	
					

				
	//			private static// List<String> //search(List<String> strings, String string) {
		// TODO Auto-generated method stub
	//	//return strings;
			//	}
	
				
				
				
				
					
					










				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
				List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,15,16,20,25,30);
				List<List<Integer>> sortedNumbers = returnList(numbers);
				
				for (List<Integer> list: sortedNumbers) {
					for (Integer number: list) {
						System.out.println(number);
					}
					System.out.println("Next list ----------------");
				}


				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
				System.out.println("\nQuestion 8:");
				List<Integer> stringsLengths = calculateStringLengths(strings);
				for (Integer i : stringsLengths) {
					System.out.println(i);
				}


				
				// 9. Create a set of strings and add 5 values
				System.out.println("\nQuestion 9:");
				Set<String> set = new HashSet<String>();
				set.add("Hello");
				set.add("World");
				set.add("Goodbye");
				set.add("Hi");
				set.add("Hello again");
				for (String word : set) {
					System.out.println(word);
				}

				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
				System.out.println("\nQuestion 10:");
				Set<String> startsWithH = findAllThatStartWith(set, 'H');
				for (String word : startsWithH) {
					System.out.println(word);
				}
				


				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
				System.out.println("\nQuestion 11:");
				List<String> resultList = convertSetToList(set);

				for (String listString : resultList) {
					System.out.println(listString);
				}
			
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
				System.out.println("\nQuestion 12:");
				Set<Integer> integerSet = new HashSet<Integer>();
				integerSet.add(3);
				integerSet.add(4);
				integerSet.add(8);
				integerSet.add(33);

				Set<Integer> extractedEvens = extractEvens(integerSet);
				for (Integer number : extractedEvens) {
					System.out.println(number);
				}


				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
				System.out.println("\nQuestion 13:");
				Map<String, String> dictionary = new HashMap<String, String>();
				dictionary.put("Apple", "A crunchy fruit. Usually red, green, or yellow");
				dictionary.put("Banana", "A yellow fruit which you peel before eating");
				dictionary.put("Java", "A programming language created in 1995 and still heavily used today");
				System.out.println(dictionary);
			
			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
				System.out.println("\nQuestion 14:");
				String value = lookupValue(dictionary, "Kiwi");
				System.out.println("Dictionary Result for 'Kiwi': " + value);


				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				
				System.out.println("\nQuestion 15:");
				Map<Character, Integer> counts = countStartingLetters(resultList);
				for (Character character : counts.keySet()) {
					System.out.println(character + " - " + counts.get(character));
				}

			
			
			
			
			// Method 15:
				public static Map<Character, Integer> countStartingLetters(List<String> list) {
					Map<Character, Integer> results = new HashMap<Character, Integer>();

					for (String string : list) {
						char c = string.charAt(0);
						if (results.get(c) == null) {
							results.put(c, 1);
						} else {
							results.put(c, results.get(c) + 1);
						}
					}

					return results;
				}
			
			
			
			// Method 14:
				public static String lookupValue(Map<String, String> map, String string) {
					for (String key : map.keySet()) {
						if (key.equals(string)) {
							return map.get(key);
						}
					}
					return "";
				}
			

			
			// Method 12:
				public static Set<Integer> extractEvens(Set<Integer> set) {
					Set<Integer> results = new HashSet<Integer>();
					for (Integer number : set) {
						if (number % 2 == 0) {
							results.add(number);
						}
					}
					return results;
				}
			

			
			// Method 11:
				public static List<String> convertSetToList(Set<String> set) {
					List<String> results = new ArrayList<String>();

					for (String string : set) {
						results.add(string);
					}

					return results;
				}
			


			// Method 10:
				public static Set<String> findAllThatStartWith(Set<String> set, char c) {
					Set<String> results = new HashSet<String>();

					for (String string : set) {
						if (string.charAt(0) == c) {
							results.add(string);
						}
					}

					return results;
				}
			

			
			// Method 8:
				public static List<Integer> calculateStringLengths(List<String> list) {
					List<Integer> lengths = new ArrayList<Integer>();
					for (String string : list) {
						lengths.add(string.length());
					}
					return lengths;
				}
				
				
			

			
			// Method 7:
				public static List<List<Integer>> returnList(List<Integer> list) {
					List<List<Integer>> results = new ArrayList<List<Integer>>();
					results.add(new ArrayList<Integer>());
					results.add(new ArrayList<Integer>());
					results.add(new ArrayList<Integer>());
					results.add(new ArrayList<Integer>());
					
					for(Integer i:list) {
						if(i%2==0) {
							results.get(0).add(i);
						}
						if(i%3==0) {
							results.get(1).add(i);
						}
						if(i%5 ==0) {
							results.get(2).add(i);
						}
						if(i%2!=0 && i%3!=0 && i%5!=0) {
							results.get(3).add(i);
						}
					}
					return results;
				}


						
				
						

			
			// Method 6:
			public static List<String>  containsAllStrings(List<String> list, String append) {
				List<String> results = new ArrayList<String>();
				for (String string: list) {
					if(string.contains(append)) {
						results.add(string);
		}
				}
				return results;
	
			}
				
	
			
			

			
			// Method 5:
		public static String concatenateString(List<String> list) {
			StringBuilder string = new StringBuilder();
			for(int i=0; i<string.length(); i++) {
				string.append(i);
				string.append(",");
			}
				return string.toString();
		
		}
		

			
			
			
			// Method 4:
		public static List<String> switchString(List<String> list) {
			String temp = list.get(0);
			list.set(0, list.get(list.size()-1));
			list.set(list.size() -1, temp);
			return list;
		
		
		}	

		
		
			
			
			
			// Method 3:
			public static String getShortString(List<String> list) {
				String shortest = list.get(0);
				for (String string:list) {
					if (string.length() < shortest.length()) {
					shortest = string;
				}
				
				}
				return shortest;
			
	
			
			}
				}

				
			
			

		
	


