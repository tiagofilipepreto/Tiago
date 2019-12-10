package io.altar.jseproject.model;

public class Shelfes {
	private long id;
	private int capacidade;
	private long productId;
	private float dailyPrice;
	
	
	
	public Shelfes() {
		super();
	}
	
	
	public Shelfes(long id, int capacidade, long productId, float dailyPrice) {
		super();
		this.id = id;
		this.capacidade = capacidade;
		this.productId = productId;
		this.dailyPrice = dailyPrice;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public float getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}


	@Override
	public String toString() {
		return "Shelfes [id=" + id + ", capacidade=" + capacidade + ", productId=" + productId + ", dailyPrice="
				+ dailyPrice + "]";
	}
	

	
	
}
