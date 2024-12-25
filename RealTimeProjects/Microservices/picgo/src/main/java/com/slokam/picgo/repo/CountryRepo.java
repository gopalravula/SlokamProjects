package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.Country;
				@Repository
				public interface CountryRepo extends JpaRepository<Country, Integer> {

				}
