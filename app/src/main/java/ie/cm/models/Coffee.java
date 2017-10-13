package ie.cm.models;

import java.io.Serializable;

public class Coffee implements Serializable {

	public int coffeeId;
	public String name, shop;
	public double rating, price;
	public boolean favourite;

	public Coffee() {}

	public Coffee(String name, String shop, double rating, double price, boolean fav) {
		this.name = name;
		this.shop = shop;
		this.rating = rating;
		this.price = price;
		this.favourite = fav;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name
				+ ", shop =" + shop + ", rating=" + rating + ", price=" + price
				+ ", fav =" + favourite + "]";
	}
}
