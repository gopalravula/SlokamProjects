package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.Cart;
				@Repository
				public interface CartRepo extends JpaRepository<Cart, Integer> {

				}
