/*You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
 * This array represents a permutation of the integers from 1 to n with one element missing. 
 * Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the mis*/


package interviewQuestions;

import java.util.Arrays;

public class FindMissingNoInArray {

	public static void main(String[] args) {
			        
		        int[] a = {1};  // Example input array
		     int n = a.length+1;
		     int sum = n*(n+1)/2;
		     
		     int aSum =0;
		     for(int k : a)
		     {
		    	 aSum=aSum+k;
		     }
		    	int ans= sum - aSum;
		    	
		    	System.out.println(ans);
	
		    
		    	    }
		    	
		
		
	}
