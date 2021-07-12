package com.mg2.lda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Question;

@Repository
public interface QuestionRepository  extends JpaRepository<Question, Integer>{

	@Query(value = "SELECT count(*) as doc FROM lda.question", nativeQuery = true)
	long count();

	
	@Query(value = "SELECT * FROM lda.question where  status not like 'resolue'", nativeQuery = true)
	List<Question> getNoneAnswerd();


}
