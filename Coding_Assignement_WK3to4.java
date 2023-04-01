package wk03;

public class Coding_Assignement_WK3to4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 17};
		
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length -1]);
		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//added 17
		
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		for (int age : ages) {
			sum += age;
		}
		
		double average = sum / ages.length;
		System.out.println(average);
		
	// 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		
		double averageLetters = sumOfLetters / names.length;
		System.out.println(averageLetters);
		
		//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		for (int i = 0; i < names.length; i++) {
	    	System.out.print(names[i] + " ");
	    }
		
	//3.	How do you access the last element of any array? In order to make it dynamic you need to set it to (arrayName[arrayName.length -1])
    //4.	How do you access the first element of any array? Set the position to [0] as an array starts numbers at position 0.
	
	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array	
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			
		}
	
	//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.	
		int sumNames = 0;
		for (int length : nameLengths) {
			sumNames += length;
		}
		 System.out.println(sumNames);
	
	//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	
		String word = "Tacos";
		int numTimes = 7;
		
		System.out.println(repeatWord(word, numTimes));
			
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).	
		String firstName = "Ron";
		String lastName = "Burgundy";
		
		String fullName = getFullName(firstName, lastName);
		
		System.out.println(fullName);
	
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.	
		int[] myArray = {50, 25, 75, 8};
		
		boolean result = isGreaterThan100(myArray);
		
		System.out.println(result);
		
	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.	
		double[] numbers2 = { 5, 16, 18, 37, 4 };
		double average2 = calculateAverage2(numbers2);
		System.out.println(average2);
	
		
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array	
	double[] array1 = {6, 18, 37, 22};
	double[] array2 = {30, 20, 50, 70};
	
	boolean results = compareAverages(array1, array2);
	System.out.println(results);
	
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
	boolean buyDrink = willBuyDrink(true, 15.50);
	System.out.println(buyDrink); 
	
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	int[] seniority = {1981, 1993, 2010, 2015};
	int currentYear = 2023;

	calculateYearsOfWork(seniority, currentYear);
	
	
		
	}
	
	//7. Method
	static String repeatWord(String word, int numTimes) {
		String newString = "";
		for (int i = 0; i < numTimes; i++) {
			newString += word;
		}
		
		return newString;
	}
	
	//8. Method
	static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	//9. Method
	static boolean isGreaterThan100(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum > 100;
		
	}
	
	//10. Method
	static double calculateAverage2(double[] numbers2) {
	    double sum = 0;
	    for (int i = 0; i < numbers2.length; i++) {
	        sum += numbers2[i];
	    }
	    return sum / numbers2.length;
	}

	//11. Method
	static boolean compareAverages(double[] array1, double[] array2) {
	    double sum1 = 0;
	    double sum2 = 0;
	    for (double d : array1) {
	        sum1 += d;
	    }
	    for (double d : array2) {
	        sum2 += d;
	    }
	    double avg1 = sum1 / array1.length;
	    double avg2 = sum2 / array2.length;
	    return avg1 > avg2;
	}
	
	//12. Method
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    if (isHotOutside && moneyInPocket > 10.50) {
	        return true;
	    } else {
	        return false;
	    }
	}
	    
	//13. Method:  I chose this method because at work everything we do is based on seniority.  Wanted to create something that would allow you to see the years of service quickly. 
	public static void calculateYearsOfWork(int[] seniority, int currentYear) {
	    for (int i = 0; i < seniority.length; i++) {
	        int yearsOfWork = currentYear - seniority[i];
	        System.out.println("Years of service for employee " + (i+1) + ": " + yearsOfWork);
	    }
	

	    
	    
	}
	
}

