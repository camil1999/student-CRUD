package az.developia.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.studentcrud.model.UserModel;

	


public interface UserRepository extends JpaRepository<UserModel, String> {
	
	

}