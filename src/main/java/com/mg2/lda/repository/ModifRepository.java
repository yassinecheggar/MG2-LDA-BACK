package com.mg2.lda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Modif;

@Repository
public interface ModifRepository  extends JpaRepository<Modif, Integer>{

	@Query(value = "SELECT * FROM lda.modif WHERE DATE(date_modification) > (NOW() - INTERVAL 7 DAY)", nativeQuery = true)
	List<Modif> findlastMod();
	
	@Query(value = "SELECT * FROM lda.modif WHERE DATE(date_modification) > (NOW() - INTERVAL 7 DAY) and  document_mod=?1", nativeQuery = true)
	Modif findlastModWithUd(Integer id);

}
