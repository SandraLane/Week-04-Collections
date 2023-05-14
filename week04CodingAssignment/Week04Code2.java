package week04CodingAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class Week04Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Quesion 1:
		int result = 0;
		ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(3);
        ages.add(9);
        ages.add(23);
        ages.add(64);
        ages.add(2);
        ages.add(8);
        ages.add(28);
        ages.add(93);
        ages.add(94);
        
        for (int i = 0; i < ages.size() - 1; i++) {
            result = ((ages.get(ages.size()-1) - ages.get(0)));

	}
        System.out.println(result);
        int length = ages.size();
        int sum = 0;
        for (int i = 0; i < ages.size(); i++) {
            sum += ages.get(i);
        }
 
        double average = sum / length;
        
        System.out.println(average);
	
	//Question 2:

		String[] names = {"Sam", "Tommy","Tim", "Sally","Buck","Bob"};
        double sum1 = 0.0;	
		
		for(int i=0;i<names.length;i++) { 
			sum1+=names[i].length();
		  
		  } double average1 = sum1 / names.length;
		  
		  System.out.println(average1);
		  //Question 3: access last element of array: array[array.length-1]
		  //Question 4: access first element of array: array[0];
		
		  
		  //Quesion 5:
		  int[] nameLengths = new int[names.length];
		  for(int i=0;i<nameLengths.length;i++) {
			  nameLengths[i] = names[i].length();
			  
		  }
		  
	
	 	//Question 6:
		  int sumNameLengths =0;
		  for(int nameLength:nameLengths) {
			  sumNameLengths += nameLength;
		  }
		  System.out.println(sumNameLengths);
		  
		//Question 7 test:  
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		//Question 8 test:

		String fullName = fulName("John", "Ride");
		System.out.println(fullName);
		
		//Question 9 test:
		System.out.println(isTotal(nameLengths));
		
		//Question 10 tests:
		double[] newAge = {5,10,13,25,33,41,18};
		System.out.println(sumAverage(newAge));
		
		//Question 11 tests:
		double[] secondNewAge = {25,31,41,43,45,51};
		System.out.println(isArr1Bigger(newAge,secondNewAge));
		
		//Question 12 tests:
		boolean isHotOutside = true;
		double moneyInPocket = 10.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//Question 13:
		boolean canDrive = true;
		double hasEnoughMoney = 14.00;
		System.out.println(canGoOnTrip(canDrive, hasEnoughMoney));
		
	}


	

		  //Question 7:
		  public static String multiplyString(String str, int num) {
			  String result = "";
			  for(int i=0;i<num;i++) {
				  result +=str;
			  }
			  return result;
		  } 
	
		  //Question 8:
		  public static String fulName(String firstName, String lastName) {
			  String lastName1 = " " + lastName;
			  firstName = firstName.concat(lastName1);
			  return firstName;
		  }


		 
		  //Question 9:
		  public static boolean isTotal(int[] numbers) {
		         int sum = 0;
		         for (int number:numbers){
		              sum += number;
		          }
		   if(sum>100)
				return true;
		   else
			   return false;
		  }
		  

		  //Question 10:
		  public static double sumAverage(double[] numbers) {
		  
		  double sum = 0.0;
	      
	      for (double number:numbers) {
	            sum += number;
	        }
	 
	        return sum / numbers.length;
			
}
		  //Question 11:
		  
		  public static boolean isArr1Bigger(double[] arr1, double[] arr2) {
			  
			  if (sumAverage(arr1) > sumAverage(arr2)) {
				 return true;
			  } else {
				  return false;
			  }
		  }
			  
			  
			  
			//Question 12:
			  
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if(isHotOutside==true && moneyInPocket>10.50)
					return true;
				else
					return false;
			}


			
			public static boolean canGoOnTrip(boolean canDrive, double hasEnoughMoney) {
				
				if(canDrive==true && hasEnoughMoney>100.00)
					
					return true;
				else
					return false;
}
}



		  
					  
				  

   

		  
		  
			
				    
				    
		  


		  




			  
			  
			  
				
	
	


	









	


