package GeeksOfGeeks;

import java.util.Arrays;

public class JoinSortArray {

	public static void main(String[] args) {
		
		int[] a= {2, 3, 6, 7, 9};
		int[] b= {1, 4, 8, 10};
		int k=5;
		JoinSortArray obj = new JoinSortArray();
		obj.kthElement(a, b, k);
		
	}

public int kthElement(int a[], int b[], int k) {
        
        int al=a.length;
        int bl=b.length;
        //to add two array
        int cl= al+bl;
        
        int[] c = new int[cl];
        
        for(int i=0;i<al;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<bl;i++)
        {
            c[al+i]= b[i];
        }
        
        Arrays.sort(c); //To short any array 
        for(int i=0; i<c.length;i++)
        {
        	System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("This is K:-"+ c[k]);
        
        return c[k];
}  
}
