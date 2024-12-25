package com.slokam.picgo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.slokam.picgo.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

	@Query("from Address where id=?1")
	public  Address getAddById(Integer id);
	
}
