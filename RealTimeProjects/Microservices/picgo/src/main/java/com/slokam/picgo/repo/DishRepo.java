package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.Dish;
				@Repository
				public interface DishRepo extends JpaRepository<Dish, Integer> {

				}
