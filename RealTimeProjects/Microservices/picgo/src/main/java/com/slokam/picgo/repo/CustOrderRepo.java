package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.CustOrder;
				@Repository
				public interface CustOrderRepo extends JpaRepository<CustOrder, Integer> {

				}
