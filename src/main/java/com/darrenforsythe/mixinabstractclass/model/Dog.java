package com.darrenforsythe.mixinabstractclass.model;

public class Dog extends Animal {

	private String breed;
	private String leeshColor;

	public String getLeeshColor() {
		return leeshColor;
	}

	public void setLeeshColor(String leeshColor) {
		this.leeshColor = leeshColor;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((leeshColor == null) ? 0 : leeshColor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (leeshColor == null) {
			if (other.leeshColor != null)
				return false;
		} else if (!leeshColor.equals(other.leeshColor))
			return false;
		return true;
	}

}
