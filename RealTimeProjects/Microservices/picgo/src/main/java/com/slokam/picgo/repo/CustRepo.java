package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.Cust;
				@Repository
				public interface CustRepo extends JpaRepository<Cust, Integer> {

				}
