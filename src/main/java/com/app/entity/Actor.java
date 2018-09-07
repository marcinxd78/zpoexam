package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity //encja implementacja JPA
@NamedQuery(name = "find_all_actors", query = "select a from Actor a") //statyczny mechanizm zapytan do bazy danych 
public class Actor {

	@Id //pole jest unikalnym indetyfikatorem obiektu primary key encji
	@GeneratedValue //inkrementacja wartości AUTO-INCREMENT
	private int id;

	private String name;
	private String surname;
	private int salary;
	@ManyToOne //połączenia
	@JoinColumn(name = "spectacle_id")  //określa jak ma wygladac kolumna w bazie danych która odpowiada za tę relację
	private Spectacle spectacle;

	public Actor() {

	}

	public Actor(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public Actor(int id, String name, String surname, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public Actor(int id, String name, String surname, int salary, Spectacle spectacle) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.spectacle = spectacle;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getSalary() {
		return salary;
	}

	@Override //implementacja metod z interfejsu
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}

	public Spectacle getSpectacle() {
		return spectacle;
	}

	public void setSpectacle(Spectacle spectacle) {
		this.spectacle = spectacle;
	}

	// @Override
	// public String toString() {
	// return "Actor [id=" + id + ", name=" + name + ", surname=" + surname + ",
	// salary=" + salary + ", spectacle="
	// + spectacle + "]";
	// }

}
