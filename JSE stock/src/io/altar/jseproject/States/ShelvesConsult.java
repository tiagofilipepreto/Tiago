package io.altar.jseproject.States;

public class ShelvesConsult extends State {

	@Override
	public int run() {
		if(SHELF_REP_INSTACE.isEmpty()) {
			System.out.println("Nao tem prateleiras");
			return 1;
		}
		System.out.println(SHELF_REP_INSTACE.getEntity(sc.getValidLong("Id da Prateleira",SHELF_REP_INSTACE.geAllIds())));
		return 1;
	}

}
