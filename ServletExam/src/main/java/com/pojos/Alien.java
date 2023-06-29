package com.pojos;

public class Alien {

	private int id;
	private String name;
	private String tech;
	
	public Alien() {
		// TODO Auto-generated constructor stub
	}
	
	public Alien(int id, String name, String tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
}
