package az.developia.studentcrud.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserModel {
	@Id
	private String username;

	private String password;

	private Boolean enabled;

}
