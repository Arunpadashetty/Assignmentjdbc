package com.gymapp.model;

public class Gym {
	
	private String name;
	private Integer id;
	private String type;
	private int duration;
	public Gym(String name, Integer id, String type, int duration) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Gym [name=" + name + ", id=" + id + ", type=" + type + ", duration=" + duration + "]";
	}
	
	

}
