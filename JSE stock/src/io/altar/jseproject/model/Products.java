package io.altar.jseproject.model;
import java.util.ArrayList;
import java.util.List;

public class Products extends Entity {

	private int discount;
	private int iva;
	private float pvp;
	private List <Long> shelvesId = new ArrayList<Long>();
	
	
	
	
	public Products() {}


	public Products(int discount, int iva, float pvp) {
		super();
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}


	public Products(int discount, int iva, float pvp, List<Long> shelvesId) {
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
		this.shelvesId = shelvesId;
	}
	
	

	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public List<Long> getShelvesId() {
		return shelvesId;
	}
	public void setShelvesId(List<Long> shelvesId) {
		this.shelvesId = shelvesId;
	}
//	public void addshelvesID(long shelfId) {
//		this.ShelvesId.add(shelfId);
//	}
//	public void removeshelvesID(long shelfId) {
//		this.ShelvesId.remove(shelfId);
//	}


	@Override
	public String toString() {
		return "Products [discount=" + discount + ", iva=" + iva + ", pvp=" + pvp + ", shelvesId="
				+ shelvesId + "]";
	}
	
	
	
	
	
	
}
