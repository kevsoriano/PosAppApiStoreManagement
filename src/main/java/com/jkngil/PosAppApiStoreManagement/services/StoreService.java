package com.jkngil.PosAppApiStoreManagement.services;

import java.util.List;

import com.jkngil.PosAppApiStoreManagement.shared.StoreDto;

public interface StoreService {
	StoreDto createStore(StoreDto storeDetails);
	StoreDto getStore(long storeId);
	List<StoreDto> listStores();
}
