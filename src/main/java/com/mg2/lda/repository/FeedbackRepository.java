package com.mg2.lda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Feedback;

@Repository
public interface FeedbackRepository  extends JpaRepository<Feedback, Integer>{

	@Query(value = "SELECT count(*) as doc FROM lda.feedback", nativeQuery = true)
	long count();
}
