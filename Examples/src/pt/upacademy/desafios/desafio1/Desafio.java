package pt.upacademy.desafios.desafio1;

public class Desafio {
	private int count;
	private int Big3;
	private int Big5;
	public Desafio(int i) {
		this.count=i;
	}

	public void run() {
		for (int i = 1; i <= count; i++) {
			if (i%3==0) {
				Big3 +=1;
			}
			if (i%5==0) {
				Big5 +=1;
			}
		}
	}

	public int getBig3Count() {
		
		return Big3;
	}

	public int getBig5Count() {
		// TODO Auto-generated method stub
		return Big5;
	}

}
