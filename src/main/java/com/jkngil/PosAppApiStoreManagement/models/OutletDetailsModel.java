package com.jkngil.PosAppApiStoreManagement.models;

import java.util.List;

public class OutletDetailsModel {
	private long id;
	private String name;
	private List<RegisterDetailsModel> registers;

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

	public List<RegisterDetailsModel> getRegisters() {
		return registers;
	}

	public void setRegisters(List<RegisterDetailsModel> registers) {
		this.registers = registers;
	}

}
