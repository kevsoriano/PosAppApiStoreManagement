package com.jkngil.PosAppApiStoreManagement.data;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "outlets")
public class OutletEntity implements Serializable {

	private static final long serialVersionUID = 2329165837850546044L;
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 15, nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "store_id")
	private StoreEntity storeDetails;
	@OneToMany(mappedBy = "outletDetails", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<RegisterEntity> registers;

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

	public StoreEntity getStoreDetails() {
		return storeDetails;
	}

	public void setStoreDetails(StoreEntity storeDetails) {
		this.storeDetails = storeDetails;
	}

	public List<RegisterEntity> getRegisters() {
		return registers;
	}

	public void setRegisters(List<RegisterEntity> registers) {
		this.registers = registers;
	}

}
