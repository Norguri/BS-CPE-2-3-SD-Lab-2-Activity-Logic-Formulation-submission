public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8}; 
        int max = numbers[0];                             
        
        for (int i = 1; i < numbers.length; i++) {  //we start iterating from index 1 (i = 1) since we have already assigned the value at index 0 to max.
            if (numbers[i] > max) {   //if statement will be used to compare each subsequent element with the current max value.
                max = numbers[i];    //and if a larger value is found, we update max accordingly.
            }
        }
        
        System.out.println("The maximum value in the array is: " + max); // Once the loop finishes, the max variable will contain the maximum value in the array.
    }
}