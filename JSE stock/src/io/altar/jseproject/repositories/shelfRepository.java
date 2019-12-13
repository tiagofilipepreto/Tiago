package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Shelfes;

public class shelfRepository extends EntityRepository<Shelfes> {

private static final shelfRepository INSTANCE = new shelfRepository();
	
	public shelfRepository() {}
	
	public static shelfRepository getInstance() {
		return INSTANCE;
	}
}
