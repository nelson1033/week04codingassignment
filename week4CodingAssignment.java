package week04;

public class week4CodingAssignment {
    public static void main(String[] args) {

        // Questions 1 Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        // a. Programmatically subtract the value of the first element in the array from the value in the last
        // element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
        // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array,
        // and have more elements).
        // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.


    	// Questions 1 Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    	// a. Programmatically subtract the value of the first element in the array from the value in the last
    	// element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
    	int resultA = ages[ages.length - 1] - ages[0];
    	System.out.println("Result of subtracting the first element from the last element in ages: " + resultA);

    	// b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array,
    	// and have more elements).
    	int[] ages2 = {15, 7, 32, 56, 4, 18, 38, 72, 103};

    	// Ensure ages2 has exactly 9 elements.
    	if (ages2.length != 9) {
    	    System.out.println("Error: ages2 should have 9 elements.");
    	    return;
    	}

    	// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
    	int resultB = ages2[ages2.length - 1] - ages2[0];
    	System.out.println("Result of subtracting the first element from the last element in ages2: " + resultB);

    	// Calculate the average age in ages2 using a loop.
    	int sum = 0;
    	for (int age : ages2) {
    	    sum += age;
    	}
    	double average = (double) sum / ages2.length;
    	System.out.println("Average age in ages2: " + average);
    	
    	
    	
    	

    	// Question 2 Create an array of String called names that
    	// contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    	// a. Use a loop to iterate through the array and calculate the average number
    	// of letters per name. Print the result to the console.
    	int totalLetters = 0;
    	for (String name : names) {
    	    totalLetters += name.length();
    	}
    	double averageLetters = (double) totalLetters / names.length;
    	System.out.println("Average number of letters per name: " + averageLetters);

    	// b. Use a loop to iterate through the array again and concatenate all the names together,
    	// separated by spaces, and print the result to the console.
    	StringBuilder concatenatedNames = new StringBuilder();
    	for (String name : names) {
    	    concatenatedNames.append(name).append(" ");
    	}
    	System.out.println("Concatenated names: " + concatenatedNames.toString().trim());
    	
    	
    	
    	

        // Question3
        // you can access the last element of an array by using the array's length and subtracting 1
        // to get the index of the last element. Here's an example using the names array from your code:

        // Question 4
        // To access the first element of an array use index 0.




        // Question 5 and 6 Create a new array of int called nameLengths. Write a loop to iterate over the
        // previously created names array and add the length of each name to the nameLengths array.
        // Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in
        // the array. Print the result to the console.

        // Create an array of String called namesArray
        String[] namesArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // Create a new array of int called nameLengths
        int[] nameLengths = new int[namesArray.length];

        // Calculate the average number of letters per name
        int totalLetters2 = 0;
        for (int i = 0; i < namesArray.length; i++) {
            // Add the length of each name to the nameLengths array
            nameLengths[i] = namesArray[i].length();
            totalLetters2 += nameLengths[i];
        }

        double averageLetters2 = (double) totalLetters2 / namesArray.length;
        System.out.println("Average number of letters per name: " + averageLetters2);

        // Concatenate all the names together, separated by spaces
        StringBuilder concatenatedNames2 = new StringBuilder();
        for (String name : namesArray) {
            concatenatedNames2.append(name).append(" ");
        }

        // Print the concatenated names
        System.out.println("Concatenated names: " + concatenatedNames2.toString().trim());

        // Print the lengths of each name
        System.out.print("Lengths of each name: ");
        for (int length : nameLengths) {
            System.out.print(length + " ");
        }

        // Write a loop to iterate over the nameLengths array and calculate the sum
        int sumOfLengths = 0;
        for (int length : nameLengths) {
            sumOfLengths += length;
        }

        // Print the sum of all elements in the nameLengths array
        System.out.println("\nSum of lengths: " + sumOfLengths);




        // Question 7 Write a method that takes a String, word, and an int, n, as arguments
        // and returns the word concatenated to itself n number of times.
        // (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

    }

    // Method for Question 7
    private static String repeatWord(String word, int n) {
        // StringBuilder to store the concatenated word
        StringBuilder result = new StringBuilder();

        // Loop n times to concatenate the word to itself
        for (int i = 0; i < n; i++) {
            result.append(word);
        }

        // Convert StringBuilder to String and return the result
        return result.toString();
        
        
        
        
        
        
        
        // Question 8 Write a method that takes two Strings, firstName and lastName, 
        //and returns a full name (the full name should be the first and the last name as a String separated by a space).
        
        // Call the method fullName with "John" and "Doe" as arguments
        String fullNameResult = fullName("John", "Doe");
        System.out.println("Full Name: " + fullNameResult);
        
        
        
        
        

        // Question 9 Write a method that takes an array of int and returns true 
        //if the sum of all the ints in the array is greater than 100.
        
        // Call the method isSumGreaterThan100 with an array of ints
        int[] intArray = {20, 30, 40, 15};
        boolean sumGreaterThan100 = isSumGreaterThan100(intArray);
        System.out.println("Is the sum of elements greater than 100? " + sumGreaterThan100);
        
        
        
        

        // Question 10 Write a method that takes an array of double and returns the average of all the elements in the array.
        // Call the method findAverage with an array of doubles
        double[] doublesArray = {1.5, 2.7, 3.8, 4.2, 5.1};
        double averageDoubles = findAverage(doublesArray);
        System.out.println("Average of doublesArray: " + averageDoubles);
        
        
        
        

        // Question 11 Write a method that takes two arrays of double and returns true if the
        //average of the elements in the first array is greater than the average of the elements in the second array.
        // Call the method isAverageGreaterThan with two arrays of doubles
        double[] firstArray = {2.5, 3.7, 4.8};
        double[] secondArray = {1.5, 2.7, 3.8, 4.2, 5.1};
        boolean averageGreaterThan = isAverageGreaterThan(firstArray, secondArray);
        System.out.println("Is the average of the first array greater than the second array? " + averageGreaterThan);
        
        
        
        

        // Question 12 Write a method called willBuyDrink that takes a boolean isHotOutside, 
        //and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        // Call the method willBuyDrink with boolean and double arguments
        boolean isHotOutside = true;
        double moneyInPocket = 15.75;
        boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("Will buy drink? " + willBuyDrink);
        
        
        
        
        
        

        // Question 13 Create a method of your own that solves a problem. 
        //In comments, write what the method does and why you created it.
        // Call the custom method myCustomMethod
        myCustomMethod();
    }

    // ... (Code for Methods)

    // Question 8 - Method to concatenate first and last name
    private static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Question 9 - Method to check if the sum of elements in an array is greater than 100
    private static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // Question 10 - Method to calculate the average of elements in an array of double
    private static double findAverage(double[] array) {
        if (array.length == 0) {
            System.out.println("Error: Array is empty.");
            return 0;
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Question 11 - Method to compare the average of two arrays of double
    private static boolean isAverageGreaterThan(double[] array1, double[] array2) {
        double average1 = findAverage(array1);
        double average2 = findAverage(array2);
        return average1 > average2;
    }

    // Question 12 - Method to determine if a person will buy a drink based on weather and money
    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // Question 13 - Custom method
    // This method simply prints a message to the console
    // It was created to demonstrate the ability to create and call custom methods
    private static void myCustomMethod() {
        System.out.println("This is my custom method!");
        
    }
}