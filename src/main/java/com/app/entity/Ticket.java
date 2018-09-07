package com.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_tickets", query = "select t from Ticket t")
public class Ticket {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String surname;
	@ManyToOne
	@JoinColumn(name = "spectacle_id")
	private Spectacle spectacle;
	private Date date_buy;

	public Ticket() {

	}

	public Ticket(String name, String surname, Date date_buy) {
		super();
		this.name = name;
		this.surname = surname;
		this.date_buy = date_buy;
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

	public String getSurname() {
		return surname;
	}

	public Date getDate_buy() {
		return date_buy;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", surname=" + surname + ", date_buy=" + date_buy + "]";
	}

	// @Override
	// public String toString() {
	// return "Ticket [name=" + name + ", surname=" + surname + ", spectacle=" +
	// spectacle + ", date_buy=" + date_buy
	// + "]";
	// }

}
