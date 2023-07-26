package basics;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a = "10";
		Object b = 10;
		if(a.equals(b)) {
			System.out.println("true");
		}else
			System.out.println("f");
		
		
		/*
		 1 2 3 4 
		 5 6 7 
		 8 9
		 10	
		 
		 */
		int k=1;
		for(int j=4;j>=1;j--) {
			
			for (int i=1;i<=j;i++)
			{
				
				System.out.println(k);
				
				k++;
				
			}
			
		}
		
		
	}

}
