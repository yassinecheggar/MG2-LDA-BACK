package com.mg2.lda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mg2.lda.models.Document;
import com.mg2.lda.models.Modif;


@Repository
public interface DocumentRepository  extends JpaRepository<Document, Integer>{

	@Query(value = "SELECT * FROM lda.document  where  trainning ='no'", nativeQuery = true)
	List<Document> findNoneTrainningDos();
	
	
	@Query(value = "SELECT * FROM lda.document  where  trainning ='yes'", nativeQuery = true)
	List<Document> findTrainningDos();
	
	@Query(value = "SELECT * FROM lda.document  WHERE DATE(pub_date) > (NOW() - INTERVAL 7 DAY)", nativeQuery = true)
	List<Document> findlastAdded();
	
	@Query(value = "SELECT count(*) as doc FROM lda.document", nativeQuery = true)
	long count();
	
	
}
