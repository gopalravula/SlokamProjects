package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.RstBranch;
				@Repository
				public interface RstBranchRepo extends JpaRepository<RstBranch, Integer> {

				}
