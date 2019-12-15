package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Products;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.shelfRepository;
import io.altar.jseproject.textinterface.utils.Utils;

public class TextInterface {
	
	
	Utils sc = new Utils();
	ProductRepository PROD_REP_INSTACE = ProductRepository.getInstance();
	shelfRepository SHELF_REP_INSTACE = shelfRepository.getInstance();
	public void start() {
		int option =0;
		do {
			System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Listar produtos\n"
					+ "2) Listar prateleiras\n" + "3) Sair");
			int[] options= {1 ,2 ,3};
			option =sc.getValidInt("selecionar ope�ao", options);
			switch (option) {
			case 1:
				listaProductos();
				break;
			case 2:
				listashelves();
				break;
			case 3:
				System.out.println("adeus");
				System.exit(0);
				break;

			}
		} while (option!=3);
	}

	public void listaProductos() {
		
		do {
			System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Criar novo produto\n"
					+ "2) Editar um produto existente\n" + "3) Consultar o detalhe de um produto\n"
					+ "4) Remover um produto\n" + "5) Voltar ao ecrã anterior");
			switch (sc.getValidInt("1 a 5", 1, 5)) {
			case 1:
				if (SHELF_REP_INSTACE.isEmpty()) {
					System.out.println("cria uma prateleira");
					return;
				}
				PROD_REP_INSTACE.addEntity(addProduct());
				break;

			case 2:
				
				PROD_REP_INSTACE.editEntity(sc.getInt("Id do producto"),addProduct());
				break;
			case 3:
				System.out.println(PROD_REP_INSTACE.getEntity(sc.getInt("Id do producto")));
				break;
			case 4:
				PROD_REP_INSTACE.removeEntity(sc.getInt("Id do producto"));
				break;
			case 5:
				return;
				
			}
		} while (true);
	}
	int[]ivas= {23, 13, 6};
	private Products addProduct() {
		Products product = new Products() ;
			product.setNome(sc.getValue("Nome do producto"));
			int discount = sc.getInt("Colocar disconto(%):");
			product.setDiscount(discount);
			int iva = sc.getValidInt("Colocar iva(%):",ivas);
			product.setIva(iva);
			float initPrice = sc.getFloat("colocar preco inicial");
			product.setInitprice(initPrice);
			float pvp = calcoloPvp(discount,iva,initPrice);
			product.setPvp(pvp);
//			product.setShelvesId();
//			System.out.println(product);
			return product;
	}
	
	private float calcoloPvp (int discount,int iva,float initPrice) {
		float pv = initPrice*(1 + (float) iva/100);
		float discount1 = pv*(1* (float)discount/100);
		float pvp =pv - discount1;
		return pvp;
	}
	
	
	
	
	
	public void listashelves() {
		shelfRepository PROD_REP_INSTACE = shelfRepository.getInstance();
		do {
			System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Criar shelves\n"
					+ "2) Editar shelves existente\n" + "3) Consultar shelves\n"
					+ "4) Remover um shelves\n" + "5) Voltar ao ecrã anterior");
			switch (sc.getValidInt("1 a 5", 1, 5)) {
			case 1:
				
				break;

			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				return;
				
			}
		} while (true);
	}
}
