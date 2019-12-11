package pt.upacademy.desafios.desafio2;

import java.util.Iterator;

public class Desafio {

	public static String order(String string) {
		String stringarray[]= string.split(" ");
		String result = "";
		int count=0;
		for (int j = 0; j <= 9; j++) {
			String num =Integer.toString(j);
			for (int i = 0; i < stringarray.length; i++) {
				if (stringarray[i].contains(num)) {
					result += stringarray[i];

					if (count<stringarray.length-1) {
						result +=" ";
						count++;
					}
				}
				
			}
		}
		System.out.println(result);
		return result;
	}

}
