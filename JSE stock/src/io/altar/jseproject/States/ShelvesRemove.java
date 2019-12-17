package io.altar.jseproject.States;

public class ShelvesRemove extends State {

	@Override
	public int run() {
		if(SHELF_REP_INSTACE.isEmpty()) {
			System.out.println("Nao tem prateleiras");
			return 1;
		}
		long remove =sc.getValidLong("Id do producto",SHELF_REP_INSTACE.geAllIds());
		switch (sc.getValidInt("remover:\\n 1) sim \\n 0)nao", 0, 1)) {
		case 0:
			break;
		case 1:
			SHELF_REP_INSTACE.removeEntity(remove);
			break;
		}
		return 1;
	}

}
