package IncrementValue;

public class incrementvalue {

	public static void main(String[] args) {
		
		int n = 110112;
		
		String str_num = Integer.toString(n);
		
		int len = str_num.length();
		
		String add = "";
		
		for (int i=0; i<len; i++) {
			
			add = add.concat("1");
		}
			int int_num = Integer.parseInt(add);

			System.out.println(n + int_num);
			
			

		

		  
		
//		        // Declaring the number
//		        int number = 110102;
//		  
//		        // Converting the number to String
//		        String string_num = Integer.toString(number);
//		  
//		        // Finding the length of the number
//		        int len = string_num.length();
//		  
//		        // Declaring the empty string
//		        String add = "";
//		  
//		        // Generating the addition string
//		        for (int i = 0; i < len; i++) {
//		            add = add.concat("1");
//		        }
//		  
//		        // COnverting it to Integer
//		        int str_num = Integer.parseInt(add);
//		  
//		        // Adding them and displaying the result
//		        System.out.println(number + str_num);
		    
		
			
		
	}

}
