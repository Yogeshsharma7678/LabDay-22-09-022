/* laptop class with 
    attributes
 */
package com.HibernateSlot1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {
	
	@Id
	private int laptopId;
	
	private String laptopModel;
	
	private String laptopCompany;
	
	private int laptopGen;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopModel() {
		return laptopModel;
	}

	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}

	public String getLaptopCompany() {
		return laptopCompany;
	}

	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}

	public int getLaptopGen() {
		return laptopGen;
	}

	public void setLaptopGen(int laptopGen) {
		this.laptopGen = laptopGen;
	}

	@Override
	public String toString() {
		return "laptop [laptopId=" + laptopId + ", laptopModel=" + laptopModel + ", laptopCompany=" + laptopCompany
				+ ", laptopGen=" + laptopGen + "]";
	}
	

}
