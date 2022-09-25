/* student entity 
    & atttributes and 
    joining with laptop
    
 */
package com.HibernateSlot1;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class student {
    @Id
    private int sId;
    private String sName;
	private String sDomain;
	private int sMarks;
	
	@OneToMany
	@JoinColumn(name = "stId")
	private List<laptop> lp;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsDomain() {
		return sDomain;
	}

	public void setsDomain(String sDomain) {
		this.sDomain = sDomain;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	public List<laptop> getLp() {
		return lp;
	}

	public void setLp(List<laptop> lp) {
		this.lp = lp;
	}

	@Override
	public String toString() {
		return "student [sId=" + sId + ", sName=" + sName + ", sDomain=" + sDomain + ", sMarks=" + sMarks + ", lp=" + lp
				+ "]";
	}

}
