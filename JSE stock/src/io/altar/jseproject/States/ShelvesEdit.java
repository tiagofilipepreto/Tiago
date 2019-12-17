package io.altar.jseproject.States;

public class ShelvesEdit extends State {

	@Override
	public int run() {
		if(SHELF_REP_INSTACE.isEmpty()) {
			System.out.println("Nao tem prateleiras");
			return 6;
		}
		System.out.println(SHELF_REP_INSTACE.getAll()); 
		return 6;
	}

}
