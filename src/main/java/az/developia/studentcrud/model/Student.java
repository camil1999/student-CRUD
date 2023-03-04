package az.developia.studentcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message = "Adı boş qoymaq olmaz")
	@Size(min = 2, message = "Minimum 2 simvol yazılmalıdır!")
	@Size(max = 30, message = "Maksimum 30 simvol yazılmalıdır!")
	private String name;
	@NotEmpty(message = "Soyadı boş qoymaq olmaz")
	@Size(min = 2, message = "Minimum 2 simvol yazılmalıdır!")
	@Size(max = 30, message = "Maksimum 30 simvol yazılmalıdır!")
	private String surname;
	private String teacher;
	private String profilePhoto;

}
