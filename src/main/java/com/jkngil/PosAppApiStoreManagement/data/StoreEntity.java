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
import jakarta.persistence.OneToMany;

@Entity(name = "stores")
public class StoreEntity implements Serializable {

	private static final long serialVersionUID = 5956967202200741559L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String name;
	@OneToMany(mappedBy="storeDetails", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<OutletEntity> outlets;

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

	public List<OutletEntity> getOutlets() {
		return outlets;
	}

	public void setOutlets(List<OutletEntity> outlets) {
		this.outlets = outlets;
	}

}
