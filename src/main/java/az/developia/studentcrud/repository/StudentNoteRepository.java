package az.developia.studentcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.studentcrud.model.StudentNote;

public interface StudentNoteRepository extends JpaRepository<StudentNote, Integer> {

	
	public List <StudentNote>findAllByStudentId(Integer studentId);
}
