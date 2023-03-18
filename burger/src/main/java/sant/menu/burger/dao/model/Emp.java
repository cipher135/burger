package sant.menu.burger.dao.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP")
public class Emp {
	
	@Id
	@Column(name="CUSTOMER_ID")
	private Integer customerId;
	
	@Column
	private String name;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [customerId=" + customerId + ", name=" + name + "]";
	}
	
}
