package com.jkngil.PosAppApiStoreManagement.shared;

import java.io.Serializable;
import java.util.List;

public class StoreDto implements Serializable {

	private static final long serialVersionUID = -8355461038553108215L;
	private long id;
	private String name;
	private List<OutletDto> outlets;

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

	public List<OutletDto> getOutlets() {
		return outlets;
	}

	public void setOutlets(List<OutletDto> outlets) {
		this.outlets = outlets;
	}

}
