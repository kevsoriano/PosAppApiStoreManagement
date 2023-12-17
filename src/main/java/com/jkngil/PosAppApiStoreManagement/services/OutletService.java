package com.jkngil.PosAppApiStoreManagement.services;

import java.util.List;

import com.jkngil.PosAppApiStoreManagement.shared.OutletDto;

public interface OutletService {
	OutletDto createOutlet(OutletDto outletDetails);
	List<OutletDto> listOutlets();
	OutletDto getOutlet(long outletId);
}
