package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Products;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.shelfRepository;
import io.altar.jseproject.textinterface.utils.Utils;

public class TextInterface {
	
	
	Utils sc = new Utils();

	public void start() {
		int option =0;
		do {
			System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Listar produtos\n"
					+ "2) Listar prateleiras\n" + "3) Sair");
			int[] options= {1 ,2 ,3};
			option =sc.getValidInt("selecionar opeçao", options);
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
		ProductRepository PROD_REP_INSTACE = ProductRepository.getInstance();
		do {
			System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Criar novo produto\n"
					+ "2) Editar um produto existente\n" + "3) Consultar o detalhe de um produto\n"
					+ "4) Remover um produto\n" + "5) Voltar ao ecrã anterior");
			switch (sc.getValidInt("1 a 5", 1, 5)) {
			case 1:
				PROD_REP_INSTACE.addEntity(addProduct());
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
	int[]ivas= {23, 13, 6};
	private Products addProduct() {
		Products product = new Products() ;
			product.setDiscount(sc.getInt("Colocar disconto(%):"));
			product.setIva(sc.getValidInt("Colocar iva(%):",ivas));
			product.setInitprice(sc.getFloat("colocar preco iniciar"));
			
			return product;
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
