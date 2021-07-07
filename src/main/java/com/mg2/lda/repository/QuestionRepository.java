package com.mg2.lda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Question;

@Repository
public interface QuestionRepository  extends JpaRepository<Question, Integer>{

	@Query(value = "SELECT count(*) as doc FROM lda.question", nativeQuery = true)
	long count();


}
