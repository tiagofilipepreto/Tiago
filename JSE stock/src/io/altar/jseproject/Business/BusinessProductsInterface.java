package io.altar.jseproject.Business;

import io.altar.jseproject.model.Products;
import io.altar.jseproject.repositories.ProductRepository;

public interface BusinessProductsInterface extends BusinesssInterface<Products> {
	ProductRepository PROD_REP_INSTACE = ProductRepository.getInstance();
	void updateProductsId(long ShelfeId, long ProductId);

}
