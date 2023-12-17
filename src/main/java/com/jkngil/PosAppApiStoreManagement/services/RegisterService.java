package com.jkngil.PosAppApiStoreManagement.services;

import java.util.List;

import com.jkngil.PosAppApiStoreManagement.shared.RegisterDto;

public interface RegisterService {
	RegisterDto createRegister(RegisterDto registerDetails);
	RegisterDto getRegister(long number);
	List<RegisterDto> listRegisters();
}
