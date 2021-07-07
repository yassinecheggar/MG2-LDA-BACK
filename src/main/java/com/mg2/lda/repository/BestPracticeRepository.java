package com.mg2.lda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.BestPractice;

@Repository
public interface BestPracticeRepository  extends JpaRepository<BestPractice, Integer>{

	@Query(value = "SELECT count(*) as doc FROM lda.best_practice", nativeQuery = true)
	long count();

}
