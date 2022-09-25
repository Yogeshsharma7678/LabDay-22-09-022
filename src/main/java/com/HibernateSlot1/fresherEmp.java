/* fresherEmployee entity 
    & attributes by extending
    employee class
    
 */
package com.HibernateSlot1;

import javax.persistence.Entity;

@Entity
public class fresherEmp extends employee {

	private String contractPeriod;
    private int	Increment;
   
    @Override
	public String toString() {
		return "fresherEmp [contractPeriod=" + contractPeriod + ", Increment=" + Increment + ", toString()="
				+ super.toString() + "]";
	}
	public String getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public int getIncrement() {
		return Increment;
	}
	public void setIncrement(int increment) {
		Increment = increment;
	}
	
}
