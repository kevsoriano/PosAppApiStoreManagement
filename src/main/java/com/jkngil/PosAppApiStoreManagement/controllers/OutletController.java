package com.jkngil.PosAppApiStoreManagement.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkngil.PosAppApiStoreManagement.models.OutletDetailsModel;
import com.jkngil.PosAppApiStoreManagement.services.OutletService;
import com.jkngil.PosAppApiStoreManagement.shared.OutletDto;

@RestController
@RequestMapping("/outlets")
public class OutletController {

	@Autowired
	OutletService outletService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<OutletDetailsModel> getOutlet(@PathVariable long id) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		OutletDto outletDto = outletService.getOutlet(id);
		OutletDetailsModel returnValue = modelMapper.map(outletDto, OutletDetailsModel.class);
		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	}
	
	@GetMapping
	public ResponseEntity<List<OutletDetailsModel>> listOutlets() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<OutletDetailsModel> returnValue = new ArrayList<>();
		List<OutletDto> outlets = outletService.listOutlets();
		
		for(OutletDto outlet: outlets) {
			OutletDetailsModel outletDetails = modelMapper.map(outlet, OutletDetailsModel.class);
			returnValue.add(outletDetails);
		}
		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	}
	
//	TODO: might need a method for returning a list of outlets that a list of user has access to or has inventory for a product
}
