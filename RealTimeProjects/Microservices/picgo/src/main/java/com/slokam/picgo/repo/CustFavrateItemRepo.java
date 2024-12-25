package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.CustFavrateItem;
				@Repository
				public interface CustFavrateItemRepo extends JpaRepository<CustFavrateItem, Integer> {

				}
