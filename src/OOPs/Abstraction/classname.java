package OOPs.Abstraction;

import java.util.StringTokenizer;

public class classname {
	
	


		public static void main(String[] args) {
			
		
//			 String str = "Maate of the Fisheries department is to increase fish production by optimum utilization of all water bodies, to create infrastructure for post harvest management, to develop an enabling eco-system for adoption of scientific pisciculture, to strive for socio- economic uplift of the fishermen at large and to ensure availability of fish at affordable cost to the masses.";
//			    String h = str.replaceAll("\\s+"," ").trim();
//			    
//			    if(h.matches(str)) {
//			    	System.out.println("Single Space");
//		    } else {
//			    	System.out.println("More Space");
//			    }
		        
			
			
			
//			
//			 String input = "Try     to remove extra spaces.";
//		        StringTokenizer substr = new StringTokenizer(input, " ");
//		        StringBuffer sb = new StringBuffer();
//		        
//		        while(substr.hasMoreElements()){
//		            sb.append(substr.nextElement()).append(" ");
//		            
//		            
//		        }
//		        
//
//              String s =  sb.toString().trim();
//		        
//		        if(s.matches(input)) {
//		        	System.out.println("Single Space");
//		        } else {
//		        	System.out.println("More Space");
//		        }
//			
//			
//			
			
			
			
			
			
			
			int arr[] = {1,0,0,1,1,0,0,1,1,0,1,0};
			
			int n =1;
			
			for(int i=0; i<arr.length; i++) {
				
				for (int j = i+1; j<arr.length; j++) {
					
					if(arr[i]==arr[j]) {
						n = n+1;
				
					} 
				}
				if(arr[i]!=0) 
				System.out.println(n);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		      
		       
		
		}
}


