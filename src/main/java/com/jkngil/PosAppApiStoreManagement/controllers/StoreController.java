package com.jkngil.PosAppApiStoreManagement.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkngil.PosAppApiStoreManagement.models.StoreDetailsModel;
import com.jkngil.PosAppApiStoreManagement.services.StoreService;
import com.jkngil.PosAppApiStoreManagement.shared.StoreDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/stores")
public class StoreController {

	@Autowired
	StoreService storeService;
	
	@PostMapping
	public ResponseEntity<StoreDetailsModel> createStore(@Valid @RequestBody StoreDetailsModel storeDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		StoreDto storeDto = modelMapper.map(storeDetails, StoreDto.class);
		StoreDto createdStore = storeService.createStore(storeDto);
		
		StoreDetailsModel returnValue = modelMapper.map(createdStore, StoreDetailsModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
}
