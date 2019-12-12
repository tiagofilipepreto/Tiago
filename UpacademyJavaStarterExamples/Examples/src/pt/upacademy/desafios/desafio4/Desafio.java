package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static int[] ints(String string) {
		String stringarray[]= string.split(" ");
		List <Integer> result= new ArrayList<Integer>();
		
		for (int i = 0; i < stringarray.length; i++) {
			 if(stringarray[i].matches("\\d")) {
				 result.add(Integer.parseInt(stringarray[i]));
			 };
		}
		int[] result2=new int[result.size()];
		for (int j = 0; j < result.size(); j++) {
			 int num = result.get(j).intValue();
			 System.out.println(result.get(j).intValue());
				result2[j] = num;
			}
		 System.out.println(result2[2]);
		return result2;
	}
}
