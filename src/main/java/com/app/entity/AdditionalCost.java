package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_costs", query = "select c from AdditionalCost c")
public class AdditionalCost {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private Double price;
	@ManyToOne
	@JoinColumn(name = "spectacle_id")
	private Spectacle spectacle;

	public AdditionalCost(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Spectacle getSpectacle() {
		return spectacle;
	}

	public void setSpectacle(Spectacle spectacle) {
		this.spectacle = spectacle;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "AdditionalCost [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	// @Override
	// public String toString() {
	// return "AdditionalCost [name=" + name + ", price=" + price + ", spectacle=" +
	// spectacle + "]";
	// }

}
