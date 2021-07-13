package com.mg2.lda.repository;

import org.springframework.data.jpa.repository.Query;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mg2.lda.models.Activite;
import com.mg2.lda.models.Role;

public interface RoleRepository extends JpaRepository<Role , Integer>{


	@Query(value = "SELECT * FROM lda.roles where role like ?1", nativeQuery = true)
	Set<Role>  findByRoleName(String name);
}
