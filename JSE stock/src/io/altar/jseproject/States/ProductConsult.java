package io.altar.jseproject.States;

public class ProductConsult extends State {

	@Override
	public int run() {
		if(PROD_REP_INSTACE.isEmpty()) {
			System.out.println("Nao tem Productos");
			return 1;
		}
		System.out.println(PROD_REP_INSTACE.getEntity(sc.getValidLong("Id do producto",PROD_REP_INSTACE.geAllIds())));
		return 1;
	}

}
