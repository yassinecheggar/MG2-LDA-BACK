package com.mg2.lda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mg2.lda.models.Role;
import com.mg2.lda.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	@Query(value ="SELECT * FROM lda.user where  username = ?1",nativeQuery = true)
		User getUserByUsername(String type);

	@Query(value = "select user.username,  user.nom ,  user.prenom , user.id, user.enabled,user.password from lda.users_roles " + 
			" inner join lda.user on user.id =  users_roles.id " + 
			" inner join lda.roles on roles.role_id = users_roles.role_id where roles.role = ?1", nativeQuery = true)
	List<User> findAllByPrevilege(String type);
	
	@Query(value = "SELECT * FROM lda.user where username  = ?1", nativeQuery = true)
		User findByuserName(String type);
	
	
	@Query(value = "select  roles.role  from lda.users_roles  " + 
			" inner join lda.user on user.id =  users_roles.id " + 
			" inner join lda.roles on roles.role_id = users_roles.role_id where username = ?1", nativeQuery = true)
	List<String> findRole(String type);
	
}
 