package armstrong;

public class armstrong {

	public static void main(String[] args) {
		
		//for(int i=1; i<200; i++) {
			
			int num = 153;
			int result=0;
			
			while(num!=0) {
				
				int digit = num%10;
				result = result+digit*3;
				num=num/10;
				
			}
			if(result==num) {
				System.out.println(num);
			}
		}

	}

//}
