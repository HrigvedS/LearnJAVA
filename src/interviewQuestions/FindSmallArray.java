package interviewQuestions;

public class FindSmallArray {

	public static void main(String[] args) {
		int[] array= {20,80,56,55,18,6};
		
		int small=array[0];
		
		for(int i=0; i<=array.length-1;i++) {
			
			if(array[i]< small) {
				
				small= array[i];
			}
			
		}
		System.out.println(small);
		
	}

}
