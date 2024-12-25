package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.OrderStatus;
				@Repository
				public interface OrderStatusRepo extends JpaRepository<OrderStatus, Integer> {

				}
