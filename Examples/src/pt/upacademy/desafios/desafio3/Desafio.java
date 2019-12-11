package pt.upacademy.desafios.desafio3;

public class Desafio {
	
	public static int points(String[] strings) {
		int result = 0 ;
		for (int i = 0; i < strings.length; i++) {
			String j= strings[i];
			if (j.charAt(0)>j.charAt(2)) {
				result+=3;
			}
			if (j.charAt(0)==j.charAt(2)) {
				result+=1;
			}
		}
		return result;
	}

}
