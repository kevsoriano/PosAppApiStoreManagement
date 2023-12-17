package com.jkngil.PosAppApiStoreManagement.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity, Long>, PagingAndSortingRepository<StoreEntity, Long> {

}
