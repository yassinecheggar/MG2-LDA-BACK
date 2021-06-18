package com.mg2.lda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mg2.lda.models.Document;


@Repository
public interface DocumentRepository  extends JpaRepository<Document, Integer>{

	@Query(value = "SELECT * FROM lda.document  where  trainning ='no'", nativeQuery = true)
	List<Document> findNoneTrainningDos();
	
	
	@Query(value = "SELECT * FROM lda.document  where  trainning ='yes'", nativeQuery = true)
	List<Document> findTrainningDos();

}
