package com.mg2.lda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Activite;
import com.mg2.lda.models.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse, Integer>{

}
