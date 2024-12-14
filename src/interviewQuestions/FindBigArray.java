package interviewQuestions;

public class FindBigArray {

    public static void main(String[] args) {
        int[] array = {120, 60, 80, 40, 90, 110};

        int big = array[0]; // Initialize with the first element of the array

        for (int i = 1; i < array.length; i++) { // Start loop from the second element
            if (array[i] > big) { // Compare current element with the largest so far
                big = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + big);
    }
}
