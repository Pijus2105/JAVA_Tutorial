package closest3Numbers;



public class ThreeSum {

	public static void main(String[] args) {
		

		int arr[] = { -1, 2, 1, -4 };
	    int x = 1;
	    
	    int closestSum =  Integer.MAX_VALUE;
	    
	    for(int i =0; i<arr.length; i++) {
	    	
	    	for(int j=i+1; j<arr.length; j++) {
	    		
	    		for(int k=j+2; k<arr.length; k++) {
	    			
	    			
	    			if(Math.abs(x-closestSum) > Math.abs(x-arr[i]+arr[j]+arr[k])) {
	    				
	    			}
	    		}
	    	}
	    }
	    
	    System.out.println(closestSum);
	    

	}

}
