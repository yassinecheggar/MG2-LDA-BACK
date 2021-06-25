package com.mg2.lda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mg2.lda.models.Activite;
import com.mg2.lda.models.Role;

public interface RoleRepository extends JpaRepository<Role , Integer>{


}
