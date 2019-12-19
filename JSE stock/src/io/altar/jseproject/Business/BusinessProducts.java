package io.altar.jseproject.Business;

import java.util.Collection;
import java.util.List;

import io.altar.jseproject.model.Products;


public class BusinessProducts implements BusinessProductsInterface {

	public static final BusinessShelf BUSINESS_SHELVES = new BusinessShelf();

	@Override
	public void create(Products t) {
		PROD_REP_INSTACE.addEntity(t);
		BUSINESS_SHELVES.updateProductsId(new List<Long>(),t.getShelvesId(),t.getId());
		
	}
	@Override
	public Products read(long id) {
		return PROD_REP_INSTACE.getEntity(id);
	}

	@Override
	public void delete(long Id) {
		PROD_REP_INSTACE.removeEntity(Id);
		
		
	}
	@Override
	public void update(Products t) {
		long id = t.getId();
		 List <Long>shelvesIdAntigos = read(id).getShelvesId();
		PROD_REP_INSTACE.editEntity(t);
		BUSINESS_SHELVES.updateProductsId(shelvesIdAntigos,t.getShelvesId(),t.getId());
	}
	@Override
	public boolean isEmpty() {
		return PROD_REP_INSTACE.isEmpty();
	}
	@Override
	public void addShelvesId(long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Collection<Long> getAllIDs() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long[] geAllIdsarray() {
		return PROD_REP_INSTACE.geAllIdsarray();
	}
	
}
