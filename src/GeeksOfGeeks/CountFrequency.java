package GeeksOfGeeks;

public class CountFrequency {

	public static void main(String[] args) {
		int[] a= {1,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1] ||  a[i]==a[i-1])
			{
				System.out.println(false);
			}
				
		}
		System.out.println(true);
		

	}

}
