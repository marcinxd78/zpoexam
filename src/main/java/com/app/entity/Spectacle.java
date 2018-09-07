package com.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// @NamedQuery(name = "find_all_spectacles", query = "select s from Scpectacle
// s")
public class Spectacle {

	@Id
	@GeneratedValue
	private int id;

	private Date data;
	private String name;
	private Double price;
	private Double cost;

	public Spectacle() {

	}

	public Spectacle(int id, Date data, String name, Double price) {
		super();
		this.id = id;
		this.data = data;
		this.name = name;
		this.price = price;
	}

	public Spectacle(int id, Date data, String name, Double price, Double cost) {
		super();
		this.id = id;
		this.data = data;
		this.name = name;
		this.price = price;
		this.cost = cost;
	}

	public Spectacle(Date data, String name, Double price) {
		super();
		this.data = data;
		this.name = name;
		this.price = price;
	}

	public Date getData() {
		return data;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Spectacle [data=" + data + ", name=" + name + ", price=" + price + "]";
	}

	public double getCost() {
		return cost;
	}
}
