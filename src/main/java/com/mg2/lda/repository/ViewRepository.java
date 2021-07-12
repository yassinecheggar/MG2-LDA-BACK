package com.mg2.lda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Document;
import com.mg2.lda.models.View;

@Repository
public interface ViewRepository extends JpaRepository<View, Integer>{

	@Query(value = "SELECT typedoc,count(*)  FROM lda.document "
			+ "inner join lda.view on lda.view.visitedid = document.id "
			+ "inner join  lda.type on lda.type.id = document.type_document "
			+ "group by type_document", nativeQuery = true)
	List<?> getDocumentTypeCount();
	
	
	@Query(value = "SELECT   type.typedoc , count(*) from lda.document"
			+ " inner join  lda.type on document.type_document = lda.type.id"
			+ " group by typedoc", nativeQuery = true)
	List<?> getDocumentCountByType();
	

	@Query(value = "SELECT CONCAT(user.nom, ' ', user.prenom) , count(*) FROM lda.view"
			+ " inner join  lda.user on lda.user.id = lda.view.user_visit"
			+ " where visited like 'app'"
			+ "  group by username", nativeQuery = true)
	List<?> GetUsersVisits();
}
