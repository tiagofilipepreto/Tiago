package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Products;
import io.altar.jseproject.model.Shelfes;
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
				PROD_REP_INSTACE.printAll();
				break;
			case 2:
				listashelves();
				SHELF_REP_INSTACE.printAll();
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
				PROD_REP_INSTACE.addEntity(addProduct());
				break;

			case 2:
				if(PROD_REP_INSTACE.isEmpty()) {
					System.out.println("Nao tem Productos");
					break;
				}
				Products product= PROD_REP_INSTACE.getEntity(sc.getValidLong("Id do producto",PROD_REP_INSTACE.geAllIds()));
				System.out.println("Nome do Producto: "+product.getNome());
				String nome =sc.getValue("Novo nome do producto");
				product.setNome(nome.isEmpty()? product.getNome():nome);
				
				System.out.println("Disconto(%) actual: "+product.getDiscount());
				int discount = sc.getInt("Colocar novo disconto(%):");
				product.setDiscount(discount==-1?product.getDiscount():discount);
				
				System.out.println("Iva(%) actual:"+product.getIva());
				int iva = sc.getValidInt("Colocar iva(%):",ivas);
				product.setIva(iva==-1?product.getIva():iva);
				
				System.out.println("preco inicial:"+product.getInitprice());
				float initPrice = sc.getFloat("colocar novo preco inicial",true);
				product.setInitprice(initPrice==-1?product.getInitprice():initPrice);
				
				float pvp = calcoloPvp(product.getDiscount(),product.getIva(),product.getInitprice());
				product.setPvp(pvp);
				
				PROD_REP_INSTACE.editEntity(product);
				
				break;
			case 3:
				if(PROD_REP_INSTACE.isEmpty()) {
					System.out.println("Nao tem Productos");
					break;
				}
				System.out.println(PROD_REP_INSTACE.getEntity(sc.getValidLong("Id do producto",PROD_REP_INSTACE.geAllIds())));
				break;
			case 4:
				if(PROD_REP_INSTACE.isEmpty()) {
					System.out.println("Nao tem Productos");
					break;
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
			product.setDiscount(discount==-1?0:discount);
			int iva = sc.getValidInt("Colocar iva(%):",ivas);
			product.setIva(iva);
			float initPrice = sc.getFloat("colocar preco inicial",false);
			product.setInitprice(initPrice);
			float pvp = calcoloPvp(discount,iva,initPrice);
			product.setPvp(pvp);
			return product;
	}
	
	private float calcoloPvp (int discount,int iva,float initPrice) {
		float pv = initPrice*(1 + (float) iva/100);
		float discount1 = pv*(1* (float)discount/100);
		float pvp =pv - discount1;
		return pvp;
	}
	
//	private List<Long> addshelvesId(){
//		
//	};
	
	
	
	
	public void listashelves() {
		do {
			System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Criar shelves\n"
					+ "2) Editar shelves existente\n" + "3) Consultar shelves\n"
					+ "4) Remover um shelves\n" + "5) Voltar ao ecrã anterior");
			switch (sc.getValidInt("1 a 5", 1, 5)) {
			case 1:
				SHELF_REP_INSTACE.addEntity(addShelves());
				break;

			case 2:
				if(SHELF_REP_INSTACE.isEmpty()) {
					System.out.println("Nao tem prateleiras");
					break;
				}
				SHELF_REP_INSTACE.editEntity(sc.getInt("Id da Shelf"), addShelves());
				break;
			case 3:
				if(SHELF_REP_INSTACE.isEmpty()) {
					System.out.println("Nao tem prateleiras");
					break;
				}
				System.out.println(SHELF_REP_INSTACE.getAll()); 
				break;
			case 4:
				if(SHELF_REP_INSTACE.isEmpty()) {
					System.out.println("Nao tem prateleiras");
					break;
				}
				long remove =sc.getValidLong("Id do producto",SHELF_REP_INSTACE.geAllIds());
				switch (sc.getValidInt("remover:\\n 1) sim \\n 0)nao", 0, 1)) {
				case 0:
					break;
				case 1:
					SHELF_REP_INSTACE.removeEntity(remove);
					break;
				}
				break;
			case 5:
				return;
				
			}
		} while (true);
	}
	private Shelfes addShelves() {
		int capacidade= sc.getInt("Colocar capacidade da shelf:");
		float dailyPrice=sc.getInt("Colocar pre�o diario:");
		Shelfes shelves = new Shelfes(capacidade,dailyPrice) ;
		return shelves;
		
	}
}
