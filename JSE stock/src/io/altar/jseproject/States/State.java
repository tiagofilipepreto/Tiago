package io.altar.jseproject.States;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.shelfRepository;
import io.altar.jseproject.textinterface.utils.Utils;

public abstract class State {
	
	public static final Utils sc =new Utils();
	ProductRepository PROD_REP_INSTACE = ProductRepository.getInstance();
	shelfRepository SHELF_REP_INSTACE = shelfRepository.getInstance();
	
	public abstract int run();
}
