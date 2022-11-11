package OOPs.Abstraction;

import java.util.StringTokenizer;

public class RemoveDuplicateString {

      public static void main(String[] args) {
		
	
		
		
    	  String input="Welcome Welcome to    Java Session Session Session am am njh njh ";  //Input String 
    	  
			 
	        StringTokenizer substr = new StringTokenizer(input, " ");
	        StringBuffer sb = new StringBuffer();
	        
	        while(substr.hasMoreElements()){
	            sb.append(substr.nextElement()).append(" ");
	            
	            
	        }
	        

        String SpaceModified =  sb.toString().trim();
	        
	        if(SpaceModified.matches(input)) {
	        	System.out.println("Single Space");
	        } else {
	        	System.out.println("More Space");
	        }
	        
	      
    	  
          String[] words=SpaceModified.split(" ");  //Split the word from String
          int wrc=1;    //Variable for getting Repeated word count
          
          for(int i=0;i<words.length;i++) //Outer loop for Comparison       
          {
             for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
             {
                
             if(words[i].equals(words[j]))  //Checking for both strings are equal
                {
                   wrc=wrc+1;    //if equal increment the count
                   words[j]="0"; //Replace repeated words by zero
                }
             }
             if(words[i]!="0")
             System.out.println(words[i]+"--"+wrc); //Printing the word along with count
           wrc=1;
           
           
		

	}

      }

	

}
