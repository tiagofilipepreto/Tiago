package io.altar.jseproject.Business;

import java.util.Collection;
import java.util.List;

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
		SHELF_REP_INSTACE.removeEntity(Id);
		
	}
	@Override
	public void update(Shelfes t) {
		SHELF_REP_INSTACE.editEntity(t);
		
	}
	@Override
	public boolean isEmpty() {
		return SHELF_REP_INSTACE.isEmpty();
	}
	
	@Override
	public Collection<Long> getAllIDs() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long[] geAllIdsarray() {
		return SHELF_REP_INSTACE.geAllIdsarray();
	}
	@Override
	public void updateProductsId(List<Long> shelvesIdAntigos, List<Long> shelvesIdNovos, long id) {
		for(long sid : shelvesIdNovos){
			Shelfes shelves=SHELF_REP_INSTACE.getEntity(sid);
			shelves.setProductId(id);
			SHELF_REP_INSTACE.editEntity(shelves);
		
	}

	

}}
