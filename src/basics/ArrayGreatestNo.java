package basics;

public class ArrayGreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][]={{2,3,7},{9 ,1 ,3},{6, 0, 1}};
		int minval=array[0][0];
		int mincol = 0;
		/*
		2 3 7
		9 0 3
		6 8 1
		*/
		
		for(int i=0;i<3 ;i++) {
			
			for(int j=0;j<3;j++)
			{
				
				//System.out.println(array[i][j]);
				
				if(array[i][j]< minval)
				{
					minval=array[i][j];
					mincol = j;
				}
				
			}
			
			
		} 
		
		System.out.println(minval);
		int k = 0;
		int maxval=array[0][mincol];
		while(k<3) {
			
			
			if(array[k][mincol]>maxval) {
			
			maxval=array[k][mincol];
			
			}k++;
		}
		
		System.out.println(maxval);
	}

}
