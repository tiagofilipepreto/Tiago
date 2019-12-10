package pt.upacademy.exemplos.scanarUltis;

public class ScannerTest {

	public static void main(String[] args) {
		ScannersUtils sc= new ScannersUtils();
			System.out.println(sc.getValue("escreve o seu nome?"));
			System.out.println(sc.getInt("ecreve a tua idade?"));
			int[]ivas= {23,13,6};
			System.out.println(sc.getValidInt("iva",ivas));
			int max =50;
			int min =1;
			System.out.println(sc.getValidInt("entre 1 e 50",min,max));
	}

}
