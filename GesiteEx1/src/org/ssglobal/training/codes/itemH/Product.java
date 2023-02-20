package org.ssglobal.training.codes.itemH;

class Product {
	public String prodName;
	public int prodQty;

	public void downLoad(int i) {
		prodQty += i;
	}

	public void upLoad(int i) {
		prodQty -= i;
	}

	public String print() {
		return "\"" + prodName + ", " + prodQty + "pieces\"";
	}
}