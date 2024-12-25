package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.RstBrand;
				@Repository
				public interface RstBrandRepo extends JpaRepository<RstBrand, Integer> {

				}
