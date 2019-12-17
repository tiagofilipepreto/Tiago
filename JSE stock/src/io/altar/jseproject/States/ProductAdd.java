package io.altar.jseproject.States;

import io.altar.jseproject.model.Products;

public class ProductAdd extends State {

	@Override
	public int run() {
		
		
		int[]ivas= {23, 13, 6};
		
			Products product = new Products() ;
				product.setNome(sc.getValue("Nome do producto"));
				int discount = sc.getInt("Colocar disconto(%):");
				product.setDiscount(discount==-1?0:discount);
				int iva = sc.getValidInt("Colocar iva(%):",ivas);
				product.setIva(iva);
				float initPrice = sc.getFloat("colocar preco inicial",false);
				product.setInitprice(initPrice);
				product.addShelvesId(addshelvesID());
				float pvp = calcoloPvp(discount,iva,initPrice);
				product.setPvp(pvp);
				
		
		
		PROD_REP_INSTACE.addEntity(product);
		return 1;
		
	}

	private float calcoloPvp (int discount,int iva,float initPrice) {
		float pv = initPrice*(1 + (float) iva/100);
		float discount1 = pv*(1* (float)discount/100);
		float pvp =pv - discount1;
		return pvp;
	}
	
	private long addshelvesID() {
		long shelvesID;
		do {
			shelvesID =sc.getValidLong("colocar id da prateleira", SHELF_REP_INSTACE.geAllIds());
	
		} while ((sc.getInt(""))==-1);
		return shelvesID;
		
	}
}
