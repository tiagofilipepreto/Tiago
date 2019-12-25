package io.altar.jseproject.Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import io.altar.jseproject.model.Shelfes;


public class BusinessShelf implements BusinessShelfInterface {

	public static final BusinessProducts BUSINESS_PRODUCTS = new BusinessProducts();

	@Override
	public void create(Shelfes t) {
		SHELF_REP_INSTACE.addEntity(t);
		
	}
	@Override
	public Shelfes read(long id) {
		return SHELF_REP_INSTACE.getEntity(id);
	}

	@Override
	public void delete(long Id) {
		long idProduct =read(Id).getProductId();
		BUSINESS_PRODUCTS.updateProductsId(Id,0,idProduct);
		SHELF_REP_INSTACE.removeEntity(Id);
		
		
	}
	@Override
	public void update(Shelfes t) {
		 long ProductIdAntigo = read(t.getId()).getProductId();
		BUSINESS_PRODUCTS.updateProductsId(t.getId(),t.getProductId(),ProductIdAntigo);
		SHELF_REP_INSTACE.editEntity(t);
		
	}
	@Override
	public boolean isEmpty() {
		return SHELF_REP_INSTACE.isEmpty();
	}
	
	@Override
	public Collection<Long> getAllIDs() {
		return null;
	}
	@Override
	public long[] geAllIdsarray() {
		return SHELF_REP_INSTACE.geAllIdsarray();
	}
	@Override
	public void updateProductsId(List<Long> shelvesIdAntigos, List<Long> shelvesIdNovos, long id) {
		for(long did : shelvesIdAntigos){
			Shelfes shelvesIdDelete=SHELF_REP_INSTACE.getEntity(did);
			shelvesIdDelete.setProductId(0);
			SHELF_REP_INSTACE.editEntity(shelvesIdDelete);
		
		}
		for(long sid : shelvesIdNovos){
			Shelfes shelvesIdAdd=SHELF_REP_INSTACE.getEntity(sid);
			shelvesIdAdd.setProductId(id);
			SHELF_REP_INSTACE.editEntity(shelvesIdAdd);
		}

	
	}
	
	public ArrayList<Long> getshelvesId() {
		return  SHELF_REP_INSTACE.getShelfCenas();
		
	}
	
	@Override
	public void printaAll() {
		SHELF_REP_INSTACE.printAll();
		
	}
}
