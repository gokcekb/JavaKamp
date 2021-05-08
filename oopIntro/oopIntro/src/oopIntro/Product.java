package oopIntro;

public class Product {
	public Product() {
		System.out.println("Ben çalýþtým."); // constructor bloðu, yazmasanda arka planda çalýþýr.
											//bu imzaya sahip olan product2 ve product3 çalýþýr.
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this(); //böyle dersen de yukardaki imza çalýþýr + 1 ben çalýþtým gelir.
		this.Id = id; // bu class daki id aþaðýdaki Id dir.
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}

	int Id;
	String name;
	double unitPrice;
	String detail;

}
