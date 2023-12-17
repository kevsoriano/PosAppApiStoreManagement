package com.jkngil.PosAppApiStoreManagement.shared;

import java.io.Serializable;
import java.util.List;

public class OutletDto implements Serializable {

	private static final long serialVersionUID = -1132165105076342967L;
	private long id;
	private String name;
	private StoreDto storeDetails;
	private List<RegisterDto> registers;

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

	public List<RegisterDto> getRegisters() {
		return registers;
	}

	public void setRegisters(List<RegisterDto> registers) {
		this.registers = registers;
	}

	public StoreDto getStoreDetails() {
		return storeDetails;
	}

	public void setStoreDetails(StoreDto storeDetails) {
		this.storeDetails = storeDetails;
	}

}
