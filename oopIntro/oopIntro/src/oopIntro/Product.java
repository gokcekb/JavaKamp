package oopIntro;

public class Product {
	public Product() {
		System.out.println("Ben �al��t�m."); // constructor blo�u, yazmasanda arka planda �al���r.
											//bu imzaya sahip olan product2 ve product3 �al���r.
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this(); //b�yle dersen de yukardaki imza �al���r + 1 ben �al��t�m gelir.
		this.Id = id; // bu class daki id a�a��daki Id dir.
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}

	int Id;
	String name;
	double unitPrice;
	String detail;

}
