package com.jkngil.PosAppApiStoreManagement.shared;

import java.io.Serializable;

public class RegisterDto implements Serializable {

	private static final long serialVersionUID = 1069042546049451158L;
	private long id;
	private String name;
	private OutletDto outletDetails;

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

	public OutletDto getOutletDetails() {
		return outletDetails;
	}

	public void setOutletDetails(OutletDto outletDetails) {
		this.outletDetails = outletDetails;
	}

}
