package com.jkngil.PosAppApiStoreManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.jkngil.PosAppApiStoreManagement.data.RegisterEntity;
import com.jkngil.PosAppApiStoreManagement.data.RegisterRepository;
import com.jkngil.PosAppApiStoreManagement.shared.RegisterDto;

@Service
public class RegisterServiceImpl implements RegisterService {
	RegisterRepository registerRepository;
	
	@Override
	public RegisterDto createRegister(RegisterDto registerDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		RegisterEntity register = modelMapper.map(registerDetails, RegisterEntity.class);
		RegisterEntity createdRegister = registerRepository.save(register);
		
		RegisterDto returnValue = modelMapper.map(createdRegister, RegisterDto.class);
		return returnValue;
	}

	@Override
	public RegisterDto getRegister(long number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegisterDto> listRegisters() {
		List<RegisterDto> returnValue = new ArrayList<>();
		List<RegisterEntity> registers = new ArrayList<>();
		registerRepository.findAll().forEach(registers::add);
		
		for(RegisterEntity registerEntity:registers) {
			ModelMapper modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			RegisterDto registerDto = modelMapper.map(registerEntity, RegisterDto.class);
			returnValue.add(registerDto);
		}
		return returnValue;
	}

}
