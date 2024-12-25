package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.BranchDishAvail;
				@Repository
				public interface BranchDishAvailRepo extends JpaRepository<BranchDishAvail, Integer> {

				}
