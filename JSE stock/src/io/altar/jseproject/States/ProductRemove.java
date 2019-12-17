package io.altar.jseproject.States;

public class ProductRemove extends State {

	@Override
	public int run() {
		if(PROD_REP_INSTACE.isEmpty()) {
			System.out.println("Nao tem Productos");
			return 1;
		}
		long remove =sc.getValidLong("Id do producto",PROD_REP_INSTACE.geAllIds());
		switch (sc.getValidInt("remover:\\n 1) sim \\n 0)nao", 0, 1)) {
		case 0:
			break;
		case 1:
			PROD_REP_INSTACE.removeEntity(remove);
			System.out.println("Producto removido.");
			break;
		}
		return 1;
	}

}
