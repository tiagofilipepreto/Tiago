package io.altar.jseproject.textinterface.utils;


import java.util.Scanner;

public class Utils {
	private Scanner sc = new Scanner(System.in);

	public String getValue(String msg) {
		System.out.println(msg);
		String result = sc.nextLine();
		return result;
	}

	public int getInt(String msg) {
		while (true) {
			String value = getValue(msg);
			Scanner sc2 = new Scanner(value);
			if (sc2.hasNextInt()) {
				return sc2.nextInt();
			} else {
				sc2.nextLine();
			}

			sc2.close();

		}
	}

	public int getValidInt(String msg, int[] ivas) {
		int value = getInt(msg);
		while (true) {

			for (int i = 0; i < ivas.length; i++) {
				if (value == ivas[i]) {
					return ivas[i];
				}
			}
			value = getInt("Tem de ser im valor de iva 23 ou 13 o 6.");
		}
	}

	public int getValidInt(String msg, int min, int max) {
		int value = getInt(msg);
		while (true) {
			if (value >= min && value <= max) {
				return value;
			}
			value = getInt("tente novemente");
		}

	}
}
