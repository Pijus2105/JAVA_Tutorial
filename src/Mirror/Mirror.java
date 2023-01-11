package Mirror;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

public class Mirror {

	public static void main(String[] args) {
	String normal = "abcdefghijklmnopqrstuvwxyz_,;.?!/\\'";
	String split  = "ɐqɔpǝɟbɥıظʞןɯuodbɹsʇnʌʍxʎz‾'؛˙¿¡/\\,";
	//maj
	normal += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	split  += "∀qϽᗡƎℲƃHIſʞ˥WNOԀὉᴚS⊥∩ΛMXʎZ";
	//number
	normal += "0123456789";
	split  += "0ƖᄅƐㄣϛ9ㄥ86";

	String str = "sunip";
	String newstr = ""; 
	char letter;
	for (int i=0; i< str.length(); i++) {
	    letter = str.charAt(i);

	    int a = normal.indexOf(letter);
	    newstr += (a != -1) ? split.charAt(a) : letter;
	}
	System.out.println(new StringBuilder(newstr).reverse().toString());
}
}
