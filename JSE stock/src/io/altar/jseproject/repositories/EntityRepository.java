package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Products;

public abstract class EntityRepository<T extends Entity> {
	Map<Long, T> myMap= new HashMap<Long,T>();
	long maxId =0;
	

	public void addEntity(T t) {
		t.setId(maxId);
		myMap.put(maxId, t);
		maxId++;
	};
	private long getNextId() {
		return maxId +1;
	}
	
	public void removeEntity(long Id) {
		myMap.remove(Id);
	}; 
	
	public void removeEntity(T t) {
		myMap.remove(t.getId(), t);
	}; 
	
	
	public boolean isEmpty() {
		return (myMap.size() == 0)?true:false;
	}
	
	public Collection<T> getAll(){
		return myMap.values();
	}
	
	public T getEntity(long Id) {
		return  myMap.get(Id) ;
	}
	
	public void editEntity(long id, T t) {
		myMap.replace(id, t);
	}
	public void editEntity( T t) {
		myMap.replace(t.getId(), t);
	}
	
//	public Collection<Long> geAllIds(){
//		return myMap.keySet();
//	}
	
	public long[] geAllIds(){
		return myMap.keySet().stream().mapToLong(l -> l).toArray();
	}
	public void printAll() {
		Iterator<T> prodInterator = getAll().iterator();
		while (prodInterator.hasNext()) {
			T t = (T) prodInterator.next();
			System.out.println(t);
		}
	}
	
	
	
	
	
	
	}
