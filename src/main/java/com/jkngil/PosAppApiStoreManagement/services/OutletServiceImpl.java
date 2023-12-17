package com.jkngil.PosAppApiStoreManagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkngil.PosAppApiStoreManagement.data.OutletEntity;
import com.jkngil.PosAppApiStoreManagement.data.OutletRepository;
import com.jkngil.PosAppApiStoreManagement.shared.OutletDto;

@Service
public class OutletServiceImpl implements OutletService {
	
	@Autowired
	OutletRepository outletRepository;

	@Override
	public OutletDto createOutlet(OutletDto outletDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return null;
	}

	@Override
	public List<OutletDto> listOutlets() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		List<OutletDto> returnValue = new ArrayList<>();
		List<OutletEntity> outlets = new ArrayList<>();
		outletRepository.findAll().forEach(outlets::add);
		
		for(OutletEntity outlet: outlets) {
			OutletDto outletDto = modelMapper.map(outlet, OutletDto.class);
			
			returnValue.add(outletDto);
		}
		
		return returnValue;
	}

	@Override
	public OutletDto getOutlet(long outletId) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Optional<OutletEntity> optionalOutlet = outletRepository.findById(outletId);
		OutletEntity outletEntity = optionalOutlet.get();
		
		OutletDto returnValue = modelMapper.map(outletEntity, OutletDto.class);
		
		return returnValue;
	}

}
