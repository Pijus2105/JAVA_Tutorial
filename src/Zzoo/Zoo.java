package Zzoo;

public class Zoo {

	public static void main(String[] args) {
		String var = "zzoooo";
		
		char[] cv= var.toCharArray();
		char zo = var.charAt(0);
		
		int count=1;
		for(int i=1; i<cv.length; i++) {
			if(zo==cv[i]) {
				count++;
			}else {
				break;
			}
		}
		
		if(var.substring(count).length()==2*count) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}

//1.Create the value
//2.Value will be defined as a charArray format
//3.Value's first word will be array format
//4.Use loop for count length to charArray value
//5.Give the condition if first word of Value and Value's will same 
//6.count will be increase else break.
//7.if value and substring of count value is equal to total count print yes otherwise no
