package basics;

public class arraysmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={3,5,9,1,4,6,8,9};
		
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]<smallest) {
				
				smallest=arr[i];
				
			}
			
			
		} System.out.println(smallest);
		
	}

}
