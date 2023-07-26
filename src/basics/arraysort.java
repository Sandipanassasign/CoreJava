package basics;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int arr[]={3,5,0,1,4,6,8,9};
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
			//	temp=arr[i];
			//	arr[i]=arr[j];
			//	arr[j]=temp;
				
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				
					
				}
				
			}
			
			
			
			}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		
		}
		
		
	}

}
