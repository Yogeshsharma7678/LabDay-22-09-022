/* Experienced Employee entity
    & attributes by extending
    employee class
    
 */
package com.HibernateSlot1;

import javax.persistence.Entity;

@Entity
public class experienceEmp extends employee{

	private String experience;
	private int Hike;

	@Override
	public String toString() {
		return "experienceEmp [experience=" + experience + ", Hike=" + Hike + ", toString()=" + super.toString()
				+ "]";
	}
	
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getHike() {
		return Hike;
	}
	public void setHike(int hike) {
		Hike = hike;
	}

}
