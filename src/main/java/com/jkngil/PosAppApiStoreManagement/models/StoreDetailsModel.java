package com.jkngil.PosAppApiStoreManagement.models;

import java.util.List;

public class StoreDetailsModel {
	private long id;
	private String name;
	private List<OutletDetailsModel> outlets;

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

	public List<OutletDetailsModel> getOutlets() {
		return outlets;
	}

	public void setOutlets(List<OutletDetailsModel> outlets) {
		this.outlets = outlets;
	}

}
