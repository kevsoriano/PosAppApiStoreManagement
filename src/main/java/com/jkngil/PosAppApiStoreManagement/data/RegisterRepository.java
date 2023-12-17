package com.jkngil.PosAppApiStoreManagement.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends CrudRepository<RegisterEntity, Long> {

}
