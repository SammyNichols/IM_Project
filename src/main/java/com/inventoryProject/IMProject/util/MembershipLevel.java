package com.inventoryProject.IMProject.util;

public enum MembershipLevel {
	
	SILVER(.05),
	GOLD(.10),
	DIAMOND(.15),
	PLATIMNUM(.20);
	
	private double discount;
	
	MembershipLevel(double discount) {
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}


}
