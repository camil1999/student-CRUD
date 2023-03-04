package az.developia.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.studentcrud.model.AuthorityModel;




public interface AuthRepository extends JpaRepository<AuthorityModel, Integer> {
	
	

}