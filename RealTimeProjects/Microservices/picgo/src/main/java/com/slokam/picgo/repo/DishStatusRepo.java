package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.DishStatus;
				@Repository
				public interface DishStatusRepo extends JpaRepository<DishStatus, Integer> {

				}
