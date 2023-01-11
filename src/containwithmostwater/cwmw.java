package containwithmostwater;

public class cwmw {
	
	public static int cwm(int[] a) {
		
		int area = 0; 
		
		for(int i=0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				
				area = Math.max(area, Math.min(a[i], a[j]) * (j-i));
			}
		}
		
		return area;
	}

}
