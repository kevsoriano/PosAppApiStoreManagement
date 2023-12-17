package com.jkngil.PosAppApiStoreManagement.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "registers")
public class RegisterEntity implements Serializable {

	private static final long serialVersionUID = -6886899541318698254L;
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 15, nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "outlet_id")
	private OutletEntity outletDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OutletEntity getOutletDetails() {
		return outletDetails;
	}

	public void setOutletDetails(OutletEntity outletDetails) {
		this.outletDetails = outletDetails;
	}

}
