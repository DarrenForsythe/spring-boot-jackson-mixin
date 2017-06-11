/**
 * 
 */
package com.darrenforsythe.mixinabstractclass.model;

/**
 * @author Darren
 *
 */
public class Cat extends Animal {

	private String favoriteToy;

	public String getFavoriteToy() {
		return favoriteToy;
	}

	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}

	@Override
	public String toString() {
		return "Cat [favoriteToy=" + favoriteToy + ", getName()=" + getName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((favoriteToy == null) ? 0 : favoriteToy.hashCode());
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
		Cat other = (Cat) obj;
		if (favoriteToy == null) {
			if (other.favoriteToy != null)
				return false;
		} else if (!favoriteToy.equals(other.favoriteToy))
			return false;
		return true;
	}

}
