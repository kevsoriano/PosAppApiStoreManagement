	package com.jkngil.PosAppApiStoreManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkngil.PosAppApiStoreManagement.data.StoreEntity;
import com.jkngil.PosAppApiStoreManagement.data.StoreRepository;
import com.jkngil.PosAppApiStoreManagement.shared.OutletDto;
import com.jkngil.PosAppApiStoreManagement.shared.RegisterDto;
import com.jkngil.PosAppApiStoreManagement.shared.StoreDto;

@Service
public class StoreServiceImpl implements StoreService {
	StoreRepository storeRepository;
	
	@Autowired
	public StoreServiceImpl(StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}

	@Override
	public StoreDto createStore(StoreDto storeDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		for(int i=0; i<storeDetails.getOutlets().size();i++) {
			OutletDto outlet = storeDetails.getOutlets().get(i);
			outlet.setStoreDetails(storeDetails);
			
			for(int j=0;j<outlet.getRegisters().size();j++) {
				RegisterDto register = outlet.getRegisters().get(j);
				register.setOutletDetails(outlet);
				outlet.getRegisters().set(i, register);
			}
			storeDetails.getOutlets().set(i, outlet);
		}
		
		StoreEntity storeEntity = modelMapper.map(storeDetails, StoreEntity.class);
		StoreEntity createdStore = storeRepository.save(storeEntity);
		
		StoreDto returnValue = modelMapper.map(createdStore, StoreDto.class);
		return returnValue;
	}

	@Override
	public List<StoreDto> listStores() {
		List<StoreDto> returnValue = new ArrayList<>();
		List<StoreEntity> stores = new ArrayList<>();
		storeRepository.findAll().forEach(stores::add);
		
		for(StoreEntity storeEntity:stores) {
			ModelMapper modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			
			StoreDto storeDto = modelMapper.map(storeEntity, StoreDto.class);
			returnValue.add(storeDto);
		}
		return returnValue;
	}

	@Override
	public StoreDto getStore(long storeId) {
		// TODO Auto-generated method stub
		return null;
	}
}
