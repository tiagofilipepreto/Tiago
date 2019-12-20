package io.altar.jseproject.Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.altar.jseproject.model.Products;


public class BusinessProducts implements BusinessProductsInterface {

	public static final BusinessShelf BUSINESS_SHELVES = new BusinessShelf();

	@Override
	public void create(Products t) {
		PROD_REP_INSTACE.addEntity(t);
		BUSINESS_SHELVES.updateProductsId(new ArrayList<Long>(),t.getShelvesId(),t.getId());
		
	}
	@Override
	public Products read(long id) {
		return PROD_REP_INSTACE.getEntity(id);
	}

	@Override
	public void delete(long Id) {
		 List <Long>shelvesIdAntigos = read(Id).getShelvesId();
		PROD_REP_INSTACE.removeEntity(Id);
		BUSINESS_SHELVES.updateProductsId(shelvesIdAntigos,new ArrayList<Long>(),Id);
		
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
	public void printaAll() {
		PROD_REP_INSTACE.printAll();
		
	}
	@Override
	public Collection<Long> getAllIDs() {
		return null;
	}
	@Override
	public long[] geAllIdsarray() {
		return PROD_REP_INSTACE.geAllIdsarray();
	}
	@Override
	public void updateProductsId(long ShelfeId, long ProductId) {
		
		
	}
	
}
