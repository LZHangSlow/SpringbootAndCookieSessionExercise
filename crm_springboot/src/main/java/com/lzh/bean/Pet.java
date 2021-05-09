package com.lzh.bean;

import org.springframework.stereotype.Component;



@Component
public class Pet {
	private String name;
    private Double weight;
    
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, Double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", weight=" + weight + "]";
	}
    
}
